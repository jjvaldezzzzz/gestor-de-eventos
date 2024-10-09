import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.projeto.Evento;

import static org.junit.jupiter.api.Assertions.*;


public class EventoTest {
    private Evento evento;

    @BeforeEach
    void setUp() {
        evento = new Evento("Nome do Evento", "2024-10-09", "Local do Evento", 100);
    }

    @Test
    void testGetters() {
        assertEquals("Nome do Evento", evento.getNome());
        assertEquals("2024-10-09", evento.getData());
        assertEquals("Local do Evento", evento.getLocal());
        assertEquals(100, evento.getMAX_DE_PARTICIPANTES());
        assertEquals(100, evento.getVagasDisponiveis());
    }

    @Test
    void testSetters() {
        evento.setNome("Novo Nome");
        evento.setData("2024-11-01");
        evento.setLocal("Novo Local");
        evento.setMAX_DE_PARTICIPANTES(200);
        evento.setVagasDisponiveis(150);

        assertEquals("Novo Nome", evento.getNome());
        assertEquals("2024-11-01", evento.getData());
        assertEquals("Novo Local", evento.getLocal());
        assertEquals(200, evento.getMAX_DE_PARTICIPANTES());
        assertEquals(150, evento.getVagasDisponiveis());
    }
}

