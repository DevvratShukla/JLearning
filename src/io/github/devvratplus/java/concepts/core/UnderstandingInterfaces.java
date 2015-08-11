package io.github.devvratplus.java.concepts.core;

public class UnderstandingInterfaces {

	public static void main(String[] args) {
	
		Doctor doc1 = new Doctor();
		Scientist sci1 = new Scientist();
		System.out.println("-----");
			doc1.publicVoidMethod();
			doc1.giveMedication();
			
			sci1.publicVoidMethod();
			sci1.performExperiment();
			
		Info doc2 = new Doctor();
		Info info1 = sci1;
		System.out.println("-----");
		
			doc2.publicVoidMethod();
			//doc2.giveMedication(); cant be called 
			// only overridden methods can be called
			info1.publicVoidMethod();
			//info1.performExperiment(); cant be called 
			// only overridden methods can be called
		
		System.out.println("-----");	
		outputInfo(doc1); 
		outputInfo(sci1);
	}

	// we can pass any object to this method
	// which implements method Info
	public static void outputInfo(Info info){
		info.publicVoidMethod();
	}
	
}

interface Info {
	
	public static final String publicStaticFinalString = "I am a public static final String.";
	public final String finalString= "I am a final String.";
	public String publicString = "I am a public String.";
	String defaultString = "I am a default String.";
	
	public static void publicStaticVoidMethod(){
		System.out.println("I am a public static method.");
	}
	
	static void staticVoidMethod(){
		System.out.println("I am a static method.");
	}
	
	default void defaultVoidMethod(){
		System.out.println("I am a default method.");
	}
	
	public void publicVoidMethod();
	
	void voidMethod();
	
	abstract void abstractVoidMethod();
	
	
}

class Doctor implements Info {

	@Override
	public void publicVoidMethod() {
		System.out.println("Doctor cures humans.");
		
	}
	
	public void giveMedication(){
		System.out.println("Doctors give medication to cure the ailing.");
	}

	@Override
	public void voidMethod() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void abstractVoidMethod() {
		// TODO Auto-generated method stub
		
	}
}

class Scientist implements Info {

	@Override
	public void publicVoidMethod() {
		System.out.println("Scientists discover knowledge.");
		
	}
	
	public void performExperiment(){
		System.out.println("Scientists perform experiments to understand nature.");
	}

	@Override
	public void voidMethod() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void abstractVoidMethod() {
		// TODO Auto-generated method stub
		
	}
	
}