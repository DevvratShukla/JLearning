package coreConceptsInJava;

public class UnderstandingInterfaces {

	public static void main(String[] args) {
	
		Doctor doc1 = new Doctor();
		Scientist sci1 = new Scientist();
		System.out.println("-----");
			doc1.showInfo();
			doc1.giveMedication();
			
			sci1.showInfo();
			sci1.performExperiment();
			
		Info doc2 = new Doctor();
		Info info1 = sci1;
		System.out.println("-----");
		
			doc2.showInfo();
			//doc2.giveMedication(); cant be called 
			// only overridden methods can be called
			info1.showInfo();
			//info1.performExperiment(); cant be called 
			// only overridden methods can be called
		
		System.out.println("-----");	
		outputInfo(doc1); 
		outputInfo(sci1);
	}

	// we can pass any object to this method
	// which implements method Info
	public static void outputInfo(Info info){
		info.showInfo();
	}
	
}

interface Info{
	
 public void showInfo();
 
}

class Doctor implements Info {

	@Override
	public void showInfo() {
		System.out.println("Doctor cures humans.");
		
	}
	
	public void giveMedication(){
		System.out.println("Doctors give medication to cure the ailing.");
	}
}

class Scientist implements Info {

	@Override
	public void showInfo() {
		System.out.println("Scientists discover knowledge.");
		
	}
	
	public void performExperiment(){
		System.out.println("Scientists perform experiments to understand nature.");
	}
	
}