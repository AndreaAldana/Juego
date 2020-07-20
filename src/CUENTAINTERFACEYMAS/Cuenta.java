package CUENTAINTERFACEYMAS;

public interface Cuenta {
    public void Depositar(int monto);
    public void Giro(int monto);
    public void Transferir(int monto, Cuenta destino);

}
