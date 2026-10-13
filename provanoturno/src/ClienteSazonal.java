public class ClienteSazonal extends Cliente {

    private String mesCompra;
    private double compraMinima;
    private int numParcelas;

    public ClienteSazonal(String nome, String telefone,
                          String mesCompra, double compraMinima) {
        super(nome, telefone);
        this.mesCompra = mesCompra;
        this.compraMinima = compraMinima;
        this.numParcelas = 1;
    }

    @Override
    public void AtribuirParcelas(int NumParcelas) {
        if (NumParcelas < 1 || NumParcelas > 6) {
            System.out.println("Erro: parcelas devem ser de 1 a 6.");
            return;
        }

        numParcelas = NumParcelas;
    }

    public double CalcularParcela(double Valor) {
        if (Valor < 0) {
            System.out.println("Erro: valor inválido.");
            return Valor;
        }

        return Valor / numParcelas;
    }

    @Override
    public void ImprimirDados() {
        System.out.println("\n=== CLIENTE SAZONAL ===");
        ImprimirDadosComuns();
        System.out.println("Mês de compra: " + mesCompra);
        System.out.printf("Compra mínima: R$ %.2f%n", compraMinima);
        System.out.println("Número de parcelas: " + numParcelas);
    }
}