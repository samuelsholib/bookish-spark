package javaForJUnit;

import org.junit.Test;

public class TestCalculatorClass {
	@Test
	public int TestAdditon() {
		return CalculaterClass.add(100, 100);
		
			}
	@Test
	public int TestSubtraction() {
		return CalculaterClass.sub(100, 80);
			}
	@Test
	public int TestMultiplication() {
	return CalculaterClass.mult(100, 100);
		}
	@Test
	public int TestDivision() {
	return CalculaterClass.div(100, 10);
		}

}
