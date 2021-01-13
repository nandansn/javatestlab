package com.nanda.innerclass.normal;

public interface Car {
	
	public int wheels();
	
	class DefaultCar implements Car {

		@Override
		public int wheels() {
			// TODO Auto-generated method stub
			return 3;
		}
		
		
		
	}

}
