package entities;

public class Producao extends Funcionario {

    private Integer horasDiurnas;
    private Integer horasNoturnas;

    public Producao() {
    }

    public Producao(String nome, String rg, Double salarioBase) {
        super(nome, rg, salarioBase);
        this.horasDiurnas = 0;
        this.horasNoturnas = 0;
    }

    public Integer getHorasDiurnas() {
        return horasDiurnas;
    }

    public Integer getHorasNoturnas() {
        return horasNoturnas;
    }

    public void registrarHorasDiurnas(Integer horasDiurnas) {
        this.horasDiurnas += horasDiurnas;
    }

    public void registrarHorasNoturnas(Integer horasNoturnas) {
        this.horasNoturnas += horasNoturnas;
    }

    @Override
    public double salarioLiquido() {
        return (getSalarioBase() * horasDiurnas) + (getSalarioBase() * horasNoturnas * 1.30) ;
    }

    @Override
    public void novoMes() {
        horasDiurnas = 0;
        horasNoturnas = 0;
    }

    @Override
    public void hollerith() {
        super.hollerith();
        System.out.println("Horas Diurnas: " + horasDiurnas);
        System.out.println("Horas Noturnas: " + horasNoturnas);
    }
}
