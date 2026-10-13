public abstract class Cliente implements ClienteInt {

    protected String nome;
    protected String telefone;
    protected String dataUltimaCompra;

    public Cliente(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        this.dataUltimaCompra = "Nenhuma compra";
    }

    @Override
    public void RegistrarCompra(double Valor, String Data) {
        if (Valor < 0) {
            System.out.println("Erro: valor inválido.");
            return;
        }

        dataUltimaCompra = Data;
    }

    @Override
    public void AtribuirDesconto(double Porcent) {
        System.out.println("Erro: cliente não tem direito a desconto.");
    }

    @Override
    public void AtribuirParcelas(int NumParcelas) {
        System.out.println("Erro: cliente não tem direito a parcelamento.");
    }

    protected void ImprimirDadosComuns() {
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("Data da última compra: " + dataUltimaCompra);
    }

    @Override
    public abstract void ImprimirDados();
}