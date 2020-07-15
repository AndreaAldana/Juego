public class cuentaCorriente {

    private final String nombre;
    private String rut;
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public String getNombre() {
        return nombre;
    }

    cuentaCorriente(String nombre, int saldo){
        this.nombre = nombre;
        this.saldo= saldo;


    }


    void giro(double monto){
        if(monto>this.saldo)
            return;
        saldo -= monto;
    }

    void depositar(double monto){
        this.saldo +=monto;

    }
    public double saldo(){
        return saldo;
    }

    void transferencia (int monto, cuentaCorriente destino){
        if(monto>this.saldo) return;
        this.saldo-=monto;
        destino.saldo +=monto;

}

}
