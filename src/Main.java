public class Main{
    public static void main(String[] args){
        Teacher t1= new Teacher("Gülsüm", "507","hst");
        Teacher t2= new Teacher("Mustafa", "909","chem");
        Teacher t3= new Teacher("leyla","201","bio");

        Courses history= new Courses("history", "101","hst",0,0);
        history.addTeacher(t1);

        Courses phys= new Courses("Phys", "102", "phys",0,0);
        phys.addTeacher(t2);

        Courses bio= new Courses("Bio", "101", "bio",0,0);
        bio.addTeacher(t3);

        Student s1=new Student("Ahmet", "14","4th grade",history, phys,bio);
        s1.addFindExamNote(100,80,50);
        s1.addFindProjectNote(80,70,100);
        //s1.printNotes();
        s1.isPass();

        Student s2= new Student("Mehmet","21","3rd grade",phys,history,bio);
        s2.addFindExamNote(60,70,80);
        s2.addFindProjectNote(90,100,100);
        s2.isPass();


    }
}

