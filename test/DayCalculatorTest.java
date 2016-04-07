import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DayCalculatorTest {

	DayCalculator DayCalculator;
	@Before
	public void setUp() throws Exception {
		DayCalculator DayCalculator = new DayCalculator();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test00010101() {
		assertEquals("Mon",DayCalculator.getday(1, 1, 1));	
	}
	@Test
	public void test00010102() {
		assertEquals("Tue",DayCalculator.getday(1, 1, 2));
	}
	@Test
	public void test00010103() {
		assertEquals("Wen",DayCalculator.getday(1, 1, 3));
	}
	@Test
	public void test00010104() {
		assertEquals("Thu",DayCalculator.getday(1, 1, 4));
	}
	@Test
	public void test00010105() {
		assertEquals("Fri",DayCalculator.getday(1, 1, 5));
	}
	@Test
	public void test00010110() {
		assertEquals("Wen",DayCalculator.getday(1, 1, 10));
	}	
	@Test
	public void test00010201() {
		assertEquals("Thu",DayCalculator.getday(1, 2, 1));	
	}
	@Test
	public void test00010202() {
		assertEquals("Fri",DayCalculator.getday(1, 2, 2));	

	}
	@Test
	public void test00010401() {
		assertEquals("Fri",DayCalculator.getday(1, 4, 1));	
	}
	
	@Test
	public void test00020101() {
		assertEquals("Tue",DayCalculator.getday(2, 1, 1));	
	}
	@Test
	public void test00030101() {
		assertEquals("Wen",DayCalculator.getday(3, 1, 1));	
	}
	@Test
	public void test00430101() {
		assertEquals("Thu",DayCalculator.getday(4, 1, 1));	
	}
	
	@Ignore
	public void test20160407() {
		assertEquals("Thu",DayCalculator.getday(2016, 4, 7));	
	}
	@Test
	public void testIsLeap1() {
		assertFalse(DayCalculator.isLeap(1));	
	}
	@Test
	public void testIsLeap2() {
		assertFalse(DayCalculator.isLeap(2));	
	}
	@Test
	public void testIsLeap3() {
		assertFalse(DayCalculator.isLeap(3));	
	}
	@Test
	public void testIsLeap4() {
		assertTrue(DayCalculator.isLeap(4));	
	}
	@Test
	public void testIsLeap5() {
		assertFalse(DayCalculator.isLeap(5));	
	}
	@Test
	public void testIsLeap8() {
		assertTrue(DayCalculator.isLeap(8));	
	}
	@Test
	public void testIsLeap100() {
		assertFalse(DayCalculator.isLeap(100));	
	}
	@Test
	public void testIsLeap200() {
		assertFalse(DayCalculator.isLeap(200));	
	}
	@Test
	public void testIsLeap400() {
		assertTrue(DayCalculator.isLeap(400));	
	}
	
}
