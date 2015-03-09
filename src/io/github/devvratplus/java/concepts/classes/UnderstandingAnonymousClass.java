package io.github.devvratplus.java.concepts.classes;

public class UnderstandingAnonymousClass {

	public static void main(String[] args) {

		Car car = new Car();
		car.start();
		
		Car car1 = new Car(){
			@Override public void start(){
				System.out.println("Merc started");
			}
		};
		car1.start();
		
		Car car2 = new Car(){ //Anonymous class implementation
			@Override public void start(){
				System.out.println("BMW started");
			}
			
			/*public void stop(){ // only overridden methods can be called 
				System.out.println("BMW stopped");
			}*/
		};
		car2.start();
		//car2.stop();  // error
		
		Plant plant = new Plant(){

			@Override
			public void grow() {
				System.out.println("Oak growing..");				
			}
			
			public void shedLeaves(){
				System.out.println("Oak Shedding leaves..");
				}
			};
			plant.grow();
			plant.shedLeaves();	
			
		Mobile mobile = new Mobile() {
			
			@Override
			public void call() {
				System.out.println("Calling the dialed number");				
			}
		};	
		mobile.call();
	}

}

class Car {
	
	public void start(){
		System.out.println("Car starting");
	}
}

abstract class Plant {
	public abstract void grow();
	public void shedLeaves(){
		System.out.println("Shedding leaves..");
	}
}

interface Mobile{
	public void call();
}