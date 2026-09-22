package entities;

public class Administrativo extends Funcionario{

    private Integer faltas;

    public Administrativo() {
    }

    public Administrativo(String nome, String rg, Double salarioBase) {
        super(nome, rg, salarioBase);
        faltas = 0;
    }

    public Integer getFaltas() {
        return this.faltas;
    }

    public void registrarFalta() {
        this.faltas ++;
    }

    @Override
    public double salarioLiquido() {
        return getSalarioBase() - ((getSalarioBase()/30) * this.faltas);
    }

    @Override
    public void novoMes() {
        this.faltas = 0;
    }

    @Override
    public void hollerith() {
        super.hollerith();
        System.out.println("Faltas: " + faltas);
    }


}
