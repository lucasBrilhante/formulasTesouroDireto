import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BTNTest {

	BTN btn;
	
	@Before
	public void setUp() throws Exception {

	}
	
	@Test
	public void testBTNNulo() {
		Assert.assertNotNull(btn);
	}
}
