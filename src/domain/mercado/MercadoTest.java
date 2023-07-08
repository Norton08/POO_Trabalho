package domain.mercado;

import domain.cidade.Cidade;
import domain.endereco.Endereco;
import java.util.Date;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class MercadoTest {
	@Test
	public void Mercado() {
		String cnpj = "abc";
		String razaoSocial = "abc";
		String nomeFantasia = "abc";
		String telefone = "abc";
		String email = "abc";
		Date horarioAtendimento = null;
		Endereco endereco = null;
		Cidade cidade = null;
		Mercado expected = null;
		Mercado actual = new Mercado(cnpj, razaoSocial, nomeFantasia, telefone, email, horarioAtendimento, endereco, cidade);

		assertTrue(EqualsBuilder.reflectionEquals(expected, actual, false, null, true));
	}

	@Test
	public void getCodigoMercado() {
		Mercado m = null;
		long expected = 123L;
		long actual = m.getCodigoMercado();

		assertEquals(expected, actual);
	}
}
