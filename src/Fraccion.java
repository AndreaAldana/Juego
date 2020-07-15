public class Fraccion {


    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public boolean esMenorQue(Fraccion f){
        return this.numerador * f.denominador < this.denominador * f.numerador;
    }

    public String imprimir(){
        return this.numerador + "/" + this.denominador;
    }

    public Fraccion suma(Fraccion f){
        int numerador = this.numerador*f.denominador + this.denominador + f.numerador;
        int denominador = this.denominador * f.denominador;
        return new Fraccion (numerador, denominador);
    }
    public Fraccion dividir(Fraccion f){
        int numerador = this.numerador*f.denominador;
        int denominador = this.denominador*f.numerador;
        return new Fraccion (numerador, denominador);

    }
    public Fraccion multiplicar(Fraccion f){
        int numerador = this.numerador*f.numerador;
        int denominador = this.denominador*f.denominador;
        return new Fraccion(numerador,denominador);
    }
    public Fraccion restar(Fraccion f){
        int numerador = (this.numerador*f.denominador) - (this.denominador * f.numerador);
        int denominador = this.denominador*f.denominador;
        return new Fraccion (numerador,denominador);
    }
}
