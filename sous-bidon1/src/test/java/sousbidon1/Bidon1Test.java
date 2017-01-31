package sousbidon1;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by charlie on 31/01/2017.
 */
public class Bidon1Test {
	@Test
	public void getBidon() throws Exception {
		Assert.assertEquals(new Bidon1().getBidon(), "bidon1");
	}

}
