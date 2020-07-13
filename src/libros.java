public class libros {
    String titulo;
    String autor;
    int ejemplares;
    int prestados;

    libros(String titulo, String autor, int ejemplares, int prestados){
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;

    }
    String getAutor(String autor){
        return this.autor;
    }

    String getTitulo(String titulo){
        return this.titulo;
    }
    int getEjemplares(int ejemplares){
        return this.ejemplares;
    }
    int getPrestados(int prestados){
        return this.prestados;
    }
    boolean prestamos(int prestados){
        boolean prestado = true;
        if(prestados<=ejemplares){
            prestados++;
        }else{
            prestado = false;
        }
        return prestado;

    }

    boolean devolucion(int prestados){
        boolean devuelto = true;
        if(prestados==0){
            devuelto = false;
        }else{
            prestados--;
        }
        return devuelto;
    }


}
