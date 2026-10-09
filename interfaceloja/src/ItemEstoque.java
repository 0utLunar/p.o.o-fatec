public class ItemEstoque implements ItemEstoqueInt {

    private String descricao;
    private int tamanho;
    private double preco;
    private int quantidade;

    public ItemEstoque() {
    }

    public ItemEstoque(String descricao, int tamanho, double preco, int quantidade) {
        this.descricao = descricao;
        this.tamanho = tamanho;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public void incUnits(int qtd) {
        quantidade += qtd;
    }

    @Override
    public boolean decUnits(int qtd) {
        if (quantidade > qtd) {
            quantidade -= qtd;
            return true;
        }
        return false;
    }

    @Override
    public int getUnits() {
        return quantidade;
    }

    @Override
    public double getPrice() {
        return preco;
    }

    @Override
    public void print() {
        System.out.println("Descrição: " + descricao);
        System.out.println("Tamanho: "  + tamanho);
        System.out.println("Preço: " + String.format("R$ %.2f", preco));
        System.out.println("Quantidade: " + quantidade);
    }
}
