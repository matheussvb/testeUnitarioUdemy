package br.ce.wcaquino.servicos;

import br.ce.wcaquino.entidades.Filme;
import br.ce.wcaquino.entidades.Locacao;
import br.ce.wcaquino.entidades.Usuario;
import br.ce.wcaquino.utils.DataUtils;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import javax.xml.crypto.Data;

import java.util.Date;

import static br.ce.wcaquino.utils.DataUtils.isMesmaData;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LocacaoServiceTest {

    @Rule
    public ErrorCollector error = new ErrorCollector();


    @Test
    public void testeLocacao() {
        //cenario
        LocacaoService locacaoService = new LocacaoService();
        Usuario usuario = new Usuario();
        Filme filme = new Filme("Filme 1", 2, 5.0);

        //acao
        Locacao locacao = locacaoService.alugarFilme(usuario, filme);

        //verificacao
//        assertEquals(5.0, locacao.getValor(), 0.01);
//        assertThat(locacao.getValor(), is(equalTo(5.0)));
        assertThat(locacao.getValor(), is(equalTo(5.0)));
        error.checkThat(locacao.getValor(), is(equalTo(5.0)));
        error.checkThat(isMesmaData(locacao.getDataLocacao(), new Date()), is(true));
//        assertTrue(DataUtils.isMesmaData(locacao.getDataLocacao(), new Date()));
//        assertTrue(DataUtils.isMesmaData(locacao.getDataRetorno(), DataUtils.obterDataComDiferencaDias(1)));

    }
}
