import java.util.Scanner;

public class fraccionMainUsuarioIngresaDatos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese primer numerador");
        int numerador1 = sc.nextInt();
        System.out.println("Ingrese primer denominador");
        int denominador1 = sc.nextInt();
        System.out.println("Ingrese segundo numerador");
        int numerador2 = sc.nextInt();
        System.out.println("Ingrese segundo denominador");
        int denominador2 = sc.nextInt();

        Fraccion x = new Fraccion(numerador1, denominador1);
        Fraccion y = new Fraccion(numerador2, denominador2);


            System.out.println("Ingrese tipo de operación a realizar");
            sc.nextLine();
            String operacion = sc.nextLine();

            if (operacion.equalsIgnoreCase("sumar")) {
                System.out.println(x.suma(y).imprimir());
            } else if (operacion.equalsIgnoreCase("restar")) {
                System.out.println(x.restar(y).imprimir());
            } else if (operacion.equalsIgnoreCase("multiplicar")) {
                System.out.println(x.multiplicar(y).imprimir());
            } else if (operacion.equalsIgnoreCase("dividir")) {
                System.out.println(x.dividir(y).imprimir());
            } else {
                System.out.println("FIN");
                System.exit(-1);
            }

    }
}
