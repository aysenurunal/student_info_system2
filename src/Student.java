public class Student {
    Courses  c1;
    Courses c2;
    Courses c3;
    String name;
    String student_num;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String student_num, String classes, Courses c1,Courses c2,Courses c3){
        this.name= name;
        this.student_num=student_num;
        this.classes= classes;
        this.c1=c1;this.c2=c2;this.c3=c3;
        this.avarage=0.0;
        this.isPass=false;
    }
    void addFindExamNote(int note1, int note2, int note3){
        c1.note=note1;
        c2.note=note2;
        c3.note=note3;
    }
    void addFindProjectNote(int note_project1, int note_project2, int note_project3){
        c1.note_project=note_project1;
        c2.note_project=note_project2;
        c3.note_project=note_project3;
    }
    void isPass(){
        System.out.println("*************");
        this.avarage=((this.c1.note*0.8+this.c1.note_project*0.2)+(this.c2.note*0.8+this.c2.note*0.2)+(this.c3.note*0.8+this.c3.note_project*0.2))/3.0;
        if (avarage >30){
            System.out.println("You passed your class!");
            this.isPass=true;
        }else{
            System.out.println("You failed:(");
            System.out.println(this.avarage);
            this.isPass=false;
        }
        printNotes();
    }

    void printNotes(){
        System.out.println(c1.name + "'s grade: "+ c1.note);
        System.out.println(c2.name + "'s grade: "+ c2.note);
        System.out.println(c3.name + "'s grade: "+ c3.note);
        System.out.println("your avarage: " + this.avarage);
    }


}
