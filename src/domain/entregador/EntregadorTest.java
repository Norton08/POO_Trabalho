package domain.entregador;

import domain.endereco.Endereco;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class EntregadorTest {
	@Test
	public void Entregador() {
		String cpf = "abc";
		String nome = "abc";
		String telefone = "abc";
		String email = "abc";
		Endereco endereco = null;
		String cnh = "abc";
		Entregador expected = null;
		Entregador actual = new Entregador(cpf, nome, telefone, email, endereco, cnh);

		assertTrue(EqualsBuilder.reflectionEquals(expected, actual, false, null, true));
	}

	@Test
	public void getCnh() {
		Entregador e = null;
		String expected = "abc";
		String actual = e.getCnh();

		assertEquals(expected, actual);
	}

	@Test
	public void getCodigoEntregador() {
		Entregador e = null;
		long expected = 123L;
		long actual = e.getCodigoEntregador();

		assertEquals(expected, actual);
	}

	@Test
	public void isDisponivel() {
		Entregador e = null;
		boolean expected = true;
		boolean actual = e.isDisponivel();

		assertEquals(expected, actual);
	}

	@Test
	public void setCnh() {
		Entregador e = null;
		String cnh = "abc";
		e.setCnh(cnh);
	}

	@Test
	public void setDisponivel() {
		Entregador e = null;
		boolean disponivel = true;
		e.setDisponivel(disponivel);
	}
}
