package JUnitTestExamplePackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		jUnitFunctions j=new jUnitFunctions();
		int r=j.addint(100, 200);
	    assertEquals(300,r);
	}

}
