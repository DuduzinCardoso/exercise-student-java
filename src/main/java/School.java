import java.util.ArrayList;

public class School {

    private String name;
    private ArrayList<Student> students;

    public School(String name) {
        this.name = name;
        students = new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void allStudents(){

        System.out.println("Lista dos estudantes");
        for (Student student : students){
            System.out.println(student);
        }
    }

    public void getStudentPostgraduate(){
        System.out.println("Exibindo todos os alunos de pós-graduação:");

        for (Student student : students){
            if (student instanceof PostgraduateStudent){
                System.out.println(student.getName() + "\n");
            }
        };
    }

    public void approvedStudents(){

        for (Student student : students){
            if (student.calculateAverage() >= 6){
                System.out.printf("O aluno(a) %s foi aprovado(a)!%n", student.getName());
            }
        }
    }

    public void getStudentRa(String ra){
        boolean foundStudent = false;
        for (Student student : students){
            if (student.getRa().equals(ra)){
                System.out.println("Procurando estudante pelo Ra: " + student.getName() + "\n");
                foundStudent = true;
            }
        }
        if (!foundStudent){
            System.out.println("Erro ao buscar aluno(a), verifique novamente o Ra!\n");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return String.format("Escola: %s\n" +
                "---------------------------", name);
    }
}
