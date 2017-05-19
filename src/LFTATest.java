import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class LFTATest {

	LFTA lfta;
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
		double C = lfta.calcC(0.0001,0.0002);
		double result = lfta.calcVNa(C,10000,0.0245,15,30,10,1);
		Assert.assertEquals(10003.0002, result,0.000001);
	}
	@Test
	public void testCalcVNa2(){
		double C = lfta.calcC(0.0001,0.0002);
		double result = lfta.calcVNa(C,5000,0.0245,30,30,5,1);
		Assert.assertEquals(5002.725467, result,0.000001);
	}

}
