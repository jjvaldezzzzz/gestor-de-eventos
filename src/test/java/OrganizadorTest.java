import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.projeto.Organizador;

import static org.junit.jupiter.api.Assertions.*;

public class OrganizadorTest {
    private Organizador organizador;

    @BeforeEach
    void setUp() {
        organizador = new Organizador();
    }

    @Test
    void testCadastrarEvento() {
        assertEquals(true, organizador.cadastrar("Evento A", "2024-10-09", "Local A", 100));
    }

    @Test
    void testExcluirEvento() {
        organizador.cadastrar("Evento B", "2024-11-01", "Local B", 50);
        assertEquals(true, organizador.excluir("Evento B") );
    }

    @Test
    void testSeInscreverEvento() {
        organizador.cadastrar("Evento C", "2024-12-01", "Local C", 30);
        organizador.seInscrever("Evento C");
        assertEquals(true, organizador.seInscrever("Evento C"));
    }

    @Test
    void testBuscarEvento() {
        organizador.cadastrar("Evento D", "2024-12-15", "Local D", 80);
        assertEquals("Evento D - 2024-12-15 - Local D - 80", organizador.buscar("Evento D"));
    }

    @Test
    void testListarEventos() {
        organizador.cadastrar("Evento E", "2024-12-31", "Local E", 70);
        organizador.cadastrar("Evento F", "2025-01-10", "Local F", 50);
        boolean resposta = organizador.listar();
        assertEquals(true, resposta);
    }
}

