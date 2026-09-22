package entities;

public class Vendedor extends Funcionario{

    private Double totalVendas;

    public Vendedor() {
    }

    public Vendedor(String nome, String rg, Double salarioBase) {
        super(nome, rg, salarioBase);
        totalVendas = 0.0;
    }

    public Double getTotalVendas() {
        return totalVendas;
    }

    public void registrarVenda(double valor) {
        totalVendas += valor;
    }

    @Override
    public double salarioLiquido() {
        return getSalarioBase() + (totalVendas * 0.03);
    }

    @Override
    public void novoMes() {
        totalVendas = 0.0;
    }
}
