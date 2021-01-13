package com.nanda.innerclass.normal;

public class Vehicles {
	
	interface Engine {
		
		public void buildEngine();
	}
	
	class Car implements Engine {

		public void buildEngine() {
			System.out.println("petrol engine");
			
		}
		
	}
	
	
	class Lorry implements Engine {

		public void buildEngine() {
			System.out.println("diesel engine");
			
		}
		
	}
	

}
