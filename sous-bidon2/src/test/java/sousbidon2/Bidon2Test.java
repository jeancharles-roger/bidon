package sousbidon2;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by charlie on 31/01/2017.
 */
public class Bidon2Test {
	@Test
	public void getBidon() throws Exception {
		Assert.assertEquals(new Bidon2().getBidon(), "bidon2");
	}

}
