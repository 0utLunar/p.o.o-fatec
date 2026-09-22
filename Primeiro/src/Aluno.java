public class Aluno {

    private String ra;
    private double n1, n2;

    public String getRa() {
        return ra;
    }

    public Aluno(String ra) {
        this.ra = ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double calcularMedia() {
        return (n1 + n2) / 2;
    }

    public void print() {
        System.out.println("RA: "
                + ra
                + "\nNota 1: "
                + n1
                + "\nNota 2: "
                + n2 + "\nMédia: "
                + calcularMedia());
    }

    public String toString() {
        return "RA: "
                + ra
                + "\nNota 1: "
                + n1
                + "\nNota 2: "
                + n2
                + "\nMédia: "
                + calcularMedia();
    }

}
