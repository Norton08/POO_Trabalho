package domain.endereco;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class EnderecoTest {
	@Test
	public void Endereco() {
		String lote = "abc";
		String quadra = "abc";
		long numero = 123L;
		String cep = "abc";
		String complemento = "abc";
		String rua = "abc";
		Endereco expected = null;
		Endereco actual = new Endereco(lote, quadra, numero, cep, complemento, rua);

		assertTrue(EqualsBuilder.reflectionEquals(expected, actual, false, null, true));
	}

	@Test
	public void getCep() {
		Endereco e = null;
		String expected = "abc";
		String actual = e.getCep();

		assertEquals(expected, actual);
	}

	@Test
	public void getCodigoEndereco() {
		Endereco e = null;
		long expected = 123L;
		long actual = e.getCodigoEndereco();

		assertEquals(expected, actual);
	}

	@Test
	public void getComplemento() {
		Endereco e = null;
		String expected = "abc";
		String actual = e.getComplemento();

		assertEquals(expected, actual);
	}

	@Test
	public void getLote() {
		Endereco e = null;
		String expected = "abc";
		String actual = e.getLote();

		assertEquals(expected, actual);
	}

	@Test
	public void getNumero() {
		Endereco e = null;
		long expected = 123L;
		long actual = e.getNumero();

		assertEquals(expected, actual);
	}

	@Test
	public void getQuadra() {
		Endereco e = null;
		String expected = "abc";
		String actual = e.getQuadra();

		assertEquals(expected, actual);
	}

	@Test
	public void getRua() {
		Endereco e = null;
		String expected = "abc";
		String actual = e.getRua();

		assertEquals(expected, actual);
	}

	@Test
	public void setCep() {
		Endereco e = null;
		String cep = "abc";
		e.setCep(cep);
	}

	@Test
	public void setComplemento() {
		Endereco e = null;
		String complemento = "abc";
		e.setComplemento(complemento);
	}

	@Test
	public void setLote() {
		Endereco e = null;
		String lote = "abc";
		e.setLote(lote);
	}

	@Test
	public void setNumero() {
		Endereco e = null;
		long numero = 123L;
		e.setNumero(numero);
	}

	@Test
	public void setQuadra() {
		Endereco e = null;
		String quadra = "abc";
		e.setQuadra(quadra);
	}

	@Test
	public void setRua() {
		Endereco e = null;
		String rua = "abc";
		e.setRua(rua);
	}
}
