package com.nanda.patterns;

import com.nanda.patterns.CalculateFactory.Calc;

public class MyCalc {
	
	public static void main(String[] args) {
		
		CalculateFactory calc = new CalculateFactory();
		calc.getCalculate(Calc.ADD).calculate(10, 11);
		calc.getCalculate(Calc.Divide).calculate(10, 11);
	}

}
