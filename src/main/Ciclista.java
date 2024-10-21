package main;

public class Ciclista {
    private int numero;
    private String nome;
    private String cidadeNascimento;
    private Etapa etapa[];

    public Ciclista(int numero, String nome, String cidadeNascimento, Etapa[] etapa) {
        if(numero > -1 ) {
            this.numero = numero;
        }
        else {throw new IllegalArgumentException("Valor inválido de número inserido!");}
            this.nome = nome;
            this.cidadeNascimento = cidadeNascimento;
            this.etapa = etapa;
    }

    public int duracaoTotalEmSegundos() {
        int tempoCiclista = 0;
        for(int i = 0; i < this.etapa.length; i++){
            tempoCiclista += etapa[i].getDuracaoEtapa().getDuracaoTotal();
        }
        return tempoCiclista;
    }
    public Duracao duracaoEtapa(Etapa et) {
        return et.getDuracaoEtapa();
    }

}
