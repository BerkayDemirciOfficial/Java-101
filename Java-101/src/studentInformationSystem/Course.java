package studentInformationSystem;

public class Course {

    Teacher teacher;
    String name;
    int code;
    String prefix;
    int note = 0;


    Course( String name, int code, String prefix) {

        this.name = name;
        this.code = code;
        this.prefix = prefix;

    }

    void printTeacherInfo(){

        this.teacher.printTeacher();
        System.out.println("Course : "+ name);
        System.out.println("Code : "+ code);
        System.out.println("Prefix : "+ prefix);
    }

    void addTeacher(Teacher teacher){

        if(teacher.branch.equals(this.name)){
            System.out.println("Course teacher matching is successfull");
            this.teacher = teacher;

        }else{
            System.out.println("Mismatch. Try again.");
        }



    }


}


