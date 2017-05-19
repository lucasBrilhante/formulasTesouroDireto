import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LFTBTest {

	LFTB lftb;
	@Before
	public void setUp() throws Exception {
		lftb = new LFTB();
	}

	@Test
	public void testNotNull(){
		Assert.assertNotNull(lftb);
	}

}
