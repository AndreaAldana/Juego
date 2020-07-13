public class cuentaMain {
    public static void main(String[] args) {
        cuentaCorriente c1 = new cuentaCorriente("Juanito", 10000);
        cuentaCorriente c2 = new cuentaCorriente ("Pablito", 50000);

        c1.transferencia(3000, c2);
        c2.giro(100);

        System.out.println("Juanito " + c1.saldo);
        System.out.println("Pablito "+ c2.saldo);

        c1.transferencia(1000,c2);

        System.out.println("Juanito " + c1.saldo);
        System.out.println("Pablito " + c2.saldo);

    }
}
