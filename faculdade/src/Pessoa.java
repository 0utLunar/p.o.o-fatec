public abstract class Pessoa {

    private String nome;
    private String rg;
    private int qtdFilhos;

    public Pessoa() {
    }

    public Pessoa(String nome, String rg, int qtdFilhos) {
        this.nome = nome;
        this.rg = rg;
        this.qtdFilhos = qtdFilhos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public int getQtdFilhos() {
        return qtdFilhos;
    }

    public void setQtdFilhos(int qtdFilhos) {
        this.qtdFilhos = qtdFilhos;
    }

    public abstract double calcularSalario();
    public abstract void zerarMes();

    public void hollerith() {

        System.out.println("HOLLERITH");
        System.out.println("Nome: " + getNome());
        System.out.println("RG: " + getRg());
        System.out.println("Qtd Filhos: " + getQtdFilhos());

    }
}
