package domain.produto;

import java.util.ArrayList;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class ProdutoTest {
	@Test
	public void Produto() {
		double valor = 123.4D;
		String nome = "abc";
		String descricao = "abc";
		ArrayList<String> comentarios = null;
		Produto expected = null;
		Produto actual = new Produto(valor, nome, descricao, comentarios);

		assertTrue(EqualsBuilder.reflectionEquals(expected, actual, false, null, true));
	}

	@Test
	public void getValor() {
		Produto p = null;
		double expected = 123.4D;
		double actual = p.getValor();

		assertEquals(expected, actual, 0.0000001D);
	}

	@Test
	public void setValor() {
		Produto p = null;
		double valor = 123.4D;
		p.setValor(valor);
	}

	@Test
	public void getNome() {
		Produto p = null;
		String expected = "abc";
		String actual = p.getNome();

		assertEquals(expected, actual);
	}

	@Test
	public void setNome() {
		Produto p = null;
		String nome = "abc";
		p.setNome(nome);
	}

	@Test
	public void getDescricao() {
		Produto p = null;
		String expected = "abc";
		String actual = p.getDescricao();

		assertEquals(expected, actual);
	}

	@Test
	public void setDescricao() {
		Produto p = null;
		String descricao = "abc";
		p.setDescricao(descricao);
	}

	@Test
	public void getComentarios() {
		Produto p = null;
		ArrayList<String> expected = null;
		ArrayList<String> actual = p.getComentarios();

		assertTrue(EqualsBuilder.reflectionEquals(expected, actual, false, null, true));
	}

	@Test
	public void setComentarios() {
		Produto p = null;
		ArrayList<String> comentarios = null;
		p.setComentarios(comentarios);
	}

	@Test
	public void getCodigoProduto() {
		Produto p = null;
		long expected = 123L;
		long actual = p.getCodigoProduto();

		assertEquals(expected, actual);
	}
}
