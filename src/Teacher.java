public class Teacher {
    String name;
    String phone_num ;
    String branch;

    Teacher(String name,String phone_num,String branch){
        this.name=name;
        this.phone_num=phone_num;
        this.branch=branch;
    }

    void print(){
        System.out.println("name: "+ this.name);
        System.out.println("phone num: "+ this.phone_num);
        System.out.println("branch: "+ this.branch);
    }




}
