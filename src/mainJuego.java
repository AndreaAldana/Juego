public class mainJuego {
    public static void main(String[] args) {
        juegoPersonaje principal = new juegoPersonaje("Icarus", "Mujer", "Elfa", "Pícaro", 100,1,"arco y flecha");

        System.out.println("Te encuentras caminando y un monstruo te da un coñazo");
        System.out.println(principal.perderVida(10));
        System.out.println(principal.morir(90));
    }
}
