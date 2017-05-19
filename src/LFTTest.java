import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LFTTest {

	LFT lft;
	@Before
	public void setUp() throws Exception {
		lft = new LFT();
	}

	@Test
	public void testLFTNull() {
		Assert.assertNotNull(lft);
	}
	
	
	@Test
	public void testeLFTCelic1() {
		double celic = LFT.calcCelic(5);
		Assert.assertEquals(0.00019363, celic,0.00000001);
	}
}
