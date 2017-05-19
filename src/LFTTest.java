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
	

}
