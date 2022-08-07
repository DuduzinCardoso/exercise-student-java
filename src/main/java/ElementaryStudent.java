public class ElementaryStudent extends Student {

    private Double evaluationOne;
    private Double evaluationTwo;
    private Double evaluationThree;
    private Double evaluationFour;

    public ElementaryStudent(String ra, String name, Double evaluationOne, Double evaluationTwo, Double evaluationThree, Double evaluationFour) {
        super(ra, name);
        this.evaluationOne = evaluationOne;
        this.evaluationTwo = evaluationTwo;
        this.evaluationThree = evaluationThree;
        this.evaluationFour = evaluationFour;
    }

    @Override
    public Double calculateAverage() {
        return (evaluationOne + evaluationTwo + evaluationThree + evaluationFour)  / 4;
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

    public Double getEvaluationThree() {
        return evaluationThree;
    }

    public void setEvaluationThree(Double evaluationThree) {
        this.evaluationThree = evaluationThree;
    }

    public Double getEvaluationFour() {
        return evaluationFour;
    }

    public void setEvaluationFour(Double evaluationFour) {
        this.evaluationFour = evaluationFour;
    }

    @Override
    public String toString() {
        return String.format("Nome do(a) Aluno(a): %s\n" +
                "Nota do 1ºBimestre: %.2f \n" +
                "Nota do 2ºBimestre: %.2f \n" +
                "Nota do 3ºBimestre: %.2f\n" +
                "Nota do 4ºBimestre: %.2f\n" +
                "Média: %.2f\n" +
                "---------------------------", getName(), evaluationOne, evaluationTwo, evaluationThree, evaluationFour, calculateAverage());
    }
}

