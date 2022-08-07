public abstract class Student {

    private String ra;
    private String name;

    public Student(String ra, String name) {
        this.ra = ra;
        this.name = name;
    }

    public abstract Double calculateAverage();

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Nome do Aluno: %s" +
                             "Ra do Aluno: %s" +
                             "---------------------", name, ra);
    }
}
