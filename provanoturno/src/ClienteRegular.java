// Nome: SEU NOME
// RA: SEU RA

public class ClienteRegular extends Cliente {

    private double compraMinimaMensal;
    private double porcentagemDesconto;

    public ClienteRegular(String nome, String telefone,
                          double compraMinimaMensal) {
        super(nome, telefone);
        this.compraMinimaMensal = compraMinimaMensal;
        this.porcentagemDesconto = 0;
    }

    @Override
    public void AtribuirDesconto(double Porcent) {
        if (Porcent < 0 || Porcent > 20) {
            System.out.println("Erro: desconto deve ser de 0% a 20%.");
            return;
        }

        porcentagemDesconto = Porcent;
    }

    public double AplicarDesconto(double Valor) {
        if (Valor < 0) {
            System.out.println("Erro: valor inválido.");
            return Valor;
        }

        return Valor * (1 - porcentagemDesconto / 100);
    }

    @Override
    public void ImprimirDados() {
        System.out.println("\n=== CLIENTE REGULAR ===");
        ImprimirDadosComuns();
        System.out.printf("Compra mínima mensal: R$ %.2f%n",
                compraMinimaMensal);
        System.out.printf("Desconto: %.2f%%%n", porcentagemDesconto);
    }
}