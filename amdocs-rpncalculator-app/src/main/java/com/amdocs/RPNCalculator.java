package com.amdocs;

import java.util.Stack;

public class RPNCalculator {
  
	   private Stack<Double> numberStack;
	   private double firstNumber,secondNumber,result;
	public RPNCalculator()
	{
		   numberStack=new Stack<Double>();
		   firstNumber=secondNumber=result=0.0;
	}
	   
	public double evaluate(String rpnMathExpression) {
		// TODO Auto-generated method stub
		String[] rpnTokens=rpnMathExpression.split(" ");
		
		IMathOperation mathOperation=null;
		
		
		for(String token :rpnTokens)
		{
			if(ismathOperator( token))
			{
				  extract();
				  mathOperation=Mathfactory.getObject(token);
				  result=mathOperation.evaluate(firstNumber,secondNumber);
				  numberStack.push(result);
			}
		/*	
			if(token.equals("+"))
			{
				  add();
			}
			else if(token.equals("-"))
			{
				  subtract();
			}else if(token.equals("*"))
			{
				  multiplication();
			}else if(token.equals("/"))
			{
				  division();
			}
			*/
			else
				numberStack.push(Double.parseDouble(token));
			
			
		}
		
		
		return numberStack.pop();
	}

	private boolean ismathOperator(String token) {
		
		if(token.equals("+")||token.equals("-")||token.equals("*")||token.equals("/"))
		return true;
			// TODO Auto-generated method stub
		return false;
	}

	private void division() {
		extract();
		  result=secondNumber/firstNumber;
		  numberStack.push(result);
	}

	private void multiplication() {
		extract();
		  result=secondNumber*firstNumber;
		  numberStack.push(result);
	}

	private void subtract() {
		extract();
		  result=secondNumber-firstNumber;
		  numberStack.push(result);
	}

	private void add() {
		extract();
		  result=firstNumber+secondNumber;
		  numberStack.push(result);
	}

	private void extract() {
		firstNumber=numberStack.pop();
		  secondNumber=numberStack.pop();
	}

}
