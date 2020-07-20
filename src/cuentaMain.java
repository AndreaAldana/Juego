import Tarea1.SobreGiroException;

public class cuentaMain {
    public static void main(String[] args) throws SobreGiroException {
        cuentaCorriente c1 = new cuentaCorriente("Juanito", 10000);
        cuentaCorriente c2 = new cuentaCorriente ("Pablito", 50000);

        c1.transferencia(3000, c2);
        c2.giro(100);

        System.out.println("Juanito " + c1.getSaldo());
        System.out.println("Pablito "+ c2.getSaldo());

        c1.transferencia(1000,c2);

        System.out.println("Juanito " + c1.getSaldo());
        System.out.println("Pablito " + c2.getSaldo());

    }
}
