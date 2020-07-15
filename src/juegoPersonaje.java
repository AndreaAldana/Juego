public class juegoPersonaje {
    String nombre;
    String genero;
    String raza;
    String clase;
    int vitalidad;
    int nivel;
    String arma;

    juegoPersonaje(String nombre, String genero, String raza, String clase, int vitalidad, int nivel, String arma){
        this.nombre = nombre;
        this.genero = genero;
        this.raza = raza;
        this.clase = clase;
        this.vitalidad = vitalidad;
        this.nivel = nivel;
        this.arma = arma;

    }

    String GetNombre(String nombre){
        return this.nombre;
    }

    int GetNivel(int nivel){
        return this.nivel;
    }

    int GetVitalidad(int vitalidad){
        return this.vitalidad;
    }

    int perderVida(int danho){
        this.vitalidad -= danho;
        return vitalidad;
    }
    int recuperarVida(int vida){
        this.vitalidad += vida;
        return vitalidad;
    }

    String ataque(String arma){
        return "Haz atacado con " + arma;
    }

    String morir(int danho){

        if(danho >= this.vitalidad || this.vitalidad == 0){
            return "Haz sucumbido ante la muerte. Game over.";
        } else{
            return "Sigues vivo";
        }
    }
}
