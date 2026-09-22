void main() {

    Ponto pt1 = new Ponto();
    pt1.print();
    Ponto pt2 = new Ponto(10, 20);
    pt2.print();
    Ponto pt3 = new Ponto(pt2);
    pt3.print();

    pt3.escale(2);
    pt3.print();

    pt2.desloc(1,1 );
    pt2.print();

    Segmento seg = new Segmento();
    System.out.println(seg);




    pt1.setXY(3,4);
    System.out.println("Distancia até a origem: "  + pt1.distance(0,0));

}