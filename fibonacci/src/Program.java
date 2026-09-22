public class Program {

    static void main(String[] args) {

        long[] numeros = new long[100];
        numeros[0] = 0;
        numeros[1] = 1;

        for (int i = 2; i < numeros.length; i++) {
            numeros[i] = numeros[i - 1] + numeros[i - 2];
            System.out.println(numeros[i]);
        }

    }

}
