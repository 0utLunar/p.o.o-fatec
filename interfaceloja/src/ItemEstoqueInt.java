public interface ItemEstoqueInt {

    void incUnits(int qtd);
    boolean decUnits(int qtd);
    int getUnits();
    double getPrice();
    void print();

}
