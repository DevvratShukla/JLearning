package coreConceptsInJava;

public class UnderstandingInheretence {

	public static void main(String[] args) {

		Robo robot1 = new Robo();
		Droid droid1 = new Droid();
		
		Robo droid2 = new Droid();
		
		robot1.sayHello();
		robot1.switchOn();
		robot1.switchedOff();
		
		droid1.sayHello();
		droid1.switchOn();
		droid1.switchedOff();
		
		droid2.sayHello();
		droid2.switchOn();
		droid2.switchedOff();
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