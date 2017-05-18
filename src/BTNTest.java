import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BTNTest {

	BTN btn;
	double erro =  0.000001;
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
		Assert.assertEquals(1100, precoUnitario, erro);
	}
	
	@Test
	public void testPrecoUnitario2() {
		double precoUnitario = btn.calculoPrecoUnitario(2000, 0.5);
		Assert.assertEquals(3000, precoUnitario, erro);
	}
	@Test
	public void testArredondamento(){
		double precoUnitario = btn.calculoPrecoUnitario(200.0000019, 1);
		Assert.assertEquals(400.000002, precoUnitario, erro);
	}
	@Test
	public void testCalculoFj(){
		double fj = btn.ObterFj(10, 2);
		Assert.assertEquals(0.01601186, fj, 0.00000001);
	}
	@Test
	public void testCalculoFj2(){
		double fj = btn.ObterFj(20, 4);
		Assert.assertEquals(0.062658569, fj, 0.00000001);
	}
	@Test
	public void testCalculoJuros(){
		double juros = btn.ObterJuros(0.062658569, 400);
		Assert.assertEquals(25,0634276, juros, erro);
	}
}
