package classPTB2;

import static org.junit.Assert.*;

import org.junit.Test;

public class testPTB2 {

	@Test
	public void PTB2test1() {
		//	PTB2 pt = new PTB2();
		//String ktr = new String();
		assertEquals("Vo Nghiem", PTB2.giai(4,1,3));
	}

	
	@Test
	public void PTB2test2() {
		//PTB2 pt = new PTB2();
		//String ktr = new String();
		//ktr = pt.giai(1,-4,4);
		assertEquals( "2.0", PTB2.giai(1,-4,4));
	}
	
	
	@Test
	public void PTB2test3() {
		//PTB2 pt = new PTB2();
		//String ktr = new String();
		//ktr = pt.giai(4,-6,2);
		assertEquals( "2.0", PTB2.giai(1,-4,4));
	}
}
