public class Courses {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int note_project;

    Courses(String name,String code, String prefix, int note, int note_project){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.note=0;
        this.note_project=0;

    }
    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        }else{
            System.out.println("teacher and branch are not match!");
        }

    }

    void printTeacherInfo(){
        this.teacher.print();
    }



}
