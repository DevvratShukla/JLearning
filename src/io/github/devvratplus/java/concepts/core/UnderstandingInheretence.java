package io.github.devvratplus.java.concepts.core;

public class UnderstandingInheretence {

	public static void main(String[] args) {

		Robo robot1 = new Robo();
		Droid droid1 = new Droid();
		
		Robo droid2 = new Droid();
		
		Chirpie ch1 = new Chirpie();
		
		System.out.println("Inside Robo class.");
		robot1.sayHello();
		robot1.switchOn();
		robot1.switchedOff();
		
		System.out.println("Inside Droid class.");
		droid1.sayHello();
		droid1.switchOn();
		droid1.switchedOff();
		
		System.out.println("Inside Droid class.");
		droid2.sayHello();
		droid2.switchOn();
		droid2.switchedOff();
		
		System.out.println("Inside Chirpie class.");
		ch1.sayHello();
		ch1.switchOn();
		ch1.switchedOff();
		
	}

}

class Robo{
	
	public void sayHello(){
		System.out.println("Hastalaista Baebay!");
	}
	
	public void switchOn(){
		System.out.println("Robot is switched on!");
	}
	
	public void switchedOff(){
		System.out.println("Robot is switched off!");
	}
}

class Droid extends Robo{
	
	public void switchOn(){
		System.out.println("Droid is switched on!");
	}
	public void switchedOff(){
		System.out.println("Droid is switched off!");
	}
	
}

class Chirpie extends Droid{

}