package coreConceptsInJava;

public class UnderstandingGettersSettersAndReturnValues {

	public static void main(String[] args) {
		// Initializing person1
		Employee employee1 = new Employee();
		employee1.setName("James Bond");
		employee1.setAge(51);

		// Initializing person2
		Employee employee2 = new Employee();
		employee2.setName("Jason Bourn");
		employee2.setAge(45);

		System.out.println(employee1.getName() + " " + employee1.getAge() + " will retire in "
				+ employee1.calculateYearsToRetirement() + " years");
		
		System.out.println(employee2.getName() + " " + employee2.getAge() + " will retire in "
				+ employee2.calculateYearsToRetirement() + " years");

	}

}

class Employee {

	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private int age;

	int calculateYearsToRetirement() {
		return 65 - age;
	}

	void introduction() {
		System.out.println("My name is " + name + " and I am " + age + " years old.");
	}
}