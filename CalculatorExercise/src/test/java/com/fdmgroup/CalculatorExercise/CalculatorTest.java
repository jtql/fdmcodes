package com.fdmgroup.CalculatorExercise;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	Calculator cal = new Calculator();
	
	@Test
	public void testEvaluateReturnsDoubleFourWhenStringFourIsPassedIn() {
//		Calculator cal = new Calculator();
		String expression = "4";
		assertEquals(4.0, cal.evaluate(expression), 0.0);
	}

	@Test
	public void testEvaluateReturnsDoubleFiveWhenStringFiveIsPassedIn() {
//		Calculator cal = new Calculator();
		String expression = "5";
		assertEquals(5.0, cal.evaluate(expression), 0.0);
	}
	
	@Test
	public void testEvaluateReturnsDoubleFourWhenStringTwoPlusTwoIsPassedIn() {
//		Calculator cal = new Calculator();
		String expression = "2+2";
		assertEquals(4.0, cal.evaluate(expression), 0.0);
	}
	
	@Test
	public void testEvaluateReturnsDoubleFiveWhenStringTwoPlusThreeIsPassedIn() {
//		Calculator cal = new Calculator();
		String expression = "2+3";
		assertEquals(5.0, cal.evaluate(expression), 0.0);
	}
	
	@Test
	public void testEvaluateReturnsDoubleThreePointTwoFiveWhenStringSixTimesEightDivideFourPlusSixMinusNineMinusFiveDivideFourTimesThreeMinusEightPlusSixIsPassedIn() {
//		Calculator cal = new Calculator();
		String expression = "6*8/4+6-9-5/4*3-8+6";
		assertEquals(3.25, cal.evaluate(expression), 0.0);
	}
	@Test
	public void testEvaluateReturnsDoubleElevenPointTwoFiveWhenStringSixTimesEightDivideFourPlusSixMinusNineMinusFiveDivideFourTimesThreePlusSixIsPassedIn() {
//		Calculator cal = new Calculator();
		String expression = "6*8/4+6-9-5/4*3+6";
		assertEquals(11.25, cal.evaluate(expression), 0.0);
	}
	@Test
	public void testEvaluateReturnsDoubleFivePointTwoFiveWhenStringSixTimesEightDivideFourPlusSixMinusNineMinusFiveDivideFourTimesThreeIsPassedIn() {
//		Calculator cal = new Calculator();
		String expression = "6*8/4+6-9-5/4*3";
		assertEquals(5.25, cal.evaluate(expression), 0.0);
	}
	@Test
	public void testEvaluateReturnsDoubleSevenPointSevenFiveWhenStringSixTimesEightDivideFourPlusSixMinusNineMinusFiveDivideFourIsPassedIn() {
//		Calculator cal = new Calculator();
		String expression = "6*8/4+6-9-5/4";
		assertEquals(7.75, cal.evaluate(expression), 0.0);
	}
	@Test
	public void testEvaluateReturnsDoubleFourWhenStringSixTimesEightDivideFourPlusSixMinusNineMinusFiveIsPassedIn() {
//		Calculator cal = new Calculator();
		String expression = "6*8/4+6-9-5";
		assertEquals(4.0, cal.evaluate(expression), 0.0);
	}
	@Test
	public void testEvaluateReturnsDoubleEighteenWhenStringSixTimesEightDivideFourPlusSixIsPassedIn() {
//		Calculator cal = new Calculator();
		String expression = "6*8/4+6";
		assertEquals(18.0, cal.evaluate(expression), 0.0);
	}
	@Test
	public void testEvaluateReturnsDoubleNineWhenStringSixTimesEightDivideFourPlusSixMinusNineIsPassedIn() {
//		Calculator cal = new Calculator();
		String expression = "6*8/4+6-9";
		assertEquals(9.0, cal.evaluate(expression), 0.0);
	}
	@Test
	public void testEvaluateReturnsDoubleTwelveWhenStringSixTimesEightDivideFourIsPassedIn() {
//		Calculator cal = new Calculator();
		String expression = "6*8/4";
		assertEquals(12.0, cal.evaluate(expression), 0.0);
	}
	@Test
	public void testEvaluateReturnsDoubleFortyEightWhenStringSixTimesEightIsPassedIn() {
//		Calculator cal = new Calculator();
		String expression = "6*8";
		assertEquals(48.0, cal.evaluate(expression), 0.0);
	}
	@Test
	public void testEvaluateReturnsDoubleTwoWhenStringSixteenDivideEightIsPassedIn() {
//		Calculator cal = new Calculator();
		String expression = "16/8";
		assertEquals(2.0, cal.evaluate(expression), 0.0);
	}
	@Test
	public void testEvaluateReturnsDoubleOneWhenThreePlusTwoInBracketsDivideFiveIsPassedIn() {
//		Calculator cal = new Calculator();
		String expression = "(3+2)/5";
		assertEquals(1.0, cal.evaluate(expression), 0.0);
	}
	public void testEvaluateReturnsDoubleThirteenPointSixWhenThreePointFourMultiplyFourInBracketsDivideFiveIsPassedIn() {
//		Calculator cal = new Calculator();
		String expression = "3.4*4";
		assertEquals(13.6, cal.evaluate(expression), 0.0);
	}
	public void testEvaluateReturnsDoubleThreePointFiveWhenOnePointFivePlusThreeDivideOnePointFiveIsPassedIn() {
//		Calculator cal = new Calculator();
		String expression = "1.5+3/1.5";
		assertEquals(3.5, cal.evaluate(expression), 0.0);
	}
	public void testEvaluateReturnsDoubleNegThirteenWhenOneMinusSixTimesMinusTwoIsPassedIn() {
//		Calculator cal = new Calculator();
		String expression = "1-6*-2";
		assertEquals(3.5, cal.evaluate(expression), 0.0);
	}
	
}
