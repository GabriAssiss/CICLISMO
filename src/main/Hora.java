package main;

public class Hora {
    private int hora;
    private int minutos;
    private int segundos;

    public Hora(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
        if(!validar()) {
            throw new IllegalArgumentException("Insira valores válidos de hora, minuto e segundo!");
        }
        ajustar(hora, minutos , segundos);

    }
    public void ajustar(int hora, int min, int seg) {
        int horaEmSegundos = hora*3600;
        int minutosEmSegundos = min*60;
        int totalSegundos = horaEmSegundos + minutosEmSegundos + seg;
        this.hora = totalSegundos/3600;
        totalSegundos = totalSegundos - this.hora*3600;
        this.minutos = totalSegundos/60;
        totalSegundos = totalSegundos - this.minutos*60 ;
        this.segundos = totalSegundos;
    }

    public boolean validar() {
        boolean validacao;
        validacao = this.hora >= 0 && this.minutos >= 0  && this.segundos >= 0  ? true : false;
        return validacao;
    }

    public Hora incrementar(int quantidadeSegundos){
        ajustar(this.hora,this.minutos,quantidadeSegundos+segundos);
        return new Hora(this.hora, this.minutos, this.segundos);
    }

    public boolean estaNaFrenteDe(Hora outraHora){
        if(this.hora > outraHora.getHora() ) return true;
        else if(this.hora == outraHora.getHora() && this.minutos > outraHora.getMinutos()) return true;
        else if(this.hora == outraHora.getHora() && this.minutos == outraHora.getMinutos() && this.segundos > outraHora.getSegundos()) return true;
        else return false;
    }
    public String horaFormatada(){
        return this.hora + ":"
                + this.minutos + ":" +
                  this.segundos;
    }
    public int getHora() {
        return hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }
}
