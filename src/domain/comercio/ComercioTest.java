package domain.comercio;

import domain.cidade.Cidade;
import domain.endereco.Endereco;
import java.util.Date;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class ComercioTest {
	@Test
	public void Comercio() {
		String cnpj = "abc";
		String razaoSocial = "abc";
		String nomeFantasia = "abc";
		String telefone = "abc";
		String email = "abc";
		Date horarioAtendimento = null;
		Endereco endereco = null;
		Cidade cidade = null;
		Comercio expected = null;
		Comercio actual = new Comercio(cnpj, razaoSocial, nomeFantasia, telefone, email, horarioAtendimento, endereco, cidade);

		assertTrue(EqualsBuilder.reflectionEquals(expected, actual, false, null, true));
	}

	@Test
	public void cadastrar() {
		Comercio.cadastrar();
	}

	@Test
	public void getCidade() {
		Comercio c = null;
		Cidade expected = null;
		Cidade actual = c.getCidade();

		assertEquals(expected, actual);
	}

	@Test
	public void getCnpj() {
		Comercio c = null;
		String expected = "abc";
		String actual = c.getCnpj();

		assertEquals(expected, actual);
	}

	@Test
	public void getEmail() {
		Comercio c = null;
		String expected = "abc";
		String actual = c.getEmail();

		assertEquals(expected, actual);
	}

	@Test
	public void getEndereco() {
		Comercio c = null;
		Endereco expected = null;
		Endereco actual = c.getEndereco();

		assertEquals(expected, actual);
	}

	@Test
	public void getHorarioAtendimento() {
		Comercio c = null;
		Date expected = null;
		Date actual = c.getHorarioAtendimento();

		assertEquals(expected, actual);
	}

	@Test
	public void getNomeFantasia() {
		Comercio c = null;
		String expected = "abc";
		String actual = c.getNomeFantasia();

		assertEquals(expected, actual);
	}

	@Test
	public void getRazaoSocial() {
		Comercio c = null;
		String expected = "abc";
		String actual = c.getRazaoSocial();

		assertEquals(expected, actual);
	}

	@Test
	public void getTelefone() {
		Comercio c = null;
		String expected = "abc";
		String actual = c.getTelefone();

		assertEquals(expected, actual);
	}

	@Test
	public void setCidade() {
		Comercio c = null;
		Cidade cidade = null;
		c.setCidade(cidade);
	}

	@Test
	public void setCnpj() {
		Comercio c = null;
		String cnpj = "abc";
		c.setCnpj(cnpj);
	}

	@Test
	public void setEmail() {
		Comercio c = null;
		String email = "abc";
		c.setEmail(email);
	}

	@Test
	public void setEndereco() {
		Comercio c = null;
		Endereco endereco = null;
		c.setEndereco(endereco);
	}

	@Test
	public void setHorarioAtendimento() {
		Comercio c = null;
		Date horarioAtendimento = null;
		c.setHorarioAtendimento(horarioAtendimento);
	}

	@Test
	public void setNomeFantasia() {
		Comercio c = null;
		String nomeFantasia = "abc";
		c.setNomeFantasia(nomeFantasia);
	}

	@Test
	public void setRazaoSocial() {
		Comercio c = null;
		String razaoSocial = "abc";
		c.setRazaoSocial(razaoSocial);
	}

	@Test
	public void setTelefone() {
		Comercio c = null;
		String telefone = "abc";
		c.setTelefone(telefone);
	}
}
