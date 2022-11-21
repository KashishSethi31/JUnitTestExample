package JUnitTestExamplePackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddString {

	@Test
	void test() {
		jUnitFunctions j=new jUnitFunctions();
		String r = j.addstr("Hello","World");
		assertEquals("Hello World",r);
	}

}
