public class TestStudent {
    public static void main(String[] args) {

        GraduateStudent graduateStudent1 = new GraduateStudent
                ("01212063", "Megumin Paulista", 1.5, 8.9);

        PostgraduateStudent postgraduateStudent1 = new PostgraduateStudent
                ("066666666", "Sistine Kawaii", 10.0, 10.0, 5.99);

        ElementaryStudent elementaryStudent1 = new ElementaryStudent
                ("40028922", "Louise Valliere", 9.75, 9.75, 9.75, 9.75);

//        System.out.println(graduateStudent1);
//        System.out.println(postgraduateStudent1);
//        System.out.println(elementaryStudent1);

        School school = new School("E.E. Dr. Sr. Zé Pimont");

        school.addStudent(graduateStudent1);
        school.addStudent(postgraduateStudent1);
        school.addStudent(elementaryStudent1);

        school.allStudents();
        school.getStudentPostgraduate();
        school.approvedStudents();
        school.getStudentRa("01212063");
        school.getStudentRa("a");

        System.out.println(school);







    }
}





