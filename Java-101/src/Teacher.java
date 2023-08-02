public class Teacher {

    String name;
    int phoneNumber;
    String branch;

    Teacher(String name, int phoneNumber, String branch) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.branch = branch;
    }
     void printTeacher() {

        System.out.println("Name : " + this.name);
        System.out.println("Phone Number : " + this.phoneNumber);
        System.out.println("Branch : " + this.branch);
    }


}
