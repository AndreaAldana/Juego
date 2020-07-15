package CUENTAINTERFACEYMAS;

public class cuentaVista implements Cuenta {
    private int saldo;
    private String Cliente;
    private int girosPorMes;

    public cuentaVista(int saldo, String cliente, int girosPorMes) {
        this.saldo = saldo;
        Cliente = cliente;
        this.girosPorMes = girosPorMes;
    }


    @Override
    public void Depositar(int monto) {
        this.saldo += monto;

    }

    @Override
    public void Giro(int monto) {
        if(girosPorMes>0){
            if(monto <= saldo){
                girosPorMes--;
                saldo -= monto;
            }
        }

    }

    @Override
    public void Transferir(int monto, Cuenta destino) {
        if(monto<=saldo){
            saldo -= monto;
            destino.Depositar(monto);
        }

    }
}