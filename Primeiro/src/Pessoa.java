public class Pessoa {

    private String nome;
    private int idade;

    // Setters: coloca um novo valor nos atributos

    public void setNome(String valNome) {
        if  (!valNome.isEmpty()) {
            nome = valNome;
        }
    }

    public void setIdade(int valIdade) {
        if (valIdade > 0) {
            idade = valIdade;
        }
    }

    // Getters: retorna o valor dos atributos

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void print() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

}
