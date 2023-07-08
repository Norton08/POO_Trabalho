package domain.restaurante;

import domain.cidade.Cidade;
import domain.endereco.Endereco;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class RestauranteTest {
	@Test
	public void Restaurante() {
		String cnpj = "abc";
		String razaoSocial = "abc";
		String nomeFantasia = "abc";
		String telefone = "abc";
		String email = "abc";
		Date horarioAtendimento = null;
		Endereco endereco = null;
		Cidade cidade = null;
		Restaurante expected = null;
		Restaurante actual = new Restaurante(cnpj, razaoSocial, nomeFantasia, telefone, email, horarioAtendimento, endereco, cidade);

		assertTrue(EqualsBuilder.reflectionEquals(expected, actual, false, null, true));
	}

	@Test
	public void getCodigoRestaurante() {
		Restaurante r = null;
		long expected = 123L;
		long actual = r.getCodigoRestaurante();

		assertEquals(expected, actual);
	}

	@Test
	public void setCodigoRestaurante() {
		Restaurante r = null;
		long codigoRestaurante = 123L;
		r.setCodigoRestaurante(codigoRestaurante);
	}
}
