package com.nanda.patterns;

public class CalculateFactory {
	
	
	enum Calc {
		
		ADD,
		Divide;
	}
	
	public Calculate getCalculate(final Calc calc) {
		
		if (calc == Calc.Divide) {
			return new Divide();
		}
		
		if (calc == Calc.ADD) {
			return new AddCalc();
		}
		
		return null;
		
		
	}

}
