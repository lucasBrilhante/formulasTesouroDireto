import org.junit.Assert;
import org.junit.Test;

public class NTNA3Test {
	
	private static final double PRECISAO_6 = PrecisaoHelper.PRECISAO_6;

	@Test
	public void testCalculoValorNominal() {
		NTNA3 ntna3 = new NTNA3();
		double valorNominal = ntna3.calcularValorNominal(2.7, 2.9);
		Assert.assertEquals(931.034482759, valorNominal, PRECISAO_6);
	}

	@Test
	public void testCalculoValorNominal2() {
		NTNA3 ntna3 = new NTNA3();
		double valorNominal = ntna3.calcularValorNominal(3.2, 1.7);
		Assert.assertEquals(1882.352941176, valorNominal, PRECISAO_6);
	}
}
