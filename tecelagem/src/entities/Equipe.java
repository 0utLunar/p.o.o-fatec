package entities;

public class Equipe {

    private Funcionario[] equipe = new Funcionario[100];
    private Integer contador;

    public Equipe(Funcionario[] equipe) {
        this.equipe = equipe;
        contador = 0;
    }

    public Funcionario[] getEquipe() {
        return equipe;
    }

    public boolean add(Funcionario f) {
            if (contador < equipe.length) {
                equipe[contador] = f;
                contador++;
                return true;
            } else {
                return false;
            }
    }

    public void relatorioAdministracao(){
        for (Funcionario f : equipe) {
            if (f instanceof Administrativo) {
                f.hollerith();
                System.out.println();
            }
        }
    }

    public void relatorioVendas(){
        for (Funcionario f : equipe) {
            if (f instanceof Vendedor) {
                f.hollerith();
                System.out.println();
            }
        }
    }

    public void relatorioProducao(){
        for (Funcionario f : equipe) {
            if (f instanceof Producao) {
                f.hollerith();
            }
        }
    }

}
