public class Student {


    Course course1;
    Course  course2;
    Course  course3;
    String studentName;
    int studentNo;
    int classes;
    double average;
    boolean isPass;

    Student(String studentName, int studentNo, int classes, Course course1, Course course2, Course course3) {

        this.studentName = studentName;
        this.studentNo = studentNo;
        this.classes = classes;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.average = 0.0;
        this.isPass = false;
    }

    void courseNote(int chemistry, int guidance, int music) {

        if (chemistry >= 0 && chemistry <= 100)
            this.course1.note = chemistry;

        if (guidance >= 0 && guidance <= 100)
            this.course2.note = guidance;

        if (music >= 0 && music <= 100)
            this.course3.note = music;
    }

    void isPass() {

        this.average = (this.course1.note + this.course2.note + this.course2.note) / 3.0;

        if (this.average >= 60) {
            isPass = true;
            System.out.println("You have passed the course.");
        } else {
            System.out.println("You have not passed the course.");
        }
        printNote();
    }

    void printNote() {
        System.out.println(this.course1.name + " Note : " + this.course1.note);
        System.out.println(this.course2.name + " Note : " + this.course2.note);
        System.out.println(this.course3.name + " Note : " + this.course3.note);
        System.out.println("Your average : " + this.average);

    }

}



