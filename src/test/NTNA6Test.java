package test;

import org.junit.Assert;
import org.junit.Test;

import src.NTNA6;
import src.PrecisaoHelper;

public class NTNA6Test {

	private static final double PRECISAO_6 = PrecisaoHelper.PRECISAO_6;

	@Test
	public void testCalculoValorNominalAtualizado() {
		NTNA6 ntna6 = new NTNA6();
		double valorNominalAtualizado = ntna6.calcularValorNominalAtualizado(1.3, 2.1, 6279.15);
		Assert.assertEquals(3887.092857143, valorNominalAtualizado, PRECISAO_6);
	}

	@Test
	public void testCalculoValorNominalAtualizado2() {
		NTNA6 ntna6 = new NTNA6();
		double valorNominalAtualizado = ntna6.calcularValorNominalAtualizado(3.0, 1.1, 312.546);
		Assert.assertEquals(852.398181818, valorNominalAtualizado, PRECISAO_6);
	}

	@Test
	public void testCalculoJuros() {
		NTNA6 ntna6 = new NTNA6();
		double juros = ntna6.calcularJuros(6000, "01/02/2017", "08/06/2017", 5);
		Assert.assertEquals(105.833333333, juros, PRECISAO_6);
	}

	@Test
	public void testCalculoJuros2() {
		NTNA6 ntna6 = new NTNA6();
		double juros = ntna6.calcularJuros(948, "03/01/2017", "30/01/2017", 0.09);
		Assert.assertEquals(0.006399, juros, PRECISAO_6);
	}
}
