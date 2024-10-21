package main;

public class Duracao {
    private Hora horaInicial;
    private int duracaoTotal;

    public Duracao(Hora horaInicial, int tempoEmSegundos){
        if(horaInicial.getHora() <= 23) {
            this.horaInicial = horaInicial;
        }
        else {
            throw new IllegalArgumentException("valor de hora inválido!");
        }
       if(tempoEmSegundos > 0) {
           this.duracaoTotal = tempoEmSegundos;
       }
       else{
           throw new IllegalArgumentException("Valor de segundo inválido!");
       }
    }

    public boolean maiorQue(Duracao outraDuracao) {
        if(this.duracaoTotal > outraDuracao.duracaoTotal) return true;
        else return false;
    }
    public int getDuracaoTotal() {
        return duracaoTotal;
    }
}
