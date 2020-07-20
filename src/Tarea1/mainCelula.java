package Tarea1;

import java.util.Scanner;

public class mainCelula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ARN = "";

        System.out.println("Ingrese el largo de ADN");
        int size = sc.nextInt();
        Celula a = new Celula(size);
        Celula b = new Celula(size);
        //Asignar tamaño de ADN y generar ADN;
        System.out.println("Generando ADN");
        System.out.println(a.nuevoADN());
        String newADN = (a.nuevoADN());
        sc.nextLine();

        //Inicio de operaciones

        while (true) {

            System.out.println("¿Desea conocer/generar otro dato? (si) (no)");
            String answer = sc.next();

            if (answer.equalsIgnoreCase("si")) {

                while (true) {

                    // Menu;

                    System.out.println(" 1. Generar cadena complementaria (Apartir de esto, puede generar su ARN) " +
                            "\n 2. Iniciar proceso de mitosis \n " +
                            "3. Estoy satisfecho con los resultados y deseo salir");
                    int operation = sc.nextInt();

                    if (operation == 1) {
                        System.out.println("¡Cadena complementaria generada a partir de su ADN!");
                        System.out.println(a.cadenaComplementaria(newADN));
                        ARN = (a.cadenaComplementaria(newADN));
                        sc.nextLine();
                         // Generar su ARN apartir de cadena complementaria, de ser requerido;
                        System.out.println("¿Desea generar su ARN? (si) (no)");
                        String answer2 = sc.nextLine();

                        if (answer.equalsIgnoreCase("si")) {
                            System.out.println("ARN generado con éxito");
                            System.out.println(a.cadenaARN(ARN));
                        } else {
                            break;
                        }

                        //Volver a menú

                    } else if (operation == 2) {
                        System.out.println("Mitosis generada");
                        System.out.println(a.mitosis(newADN, b));
                    } else if (operation == 3) {
                        System.out.println("Hasta pronto");
                        System.exit(-1);
                    } else {
                        System.out.println("Opción inválida");
                        System.exit(-1);

                    }


                }
            } else if (answer.equalsIgnoreCase("no")) {
                System.out.println("Entendido. ¡Gracias por usar nuestros servicios!");
                System.exit(-1);
            }

        }

    }
}
