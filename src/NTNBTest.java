import org.junit.Assert;
import org.junit.Test;

public class NTNBTest {
	
	private static final double PRECISAO_6 = PrecisaoHelper.PRECISAO_6;

	@Test
	public void testCalculoValorNominal() {
		NTNB ntnb = new NTNB();
		double valorNominal = ntnb.calcularValorNominal(2000, 1500, 10000, 10, 20);
		Assert.assertEquals(15396.0071783, valorNominal, PRECISAO_6);
	}
	
	@Test
	public void testCalculoValorNominal2() {
		NTNB ntnb = new NTNB();
		double valorNominal = ntnb.calcularValorNominal(1700, 2500, 7000, 5, 3);
		Assert.assertEquals(2502.9670968, valorNominal, PRECISAO_6);
	}
}
