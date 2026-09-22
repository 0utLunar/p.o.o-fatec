public class Ponto {

    protected double x, y;

    public Ponto() {
    }

    public Ponto(Ponto ponto) {
        x = ponto.x;
        y = ponto.y;
    }

    public Ponto(double y, double x) {
        this.y = y;
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void assign(Ponto ponto) {
        x = ponto.x;
        y = ponto.y;
    }

    public double deltaX(double x) {
        return x  - this.x;
    }

    public double deltaY(double y) {
        return y - this.y;
    }

    public double distance(double posX, double posY) {
        double dx = deltaX(posX);
        double dy = deltaY(posY);

        return Math.sqrt(dx * dx + dy * dy);
    }

    public double distance(Ponto pt) {
        double dx = deltaX(pt.x);
        double dy = deltaY(pt.y);

        return Math.sqrt(dx * dx + dy * dy);
    }

    double distance() {
        double dx = deltaX(0);
        double dy = deltaY(0);

        return Math.sqrt(dx * dx + dy * dy);
    }

    public void desloc(double dX, double dY) {
        x += dX;
        y += dY;
    }

    public void escale(double factor) {
        x *= factor;
        y *= factor;
    }

    public void print() {
        System.out.println("(" +  x + ", " + y + ")");
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }


}
