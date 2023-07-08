package domain.pedido;

import enumss.Status;
import jdk.jfr.Timespan;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {
	@Test
	public void Pedido() {
		int codigoPedido = 123;
		Timespan tempoEstimado = null;
		Status status = null;
		Pedido expected = null;
		Pedido actual = new Pedido(codigoPedido, tempoEstimado, status);

		assertTrue(EqualsBuilder.reflectionEquals(expected, actual, false, null, true));
	}

	@Test
	public void getCodigoPedido() {
		Pedido p = null;
		long expected = 123L;
		long actual = p.getCodigoPedido();

		assertEquals(expected, actual);
	}

	@Test
	public void getStatus() {
		Pedido p = null;
		Status expected = null;
		Status actual = p.getStatus();

		assertEquals(expected, actual);
	}

	@Test
	public void getTempoEstimado() {
		Pedido p = null;
		Timespan expected = null;
		Timespan actual = p.getTempoEstimado();

		assertEquals(expected, actual);
	}

	@Test
	public void setStatus() {
		Pedido p = null;
		Status status = null;
		p.setStatus(status);
	}

	@Test
	public void setTempoEstimado() {
		Pedido p = null;
		Timespan tempoEstimado = null;
		p.setTempoEstimado(tempoEstimado);
	}
}
