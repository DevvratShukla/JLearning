package io.github.devvratplus.java.concepts.classes;

public class UnderstandingInnerClasses {

	public static void main(String[] args) {

		Dinosaur d1 = new Dinosaur(6);
		d1.awake();
		
		Dinosaur.Brain d1brain = d1.new Brain();
		d1brain.thinks();
		
		Dinosaur.Eyes dEyes  = new Dinosaur.Eyes(); // calling a static class
		dEyes.watch();

	}
}

class Dinosaur{
	
	private int age;
	private static String location = "America";
	
	public class Brain{
		public void thinks() {
			System.out.println("I think about feeding on humans. and i am just " + age + " years old");
		}
	}
	
	private class Heart{
		public void beat(){
			System.out.println("-----");
			System.out.println("My heat is beating, its keeps on repeating");
			System.out.println("-----");
		}
	}
	
	public static class Eyes { // Normal class just used to group it with the outer class
		public void watch(){
			Dinosaur d = new Dinosaur(9);
				
			System.out.println("\n-----");
			System.out.println("I see what you see in " + location);
			System.out.println("I am " + d.age + " years old");
			System.out.println("\n-----");
		}
	}
	
	public Dinosaur(int age){
		this.age = age;
	}

	public void awake(){
		System.out.println("I am awake! I can think and my heart still beats.");
		
		Brain brain = new Brain();
		brain.thinks();
		
		Heart heart = new Heart();
		heart.beat();
		
		final String name = "Adam";
		// classes declared inside a method can only access local variables that are Final
		
		class AnonymousClass{
			public void anonymousClassMethos(){
				System.out.println("-----");
				System.out.println("I am a anonymous class method!");
				System.out.println("My Age is " +  age);
				System.out.println("My name is " + name);
				System.out.println("-----");
			}
		}

		AnonymousClass temp = new AnonymousClass();	
		temp.anonymousClassMethos();
		
	}
	
}