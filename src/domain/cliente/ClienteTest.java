package domain.cliente;

import domain.endereco.Endereco;
import java.util.Date;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {
	@Test
	public void Cliente() {
		String cpf = "abc";
		String nome = "abc";
		String telefone = "abc";
		String email = "abc";
		Endereco residencia = null;
		String numeroCartao = "abc";
		Date dataValidade = null;
		String codigoSeguranca = "abc";
		Cliente expected = null;
		Cliente actual = new Cliente(cpf, nome, telefone, email, residencia, numeroCartao, dataValidade,
		  codigoSeguranca);

		assertTrue(EqualsBuilder.reflectionEquals(expected, actual, false, null, true));
	}

	@Test
	public void getCodigoCliente() {
		Cliente c = null;
		long expected = 123L;
		long actual = c.getCodigoCliente();

		assertEquals(expected, actual);
	}

	@Test
	public void getCodigoSeguranca() {
		Cliente c = null;
		String expected = "abc";
		String actual = c.getCodigoSeguranca();

		assertEquals(expected, actual);
	}

	@Test
	public void getDataValidade() {
		Cliente c = null;
		Date expected = null;
		Date actual = c.getDataValidade();

		assertEquals(expected, actual);
	}

	@Test
	public void getNumeroCartao() {
		Cliente c = null;
		String expected = "abc";
		String actual = c.getNumeroCartao();

		assertEquals(expected, actual);
	}

	@Test
	public void setCodigoCliente() {
		Cliente c = null;
		long codigoCliente = 123L;
		c.setCodigoCliente(codigoCliente);
	}

	@Test
	public void setCodigoSeguranca() {
		Cliente c = null;
		String codigoSeguranca = "abc";
		c.setCodigoSeguranca(codigoSeguranca);
	}

	@Test
	public void setDataValidade() {
		Cliente c = null;
		Date dataValidade = null;
		c.setDataValidade(dataValidade);
	}

	@Test
	public void setNumeroCartao() {
		Cliente c = null;
		String numeroCartao = "abc";
		c.setNumeroCartao(numeroCartao);
	}
}
