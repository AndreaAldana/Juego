import java.util.Scanner;

public class mainPersona {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese su nombre");
        String nombre = sc.nextLine();
        System.out.println("Ingrese apellido");
        String apellido = sc.nextLine();
        System.out.println("Ingrese edad");
        int edad = sc.nextInt();
        System.out.println("Ingrese sexo");
        char sexo = sc.next().charAt(0);
        System.out.println("Ingrese peso");
        int peso = sc.nextInt();
        System.out.println("Ingrese altura");
        double altura = sc.nextDouble();
        persona a = new persona(nombre, edad, "27.094.162-1", sexo, peso, altura);


        System.out.println("Su peso ideal está en el rango de :");
        System.out.println(a.pesoIdeal(peso,altura, 0));
        System.out.println("Su genero es :");
        System.out.println(a.comprobarSexo(sexo));
        System.out.println("tu edad es " + edad);
        System.out.println(a.esMayorDeEdad(edad));
        System.out.println("Tu nombre y apellido es");
        System.out.println(a.nombre(nombre,apellido));
    }
}
