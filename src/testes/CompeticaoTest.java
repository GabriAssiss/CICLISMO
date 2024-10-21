package testes;

import main.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompeticaoTest {
    @Test
    public void testDiferencaCiclista() {
        Hora hora1 = new Hora(13, 0, 0);
        Duracao d1 = new Duracao(hora1, 100);
        Etapa[] etapas = {new Etapa(21, d1), new Etapa(10, d1)};
        Ciclista ciclista1 = new Ciclista(1, "João", "São Paulo", etapas);
        Ciclista ciclista2 = new Ciclista(2, "Pedro", "Rio de Janeiro", etapas);

        Data dataCompeticao = new Data(20, 10, 2024);
        Ciclista[] participantes = {ciclista1, ciclista2};
        Competicao competicao = new Competicao(dataCompeticao, 1, participantes);

        String resultado = competicao.diferencaCiclista(ciclista1, ciclista2);
        assertEquals("A diferença do ciclista 1 para o 2 foi: 0", resultado);
    }
}