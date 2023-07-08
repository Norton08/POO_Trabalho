package domain.petShop;

import domain.cidade.Cidade;
import domain.endereco.Endereco;
import java.util.Date;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class PetShopTest {
	@Test
	public void PetShop() {
		String cnpj = "abc";
		String razaoSocial = "abc";
		String nomeFantasia = "abc";
		String telefone = "abc";
		String email = "abc";
		Date horarioAtendimento = null;
		Endereco endereco = null;
		Cidade cidade = null;
		PetShop expected = null;
		PetShop actual = new PetShop(cnpj, razaoSocial, nomeFantasia, telefone, email, horarioAtendimento, endereco, cidade);

		assertTrue(EqualsBuilder.reflectionEquals(expected, actual, false, null, true));
	}

	@Test
	public void getCodigoPetShop() {
		PetShop p = null;
		long expected = 123L;
		long actual = p.getCodigoPetShop();

		assertEquals(expected, actual);
	}
}
