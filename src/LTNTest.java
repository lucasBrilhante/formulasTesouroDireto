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
		Assert.assertEquals(999,621856515, n);
	}
}
