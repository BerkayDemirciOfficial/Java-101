public class StudentInformationSystem {

    public static void main(String[] args) {


        Teacher t1 = new Teacher("Berkay", 055555555, "Chemistry");
        Teacher t2 = new Teacher("Melis", 05544444455, "Guidance");
        Teacher t3 = new Teacher("Emin", 05333335555, " Music");


        Course chemstry = new Course("Chemistry", 3999, "chm");
        Course guidace = new Course("Guidance", 38, "gdc");
        Course music = new Course("Music", 8438, "msc");

        chemstry.addTeacher(t1);

        Student student1 = new Student("Öğrenci Berkay", 330489, 3, chemstry, guidace, music);
        Student student2 = new Student("Öğrenci Melis", 330489, 3, chemstry, guidace, music);

        student2.courseNote(80, 100, 100);

        student2.isPass();
        chemstry.printTeacherInfo();
    }
}