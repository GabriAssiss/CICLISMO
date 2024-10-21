package testes;

import main.Duracao;
import main.Hora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuracaoTest {
    @Test
    public void testMaiorQue() {
        Hora horaInicial1 = new Hora(12, 0, 0);
        Hora horaInicial2 = new Hora(13, 0, 0);
        Duracao duracao1 = new Duracao(horaInicial1, 3600);
        Duracao duracao2 = new Duracao(horaInicial2, 1800);

        assertTrue(duracao1.maiorQue(duracao2));
        assertFalse(duracao2.maiorQue(duracao1));
    }
}