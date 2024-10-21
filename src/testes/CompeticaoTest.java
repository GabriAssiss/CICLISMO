package testes;

import main.Ciclista;
import main.Competicao;
import main.Data;
import main.Etapa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompeticaoTest {
    @Test
    public void testDiferencaCiclista() {
        Etapa[] etapas = {new Etapa(100), new Etapa(200)};
        Ciclista ciclista1 = new Ciclista(1, "João", "São Paulo", etapas);
        Ciclista ciclista2 = new Ciclista(2, "Pedro", "Rio de Janeiro", etapas);

        Data dataCompeticao = new Data(2024, 10, 20);
        Ciclista[] participantes = {ciclista1, ciclista2};
        Competicao competicao = new Competicao(dataCompeticao, 1, participantes);

        String resultado = competicao.diferencaCiclista(ciclista1, ciclista2);
        assertEquals("A diferença do ciclista 1 para o 2 foi: 0", resultado);
    }
}