public interface ClienteInt {
    void RegistrarCompra(double Valor, String Data);
    void AtribuirDesconto(double Porcent);
    void AtribuirParcelas(int NumParcelas);
    void ImprimirDados();
}