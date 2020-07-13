public class persona {
    String nombre;
    int edad;
    String rut;
    char sexo;
    double peso;
    double altura;
    double pesoIdeal;

    persona(String nombre, int edad, String rut, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.rut = rut;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.pesoIdeal = pesoIdeal;

    }

    double pesoIdeal(int peso, double altura, double pesoIdeal) {
        altura = Math.pow(altura,2);
        pesoIdeal = peso / altura;
        return pesoIdeal;
    }

    String esIdeal(double pesoIdeal){
        if(pesoIdeal<20){
            return "Bajo de peso";
        }
        else if(pesoIdeal >= 20 && pesoIdeal<=25){
            return "Sano";
        }
        else if(pesoIdeal>25){
            return "Obeso";
        }
        else return "Inválido";
    }

    String comprobarSexo(char sexo){
        if(sexo=='M'){
            return "Eres mujer";
        }
        else if (sexo=='H'){
            return "Eres hombre";
        }else
            return "Otro";
    }

    boolean esMayorDeEdad(int edad){
        return edad>=18;
    }
 String nombre(String nombre, String apellido){
        return this.nombre + " " + apellido;
 }

}

