public class Professor extends Pessoa{

    private String curso;
    private int qtdAulas;
    private double salarioAula;

    public Professor() {
    }

    public Professor(String nome, String rg, int qtdFilhos, String curso, double salarioAula) {
        super(nome, rg, qtdFilhos);
        this.curso = curso;
        this.salarioAula = salarioAula;
        qtdAulas = 0;
    }

    public double getSalarioAula() {
        return salarioAula;
    }

    public void setSalarioAula(double salarioAula) {
        this.salarioAula = salarioAula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getQtdAulas() {
        return qtdAulas;
    }

    public void registrarAulas(int qtd) {
        this.qtdAulas += qtd;
    }

    @Override
    public double calcularSalario() {
        return (salarioAula * qtdAulas) + (100 * getQtdFilhos());
    }

    @Override
    public void zerarMes() {
        qtdAulas = 0;
    }

    @Override
    public void hollerith() {
        super.hollerith();
        System.out.println("Curso: " + getCurso());
        System.out.println("Quantidade de Aulas: " + qtdAulas);
        System.out.println("Salario/Aula: " + String.format("R$ %.2f", salarioAula));
        System.out.println("Salario: " + String.format("R$ %.2f", calcularSalario()));
    }


}
