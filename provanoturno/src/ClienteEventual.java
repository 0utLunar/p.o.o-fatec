
public class ClienteEventual extends Cliente {

    private double valorUltimaCompra;

    public ClienteEventual(String nome, String telefone) {
        super(nome, telefone);
        this.valorUltimaCompra = 0;
    }

    @Override
    public void RegistrarCompra(double Valor, String Data) {
        if (Valor < 0) {
            System.out.println("Erro: valor inválido.");
            return;
        }

        super.RegistrarCompra(Valor, Data);
        valorUltimaCompra = Valor;
    }

    @Override
    public void ImprimirDados() {
        System.out.println("\n=== CLIENTE EVENTUAL ===");
        ImprimirDadosComuns();
        System.out.printf("Valor da última compra: R$ %.2f%n",
                valorUltimaCompra);
    }
}