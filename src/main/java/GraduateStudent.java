public class GraduateStudent extends Student{

    private Double evaluationOne;
    private Double evaluationTwo;

    public GraduateStudent(String ra, String name, Double evaluationOne, Double evaluationTwo) {
        super(ra, name);
        this.evaluationOne = evaluationOne;
        this.evaluationTwo = evaluationTwo;
    }

    @Override
    public Double calculateAverage() {
        return (evaluationOne * 0.4) + (evaluationTwo * 0.6);
    }

    public Double getEvaluationOne() {
        return evaluationOne;
    }

    public void setEvaluationOne(Double evaluationOne) {
        this.evaluationOne = evaluationOne;
    }

    public Double getEvaluationTwo() {
        return evaluationTwo;
    }

    public void setEvaluationTwo(Double evaluationTwo) {
        this.evaluationTwo = evaluationTwo;
    }

    @Override
    public String toString() {
        return String.format("Nome do(a) Aluno(a): %s\n" +
                "Nota da 1ºAvaliação: %.2f\n" +
                "Nota da 2ºAvaliação: %.2f\n" +
                "Média: %.2f\n" +
                "---------------------------", getName(), evaluationOne, evaluationTwo, calculateAverage());
    }
}
