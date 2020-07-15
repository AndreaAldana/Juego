package Tarea1;
import java.util.Random;
import java.util.Scanner;

public class mainCelula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese n");
        int n = sc.nextInt();
        Celula a = new Celula(n);
        System.out.println(a.nuevoADN());
        String newADN = (a.nuevoADN());
        sc.nextLine();
        System.out.println(a.cadenaComplementaria(newADN));
        String ARN = (a.cadenaComplementaria(newADN));
        System.out.println(a.cadenaARN(ARN));
        Celula b = new Celula(n);
        System.out.println(a.mitosis(newADN, b));


        }

    }
