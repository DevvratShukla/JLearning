package coreConceptsInJava;

public class UnderstandingMethodParameters {

	public static void main(String[] args) {
		Robot sam = new Robot();
		
		String greeting = "Hello there!";
		int food = 10;
		
		sam.speak("Hi i am Sam!");
		sam.jump(12);
		sam.move("west", 12.4);
		sam.speak(greeting); //here reference to the string "Hello there is passed to the method";
		sam.eat(food);
		sam.update(greeting);
		
		System.out.println(food);
		System.out.println(greeting);
	}

}

class Robot {
	void speak(String text){ //text is a method parameter
		System.out.println(text);
	}
	
	void jump(int height){ //height is a method parameter
		System.out.println("Jumping: " + height); 
	}
	
	void move(String direction, double distance){
		System.out.println("Moving " + distance + " meters in direction " + direction);
	}
	
	void eat(int food){
		food-=2;
	}
	
	void update(String string){
		string = "Just hello!";
	}
}