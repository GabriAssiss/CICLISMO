package main;

public class Etapa {
    private final int NUMEROETAPA;
    private final Duracao duracaoEtapa;
    private final static int MAXIMOETAPA = 21;

    public Etapa(int numeroEtapa, Duracao duracaoEtapa){
        if(numeroEtapa >= 1 && numeroEtapa < MAXIMOETAPA + 1 ) {
            this.NUMEROETAPA = numeroEtapa;
            this.duracaoEtapa = duracaoEtapa;
        }
        else throw new IllegalArgumentException("Valor inválido de número de etapa");
    }
    public static int getMaximoetapa(){
        return MAXIMOETAPA;
    }

    public Duracao getDuracaoEtapa() {
        return duracaoEtapa;
    }

    public int getNUMEROETAPA() {
        return NUMEROETAPA;
    }
}


