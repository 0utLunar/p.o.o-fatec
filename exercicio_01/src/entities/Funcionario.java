package entities;

public class Funcionario {

    private String nome;
    private double salarioHora;
    private int horasTrabalhadas;

    public Funcionario(String nome, double salarioHora) {
        if (!nome.isEmpty()) this.nome = nome;
        if (salarioHora > 0) this.salarioHora = salarioHora;
        this.horasTrabalhadas = 0;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (!nome.isEmpty()) this.nome = nome;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        if (salarioHora > 0) this.salarioHora = salarioHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void addHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas += horasTrabalhadas;
    }


    public double calcularSalarioLiquido() {
        return this.salarioHora * this.horasTrabalhadas;
    }

    public void print() {
        System.out.println("Nome: " + nome);
        System.out.printf("Salário por Hora: R$ %.2f\n", salarioHora);
        System.out.printf("Horas Trabalhadas: %d\n", horasTrabalhadas);
        System.out.printf("Salário Líquido: R$ %.2f\n", calcularSalarioLiquido());
        System.out.println("-----------------------------");
    }


}
