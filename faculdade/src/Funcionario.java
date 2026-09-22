public class Funcionario extends Pessoa {

    private int faltas;
    private String departamento;
    private double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String rg, int qtdFilhos, String departamento, double salario) {
        super(nome, rg, qtdFilhos);
        this.salario = salario;
        this.departamento = departamento;
        faltas = 0;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getFaltas() {
        return faltas;
    }

    public void registrarFalta() {
        this.faltas ++;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public double calcularSalario() {
        return salario - (salario/20 * faltas) + 42 + (100 * getQtdFilhos());
    }

    @Override
    public void zerarMes() {
        faltas = 0;
    }

    @Override
    public void hollerith() {
        super.hollerith();
        System.out.println("Departamento: " + getDepartamento());
        System.out.println("Faltas: " + faltas);
        System.out.println("Salario base: " + String.format("R$ %.2f", salario));
        System.out.println("Salario: " + String.format("R$ %.2f", calcularSalario()));
    }
}
