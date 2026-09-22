import entities.Funcionario;

void main() {
    Funcionario f1 = new Funcionario("Pedro", 25.50);
    f1.setHorasTrabalhadas(160);

    Funcionario f2 = new Funcionario("Sofia", 32.00);
    f2.setHorasTrabalhadas(140);

    f1.print();
    f2.print();
}