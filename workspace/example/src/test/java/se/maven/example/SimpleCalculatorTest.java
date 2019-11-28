package se.maven.example;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import junit.framework.TestCase;

public class SimpleCalculatorTest{
	SimpleCalculator calc;
	
	@BeforeClass
	public static void setUpClass() {
		System.out.println("Test class started");
	}
	
	@AfterClass
	public static void tearDownClass() {
		System.out.println("Test class started");
	}
	
	@Before
	public void setUp() {
		System.out.println("Test Started");
		calc = new SimpleCalculator();
	}
	
	@After
	public void tearDown() {
		System.out.println("Test finished");
	}
	
	@Test
	@Category(functionGroup1Test.class)
	public void testAdd(){
		SimpleCalculator calc = new SimpleCalculator();
		calc.add(10, 20);
		assertEquals(30,calc.getResult());
	}
	
	@Test
	@Category(fucntionGroup2Test.class)
	public void testSub() {
		SimpleCalculator calc = new SimpleCalculator();
		calc.sub(10, 20);
		assertEquals(-10,calc.getResult());
	}
	@Test
	public void testInc() {
		SimpleCalculator calc = new SimpleCalculator();
		calc.inc(10);
		assertEquals(10,calc.getResult());
	}
	@Test(expected=InvaludArgumentException.class)
	public void testAddWithNegativeArgument() throws Exception{
		calc.addWithPositiveArgs(10, -20);
	}
}
