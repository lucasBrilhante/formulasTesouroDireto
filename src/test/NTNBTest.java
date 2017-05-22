package test;

import org.junit.Assert;
import org.junit.Test;

import src.NTNB;
import src.PrecisaoHelper;

public class NTNBTest {

	private static final double PRECISAO_6 = PrecisaoHelper.PRECISAO_6;

	@Test
	public void testCalculoValorNominal() {
		NTNB ntnb = new NTNB();
		double valorNominal = ntnb.calcularValorNominal(2000, 1500, 1700, 10000, 10, 20);
		Assert.assertEquals(14194.41726459, valorNominal, PRECISAO_6);
	}

	@Test
	public void testCalculoValorNominal2() {
		NTNB ntnb = new NTNB();
		double valorNominal = ntnb.calcularValorNominal(1700, 2500, 2000, 7000, 5, 3);
		Assert.assertEquals(3281.634919856, valorNominal, PRECISAO_6);
	}

	@Test
	public void tetCalculoJuros() {
		NTNB ntnb = new NTNB();
		double juros = ntnb.calcularJuros(5000, 7, 20, 10, 10);
		Assert.assertEquals(140.9439726, juros, PRECISAO_6);
	}
}
