import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BTNTest {

	BTN btn;
	
	@Before
	public void setUp() throws Exception {
		btn = new BTN();
	}
	
	@Test
	public void testBTNNulo() {
		Assert.assertNotNull(btn);
	}
	
	@Test
	public void testPrecoUnitario() {
		double precoUnitario = btn.calculoPrecoUnitario(1000, 0.1);
		Assert.assertEquals(1100, precoUnitario, 0.000001);
	}
	
	@Test
	public void testPrecoUnitario2() {
		double precoUnitario = btn.calculoPrecoUnitario(2000, 0.5);
		Assert.assertEquals(3000, precoUnitario, 0.000001);
	}
}
