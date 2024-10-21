package main;

public class Competicao {
    private int edicaoCompeticao;
    private Data dataCompeticao;
    private Ciclista participantes[];
    private int LIMITEPARTICIPANTES = 200;

    public Competicao(Data dataCompeticao, int edicaoCompeticao, Ciclista[] participantes) {
        this.dataCompeticao = dataCompeticao;
        this.edicaoCompeticao = edicaoCompeticao;
        this.participantes = participantes;
    }

    public String vencedorEtapa(Ciclista ciclista1, Ciclista ciclista2, Etapa et1){
        Duracao duracaoEtapac1 = ciclista1.duracaoEtapa(et1);
        Duracao duracaoEtapac2 = ciclista2.duracaoEtapa(et1);
        if(duracaoEtapac1.maiorQue(duracaoEtapac2)) return "O ciclista 2 fez a etapa mais rápido que o 1";
        else if (duracaoEtapac2.maiorQue(duracaoEtapac1)) return "O ciclista 1 fez a etapa mais rápido que o 2";
        else return "Ambos fizeram a etapa no mesmo período de tempo";
    }
    public String diferencaCiclista(Ciclista ciclista1, Ciclista ciclista2){
        int diferenca1 = ciclista1.duracaoTotalEmSegundos() - ciclista2.duracaoTotalEmSegundos();
        int diferenca2 = ciclista2.duracaoTotalEmSegundos() - ciclista1.duracaoTotalEmSegundos();
        if(ciclista1.duracaoTotalEmSegundos() >= ciclista2.duracaoTotalEmSegundos())
            return "A diferença do ciclista 1 para o 2 foi: " + diferenca1;
        else
            return"A diferença do ciclista 1 para o 2 foi: " + diferenca2;

    }
}
