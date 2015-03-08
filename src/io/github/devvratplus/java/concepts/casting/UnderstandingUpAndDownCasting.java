package io.github.devvratplus.java.concepts.casting;

public class UnderstandingUpAndDownCasting {

	public static void main(String[] args) {

		Car car1 = new Car();
		HondaCity hc1 = new HondaCity();
		
		car1.start();
		car1.stop();
		
		hc1.start();
		hc1.accelerate();
		hc1.stop();
		
		//upcasting
		Car car2 = new HondaCity();
		car2.start();
		car2.stop();
		//error: car2.accelerate();
		
		//downcasting
		Car car3 = new HondaCity();
		HondaCity hc2 = (HondaCity) car3; 
		//car3 is actually referring to HondaCity object
		hc2.start();
		hc2.accelerate();
		hc2.stop();
		
		/*//Error - runtime exception
		Car car4 = new Car();
		HondaCity hc3 = (HondaCity) car4;
		// car4 is referring to Car object and will not be compatible
		//with HondaCity object
		hc3.start();*/
		
		//casting cannot be done on unrelated types
		
	}

}

class Car{
	
	public void start(){
		System.out.println("Car started.");
	}
	
	public void stop(){
		System.out.println("Car stopped.");
	}
}

class HondaCity extends Car {
	
	public void start(){
		System.out.println("City Started.");
	}
	
	public void accelerate(){
		System.out.println("City speeding up.");
	}
	
	public void stop(){
		System.out.println("City stopped.");
	}
}