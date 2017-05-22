package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import src.LFT;
import src.LFTA;
import src.PrecisaoHelper;

public class LFTATest {

	private static final double PRECISAO_6 =  PrecisaoHelper.PRECISAO_6;
	private LFTA lfta;

	@Before
	public void setUp() throws Exception {
		lfta = new LFTA();
	}

	@Test
	public void testNotNull() {
		Assert.assertNotNull(lfta);
	}

	@Test
	public void testCalcVNa(){
		double C = LFT.calcC(0.0001, 0.0002);
		double result = lfta.calcVNa(C, 10000, 0.0245, 15, 30, 10, 1);
		Assert.assertEquals(10003.0002, result, PRECISAO_6);
	}

	@Test
	public void testCalcVNa2(){
		double C = LFT.calcC(0.0001, 0.0002);
		double result = lfta.calcVNa(C, 5000, 0.0245, 30, 30, 5, 1);
		Assert.assertEquals(5002.725467, result, PRECISAO_6);
	}
}
