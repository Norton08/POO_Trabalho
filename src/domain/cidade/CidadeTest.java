package domain.cidade;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CidadeTest {
	@Test
	public void Cidade() {
		String estado = "abc";
		String pais = "abc";
		Cidade expected = null;
		Cidade actual = new Cidade(estado, pais);

		assertTrue(EqualsBuilder.reflectionEquals(expected, actual, false, null, true));
	}

	@Test
	public void getCodigoCidade() {
		Cidade c = null;
		long expected = 123L;
		long actual = c.getCodigoCidade();

		assertEquals(expected, actual);
	}

	@Test
	public void getEstado() {
		Cidade c = null;
		String expected = "abc";
		String actual = c.getEstado();

		assertEquals(expected, actual);
	}

	@Test
	public void getPais() {
		Cidade c = null;
		String expected = "abc";
		String actual = c.getPais();

		assertEquals(expected, actual);
	}

	@Test
	public void setEstado() {
		Cidade c = null;
		String estado = "abc";
		c.setEstado(estado);
	}

	@Test
	public void setPais() {
		Cidade c = null;
		String pais = "abc";
		c.setPais(pais);
	}
}
