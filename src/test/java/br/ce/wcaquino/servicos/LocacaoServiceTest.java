package br.ce.wcaquino.servicos;

import br.ce.wcaquino.entidades.Filme;
import br.ce.wcaquino.entidades.Locacao;
import br.ce.wcaquino.entidades.Usuario;
import br.ce.wcaquino.utils.DataUtils;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LocacaoServiceTest {

    @Test
    public void teste() {
        //cenario
        LocacaoService locacaoService = new LocacaoService();
        Usuario usuario = new Usuario();
        Filme filme = new Filme("Filme 1", 2, 5.0);

        //acao
        Locacao locacao = locacaoService.alugarFilme(usuario, filme);

        //verificacao
        assertEquals(5.0, locacao.getValor(), 0.01);
        assertTrue(DataUtils.isMesmaData(locacao.getDataLocacao(), new Date()));
        assertTrue(DataUtils.isMesmaData(locacao.getDataRetorno(), DataUtils.obterDataComDiferencaDias(1)));
    }
}
