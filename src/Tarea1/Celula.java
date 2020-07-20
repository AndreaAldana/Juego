package Tarea1;

import java.util.Random;

public class Celula {

    private String ADN = "";
    public String ADNComplementario = "";
    public String ARNMensajero = "";
    public int n;
    public String celulaMitosis = "";


    public Celula(int n) {
        this.n = n;
        String ADN = "";
        String a = "ACGT";
        for (int i = 0; i < n; i++) {
            this.ADN += a.charAt(new Random().nextInt(a.length()));

        }

    }

    public String nuevoADN() {
        return this.ADN;
    }

    public String cadenaComplementaria(String ADN) {
        this.ADN = ADN;
        String ADNComplementario = this.ADN;

        return ADNComplementario.replace("C", "B")
                .replace("G", "C")
                .replace("B", "G")
                .replace("A", "D")
                .replace("T", "A")
                .replace("D", "T");
    }

    public String cadenaARN(String ADNComplementario){
        this.ADNComplementario = ADNComplementario;
        String ARN = this.ADNComplementario;
        return ADNComplementario.replace('A','U');
    }

    public String mitosis(String ADN, Celula destino){
            String mitosis = this.ADN;
            String result;
            StringBuilder adnBuilder = new StringBuilder(ADN);
            String a = "ACGT";
            double randd = Math.random();
            if(randd < 0.1){
                adnBuilder.setCharAt((int)(Math.random()*ADN.length()), a.charAt((int)(Math.random()*a.length())));
                result = adnBuilder.toString();

            }else{
                return mitosis;
            }
            return result;
        }


    }


