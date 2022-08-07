public class PostgraduateStudent extends Student{
    private Double evaluationOne;
    private Double evaluationTwo;
    private Double evaluationMonograph;

    public PostgraduateStudent(String ra, String name, Double evaluationOne, Double evaluationTwo, Double evaluationMonograph) {
        super(ra, name);
        this.evaluationOne = evaluationOne;
        this.evaluationTwo = evaluationTwo;
        this.evaluationMonograph = evaluationMonograph;
    }

    @Override
    public Double calculateAverage() {
        return (evaluationOne + evaluationTwo + evaluationMonograph) / 3;
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

    public Double getEvaluationMonograph() {
        return evaluationMonograph;
    }

    public void setEvaluationMonograph(Double evaluationMonograph) {
        this.evaluationMonograph = evaluationMonograph;
    }

    @Override
    public String toString() {
        return String.format("Nome do(a) Aluno(a): %s\n" +
                "Nota do 1ºBimestre: %.2f\n" +
                "Nota do 2ºBimestre: %.2f\n" +
                "Nota da Monografia: %.2f\n" +
                "Média: %.2f\n" +
                "---------------------------", getName(), evaluationOne, evaluationTwo, evaluationMonograph, calculateAverage());
    }
}
