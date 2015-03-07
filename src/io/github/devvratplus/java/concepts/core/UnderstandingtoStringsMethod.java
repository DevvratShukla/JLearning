package io.github.devvratplus.java.concepts.core;

public class UnderstandingtoStringsMethod {

	public static void main(String[] args) {

		//All class in java have objects class as their 
		//ultimate parent
		
		Planet planet1 = new Planet(4,"Mars",false);
		Planet planet2 = new Planet(3,"Earth",true);
		Planet planet3 = new Planet(1,"Mercury",false);
		
		AlienPlanet ap1 = new AlienPlanet();
		
		System.out.println("-----");
		System.out.println(planet1);//output: 4 : Mars : Plant is uninhabitable
		System.out.println(planet2);//output: 3 : Earth : Plant is habitable
		System.out.println(planet3);//output: 1 : Mercury : Plant is uninhabitable
		System.out.println("-----");
		System.out.println(ap1); //output: coreConceptsInJava.AlienPlanet@15db9742
		System.out.println("-----");
		// where 15db9742 is a hashcode which uniquely identifies an object
		
	}

}

class Planet {
	
	private int id;
	private String name;
	private boolean isHabitable;
	
	public Planet(int id, String name, boolean isHabitable){
		
		this.id=id;
		this.name=name;
		this.isHabitable=isHabitable;
	}
	
	//overriding toStrings method
	public String toString(){
		StringBuilder sb = new StringBuilder(id + " : " + name + " : ");
		if(isHabitable==true){
			  sb.append("Plant is habitable");
			  return sb.toString();
		} else {
			
			  return String.format("%d : %s : Plant is uninhabitable", id,name);
		}
			
	}
	
}

class AlienPlanet {
	
}