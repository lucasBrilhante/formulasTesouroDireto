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
		double precoUnitario = btn.calculoPrecoUnitario();
		Assert.assertEquals(2000, precoUnitario, 0.000001);
	}
}
