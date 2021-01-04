package br.ce.wcaquino.servicos;

import br.ce.wcaquino.entidades.Usuario;
import org.junit.Test;

import static org.junit.Assert.*;

public class AssertTest {

    @Test
    public void test() {
        assertEquals(0.51, 0.512, 0.01);
        int inteiro = 5;
        Integer integer = 5;
        assertEquals(integer, Integer.valueOf(inteiro));
        assertEquals("bola", "bola");
        assertTrue("bola".equalsIgnoreCase("Bola"));
        assertTrue("bola".startsWith("bo"));

        Usuario u1 = new Usuario("Usuario 1");
        Usuario u2 = new Usuario("Usuario 1");
        Usuario u3 = u2;
        Usuario u4 = null;


        assertEquals(u1, u2);
        assertSame(u2, u3); // compara a instancia dos objetos

        assertNotNull(u3);

        assertNull(u4);

        assertEquals("Erro de comparação", "Julieta", "Julieta");

    }
}
