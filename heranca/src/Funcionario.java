public class Funcionario extends Pessoa{

    protected Double salarioHora;
    protected Integer horasTrabalhadas;

    public Funcionario() {
        super();
    }

    public Funcionario(String nome, String rg, double salarioHora, int horasTrabalhadas) {
        super(nome, rg);
        this.salarioHora = salarioHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public void adicionarHora(int horas) {
        if (horas > 0) this.horasTrabalhadas += horas;
    }

    public double salarioLiquido() {
        return salarioHora * horasTrabalhadas;
    }

    public void print() {
        System.out.println("Nome: " + nome);
        System.out.println("RG: " + rg);
        System.out.println("Horas Trabalhadas: " + horasTrabalhadas);
        System.out.printf("Salario Hora: R$ %.2f\n",  salarioHora);
        System.out.printf("Salario Liquido: R$ %.2f\n", salarioLiquido());
    }
}
