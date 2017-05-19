import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LTNTest {
	LTN ltn;
	@Before
	public void setUp() throws Exception {
		ltn = new LTN();
	}

	@Test
	public void testNotNull() {
		Assert.assertNotNull(ltn);
	}
	@Test
	public void testCalculoLTN(){
		double n = ltn.calcLTN(0.1);
		Assert.assertEquals(999.621856, n,0.0000001);
	}
	@Test
	public void testCalculoLTN2(){
		double n = ltn.calcLTN(0.2);
		Assert.assertEquals(999.276763, n,0.0000001);
	}
	@Test
	public void testCalculoLTN3(){
		double n = ltn.calcLTN(0.3);
		Assert.assertEquals(998.959413, n,0.0000001);
	}
}
