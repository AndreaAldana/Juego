public class FraccionMain {
    public static void main(String[] args) {

        Fraccion x = new Fraccion(3,4);
        Fraccion y = new Fraccion(2,3);

        System.out.println(x.imprimir());
        System.out.println(y.esMenorQue(x));
        System.out.println(x.esMenorQue(y));
        System.out.println(x.suma(y).imprimir());
        System.out.println(x.restar(y).imprimir());
        System.out.println(x.dividir(y).imprimir());
        System.out.println(x.multiplicar(y).imprimir());

    }

}
