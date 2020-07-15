package CUENTAINTERFACEYMAS;

public class CuentaCorriente implements Cuenta {

    private String nombre;
    private String rut;
    private double saldo;
    private int lineaDeCredito;

    void CuentaCorriente(String nombre, double saldo, int lineaDeCredito) {
        this.nombre = nombre;
        this.saldo = saldo;
        this.lineaDeCredito = lineaDeCredito;
    }

    @Override
    public void Depositar(double monto) {
        this.saldo +=monto;

    }

    @Override
    public void Giro(double monto) {
        if(monto<=this.saldo+lineaDeCredito);
        this.saldo-=monto;
    }

    @Override
    public void Transferir(double monto, Cuenta destino) {
        if(monto>this.saldo+lineaDeCredito) return;
        this.saldo-=monto;
        destino.Depositar(monto);

    }
}