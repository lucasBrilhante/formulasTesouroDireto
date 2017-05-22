package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import src.BTN;
import src.PrecisaoHelper;

public class BTNTest {

	private static final double PRECISAO_6 =  PrecisaoHelper.PRECISAO_6;
	private static final double PRECISAO_8 =  PrecisaoHelper.PRECISAO_8;
	private BTN btn;

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
		Assert.assertEquals(1100, precoUnitario, PRECISAO_6);
	}

	@Test
	public void testPrecoUnitario2() {
		double precoUnitario = btn.calculoPrecoUnitario(2000, 0.5);
		Assert.assertEquals(3000, precoUnitario, PRECISAO_6);
	}

	@Test
	public void testArredondamento(){
		double precoUnitario = btn.calculoPrecoUnitario(200.0000019, 1);
		Assert.assertEquals(400.000002, precoUnitario, PRECISAO_6);
	}

	@Test
	public void testCalculoFj(){
		double fj = btn.ObterFj(10, 2);
		Assert.assertEquals(0.01601186, fj, PRECISAO_8);
	}

	@Test
	public void testCalculoFj2(){
		double fj = btn.ObterFj(20, 4);
		Assert.assertEquals(0.062658569, fj, PRECISAO_8);
	}

	@Test
	public void testCalculoJuros(){
		double juros = btn.ObterJuros(0.062658569, 400);
		Assert.assertEquals(25.0634276, juros, PRECISAO_6);
	}

	@Test
	public void testCalculoJuros2(){
		double juros = btn.ObterJuros(0.01601186, 800);
		Assert.assertEquals(12.809488, juros, PRECISAO_6);
	}

	@Test
	public void testCalculoPrincipal(){
		double principal = btn.ObterPrincipal(400.000002, 3);
		Assert.assertEquals(1200.000006, principal, PRECISAO_6);
	}

	@Test
	public void testCalculoPrincipal2(){
		double principal = btn.ObterPrincipal(399, 2);
		Assert.assertEquals(798, principal, PRECISAO_6);
	}
}
