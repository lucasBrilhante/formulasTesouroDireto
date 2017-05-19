import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class NTNA6Test {

	private static final double PRECISAO_6 = PrecisaoHelper.PRECISAO_6;

	@Test
	public void testCalculoValorNominalAtualizado() {
		NTNA6 ntna6 = new NTNA6();
		double valorNominalAtualizado = ntna6.calcularValorNominalAtualizado(1.3, 2.1, 6279.15);
		Assert.assertEquals(3887.092857143, valorNominalAtualizado, PRECISAO_6);
	}
}
