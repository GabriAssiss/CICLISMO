package main;

public class Main {
    public static void main(String[] args) {

        Hora h1 = new Hora(12, 0, 0);
        Duracao d1 = new Duracao(h1, 120);
        Duracao d2 = new Duracao(h1, 150);
        Etapa t1 = new Etapa(1);
        Etapa t2 = new Etapa(2);
        Etapa t3 = new Etapa(2);

        Etapa[] etapas = new Etapa[]{t1, t2, t3};
        Hora h4 = new Hora(12, 0, 0);
        Duracao d4 = new Duracao(h1, 120);
        Duracao d5 = new Duracao(h1, 160);
        Etapa t4 = new Etapa(1);
        Etapa t5 = new Etapa(2);
        Etapa t6 = new Etapa(2);

        Etapa[] etapas2 = new Etapa[]{t4, t5, t6};

        Ciclista c1 = new Ciclista(6, "Gabriel", "Natal", etapas);
        Ciclista c2 = new Ciclista(6, "Gabriel", "Natal", etapas2);
        c2.duracaoEtapa(t4);
        System.out.println(c2.duracaoEtapa(t6));
    }
}