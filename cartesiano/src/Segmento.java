public class Segmento{

    protected Ponto p1, p2;

    public Segmento() {
        this.p1 = new Ponto(0,0);
        this.p2 = new Ponto(0,1);
    }

    public Segmento(double x1, double y1, double x2, double y2) {
        this.p1 = new Ponto(x1,y1);
        this.p2 = new Ponto(x2,y2);
    }

    public Segmento(Segmento seg) {
        this.p1 = new Ponto(seg.p1);
        this.p2 = new Ponto(seg.p2);
    }

    public Ponto getP1() {
        return p1;
    }

    public void setP1(Ponto p1) {
        this.p1 = p1;
    }

    public Ponto getP2() {
        return p2;
    }

    public void setP2(Ponto p2) {
        this.p2 = p2;
    }

    public void assign(Segmento seg) {
        this.p1 = seg.p1;
        this.p2 = seg.p2;
    }

    public void desloc(double dX, double dY) {
        this.p1.desloc(dX,dY);
        this.p2.desloc(dX,dY);
    }

    public void escale(double factor) {
        this.p1.escale(factor);
        this.p2.escale(factor);

    }



    @Override
    public String toString() {
        return "[(" + p1.x + "," + p1.y + ")" + ", (" + p2.x + "," + p2.y + ")" + "]";
    }

    public double length() {
        return p1.distance(p2.x, p2.y);
    }

    public boolean isValid(){
        if (p1 == null || p2 == null) {
            return false;
        }
        if (p1.x == p2.x && p1.y == p2.y) {
            return true;
        }
        return false;
    }



    public Ponto midPoint() {
        double xMedio = (p1.x + p2.x) / 2;
        double yMedio = (p1.y + p2.y) / 2;
        return new Ponto(xMedio,yMedio);
    }
}
