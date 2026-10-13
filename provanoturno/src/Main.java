public class Main {

    public static void main(String[] args) {

        ClienteRegular regular =
                new ClienteRegular("João", "19999999999", 5000);

        ClienteSazonal sazonal =
                new ClienteSazonal("Maria", "19988888888",
                        "Dezembro", 3000);

        ClienteEventual eventual =
                new ClienteEventual("Pedro", "19977777777");

        regular.RegistrarCompra(6000, "10/10/2026");
        sazonal.RegistrarCompra(4000, "12/10/2026");
        eventual.RegistrarCompra(750, "13/10/2026");

        regular.AtribuirDesconto(10);
        regular.AtribuirDesconto(25); // Exibe erro

        sazonal.AtribuirParcelas(4);
        sazonal.AtribuirParcelas(8); // Exibe erro

        sazonal.AtribuirDesconto(10); // Exibe erro
        regular.AtribuirParcelas(3);  // Exibe erro

        eventual.AtribuirDesconto(5); // Exibe erro
        eventual.AtribuirParcelas(2); // Exibe erro

        System.out.printf("Valor com desconto: R$ %.2f%n",
                regular.AplicarDesconto(1000));

        System.out.printf("Valor da parcela: R$ %.2f%n",
                sazonal.CalcularParcela(1200));

        regular.ImprimirDados();
        sazonal.ImprimirDados();
        eventual.ImprimirDados();
    }
}