public class Program {

    public static void main(String[] args) {


        Funcionario f1 = new Funcionario("Rogerio", "01203091203", 2, "TI", 3000);
        f1.registrarFalta();
        f1.registrarFalta();
        f1.hollerith();

        System.out.println();

        Professor p1 = new Professor("Maria", "12391283912", 1, "ADS", 80);
        p1.registrarAulas(40);
        p1.registrarAulas(10);
        p1.hollerith();




    }

}