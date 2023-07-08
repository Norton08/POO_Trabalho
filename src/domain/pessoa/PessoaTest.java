package domain.pessoa;

import domain.endereco.Endereco;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest {
	@Test
	public void Pessoa() {
		String cpf = "abc";
		String nome = "abc";
		String telefone = "abc";
		String email = "abc";
		Endereco residencia = null;
		Pessoa expected = null;
		Pessoa actual = new Pessoa(cpf, nome, telefone, email, residencia);

		assertTrue(EqualsBuilder.reflectionEquals(expected, actual, false, null, true));
	}

	@Test
	public void getCpf() {
		Pessoa p = null;
		String expected = "abc";
		String actual = p.getCpf();

		assertEquals(expected, actual);
	}

	@Test
	public void getEmail() {
		Pessoa p = null;
		String expected = "abc";
		String actual = p.getEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void getNome() {
		Pessoa p = null;
		String expected = "abc";
		String actual = p.getNome();

		assertEquals(expected, actual);
	}

	@Test
	public void getResidencia() {
		Pessoa p = null;
		Endereco expected = null;
		Endereco actual = p.getResidencia();

		assertEquals(expected, actual);
	}

	@Test
	public void getTelefone() {
		Pessoa p = null;
		String expected = "abc";
		String actual = p.getTelefone();

		assertEquals(expected, actual);
	}

	@Test
	public void setCpf() {
		Pessoa p = null;
		String cpf = "abc";
		p.setCpf(cpf);
	}

	@Test
	public void setEmail() {
		Pessoa p = null;
		String email = "abc";
		p.setEmail(email);
	}

	@Test
	public void setNome() {
		Pessoa p = null;
		String nome = "abc";
		p.setNome(nome);
	}

	@Test
	public void setResidencia() {
		Pessoa p = null;
		Endereco residencia = null;
		p.setResidencia(residencia);
	}

	@Test
	public void setTelefone() {
		Pessoa p = null;
		String telefone = "abc";
		p.setTelefone(telefone);
	}
}
