package io.github.devvratplus.java.concepts.enums;

public class UnderstandingEnums {

	public static void main(String[] args){
		
		Planets planet = Planets.Jupiter;
		
		switch(planet){
		case Earth:
			System.out.println("Welcome to planet " + Planets.Earth + "!");
			break;
		case Jupiter:
			System.out.println("Welcome to planet " + Planets.Jupiter + "!");
			break;
		case Mars:
			System.out.println("Welcome to planet " + Planets.Mars + "!");
			break;
		case Mercury:
			System.out.println("Welcome to planet " + Planets.Mercury + "!");
			break;
		case Neptune:
			System.out.println("Welcome to planet " + Planets.Neptune + "!");
			break;
		case Pluto:
			System.out.println("Welcome to planet " + Planets.Pluto + "!");
			break;
		case Saturn:
			System.out.println("Welcome to planet " + Planets.Saturn + "!");
			break;
		case Venus:
			System.out.println("Welcome to planet " + Planets.Venus + "!");
			break;
		default:
			System.out.println("What?");
			break;
		
		}
		
		//basic operations on enums
		System.out.println("Operations on Planets Enum >");
		System.out.println(Planets.Earth.getClass());
		System.out.println(Planets.Jupiter instanceof Enum);
		System.out.println(Planets.Jupiter instanceof Planets);
		System.out.println(Planets.Jupiter.name());
		System.out.println(Planets.Jupiter.ordinal());
		System.out.println(Planets.Jupiter.compareTo(planet));
		System.out.println(Planets.Jupiter.equals(planet));
	
		System.out.println("\nOperations on Animal Enum >");
		Animals animal = Animals.CAT;
		System.out.println(animal);
		System.out.println(animal.name());
		System.out.println(animal.getName());
		
		System.out.println();
		System.out.println(Animals.DOG); // toStrings method overridden
		System.out.println(Animals.DOG.name()); // method inherited from Enum
		System.out.println(Animals.DOG.getName());
		
		System.out.println(Animals.values());
		System.out.println(Animals.valueOf("CAT"));
		
		System.out.println(Planets.valueOf("Earth"));
		System.out.println(Planets.values());

	}
}

enum Planets{
	Mercury, Venus, Earth, Mars, Jupiter, Saturn, Neptune, Pluto //these are objects
	// You can get the string representation of these objects
}

enum Animals{
	DOG("Newton"), CAT("Tom"), MOUSE("Jerry");
	
	private String name;
	
	Animals(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}	
	
	public String toString(){
		return "This animal is called " + name;
		
	}
}