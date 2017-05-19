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
	
	@Test
	public void testeLFTCelic2() {
		double celic = LFT.calcCelic(3);
		Assert.assertEquals(0.00011730, celic,0.00000001);
	}
	
	@Test
	public void testeLFTCelic3() {
		double celic = LFT.calcCelic(10);
		Assert.assertEquals(0.00037828, celic,0.00000001);
	}
	@Test
	public void testeLFTC1() {
		double celic1 = LFT.calcCelic(10);
		double celic2 = LFT.calcCelic(3);
		
		double c = LFT.calcC(celic1, celic2);
		Assert.assertEquals(1.000495624, c, 0.00000001);
	}
	
	@Test
	public void testeLFTC2() {
		double celic1 = LFT.calcCelic(10);
		double celic2 = LFT.calcCelic(3);
		double celic3 = LFT.calcCelic(5);
		
		double c = LFT.calcC(celic1, celic2, celic3);
		Assert.assertEquals(1.00068935, c, 0.00000001);
	}
	@Test
	public void testeLFTC3() {
		double celic1 = LFT.calcCelic(10);
		
		double c = LFT.calcC(celic1);
		Assert.assertEquals(1.00037828, c, 0.00000001);
	}
	
	@Test
	public void testeLFTcalcLFT() {
		
		double lft = LFT.calcLFT(900.00, 1);
		Assert.assertEquals(1.000495624*900, lft, 0.00000001);
	}
	@Test
	public void testeLFTcalcLFT1() {
		
		double lft = LFT.calcLFT(900.00, 1.000495624);
		Assert.assertEquals(1.000495624*900, lft, 0.00000001);
	}
	
}
