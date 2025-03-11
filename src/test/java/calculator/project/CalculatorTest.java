package calculator.project;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class CalculatorTest {
	Calculator calc;

	@Before
	public void setup() {
		calc = new Calculator();
	}
	@SuppressWarnings("deprecation")
	@Test
	public void addTwoNumbers() {
	Assert.assertEquals(20, calc.add(10, 10));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void addThreeNumbers() {
	Assert.assertEquals(20, calc.add(5,5, 10));
	}

	@SuppressWarnings("deprecation")
	@Test
	public void subractTwoNumbers() {
	Assert.assertEquals(0, calc.subract(10, 10));
	}

	
	@SuppressWarnings("deprecation")
	@Test
	public void subractThreeNumbers() {
	Assert.assertEquals(0, calc.subract(20,10, 10));
	}

	

}
