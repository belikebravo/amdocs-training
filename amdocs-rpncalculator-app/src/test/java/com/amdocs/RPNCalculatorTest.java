package com.amdocs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RPNCalculatorTest {
	@Test
	public void testSimpleAddition() {
	    RPNCalculator rpncalculator=new RPNCalculator();

	    double actualResult=rpncalculator.evaluate("10 15 +");
	    double expectedResult=25.0;
	    assertEquals(expectedResult, actualResult,0.0001);
	   
}
	@Test
	public void testSimpleSubtratction() {
    RPNCalculator rpncalculator=new RPNCalculator();
    
    double actualResult=rpncalculator.evaluate("10 15 -");
    double expectedResult=-5;
    assertEquals(expectedResult, actualResult,0.0001);
   
}
	@Test
	public void testSimplemultiplication() {
    RPNCalculator rpncalculator=new RPNCalculator();
    
    double actualResult=rpncalculator.evaluate("10 15 *");
    double expectedResult=150;
    assertEquals(expectedResult, actualResult,0.0001);
   
}
	@Test
	public void testSimpleDivision() {
    RPNCalculator rpncalculator=new RPNCalculator();
    
    double actualResult=rpncalculator.evaluate("15 10 /");
    double expectedResult=1.5;
    assertEquals(expectedResult, actualResult,0.0001);
   
}
	@Test
	public void testRPNExpression() {
    RPNCalculator rpncalculator=new RPNCalculator();
    
    double actualResult=rpncalculator.evaluate("10 5 * 100 20 / -");
    double expectedResult=45;
    assertEquals(expectedResult, actualResult,0.0001);
   
}
	}


