import Tarea1.IllegalAmountException;
import Tarea1.SobreGiroException;

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


    void giro(double monto) throws SobreGiroException{
        if(monto <= 0){
            throw  new IllegalAmountException("Inválido");
        }
        if (monto > this.saldo) {
            throw new SobreGiroException("Malo");
        } else {
            saldo -= monto;
        }

    }

    void depositar(double monto){
        if(monto <= 0){
            throw  new IllegalAmountException("Inválido");
        }
        this.saldo +=monto;

    }
    public double saldo(){
        return saldo;
    }

    void transferencia (int monto, cuentaCorriente destino){
        if(monto <= 0){
            throw  new IllegalAmountException("Inválido");
        }
        if(monto>this.saldo) return;
        this.saldo-=monto;
        destino.saldo +=monto;

}


}
