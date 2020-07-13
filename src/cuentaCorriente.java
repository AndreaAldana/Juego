public class cuentaCorriente {

    String nombre;
    String rut;
    double saldo;

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
