package domain.farmacia;

import domain.cidade.Cidade;
import domain.endereco.Endereco;
import java.util.Date;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class FarmarciaTest {
	@Test
	public void Farmarcia() {
		String cnpj = "abc";
		String razaoSocial = "abc";
		String nomeFantasia = "abc";
		String telefone = "abc";
		String email = "abc";
		Date horarioAtendimento = null;
		Endereco endereco = null;
		Cidade cidade = null;
		Farmarcia expected = null;
		Farmarcia actual = new Farmarcia(cnpj, razaoSocial, nomeFantasia, telefone, email, horarioAtendimento, endereco, cidade);

		assertTrue(EqualsBuilder.reflectionEquals(expected, actual, false, null, true));
	}

	@Test
	public void getCodigoFarmacia() {
		Farmarcia f = null;
		long expected = 123L;
		long actual = f.getCodigoFarmacia();

		assertEquals(expected, actual);
	}
}
