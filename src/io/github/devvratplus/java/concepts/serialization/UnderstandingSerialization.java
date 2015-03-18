package io.github.devvratplus.java.concepts.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class UnderstandingSerialization {

	// Serialization: turning object into binary data
	// De-serialization: turning binary data back to objects

	public static void main(String[] args) {
		
		String file1 = "person.dat";

		Person mike = new Person(27, "Mike", "Las Angiles");
		Person bolt = new Person(29, "Bolt", "New Zealand");

		writeObject(mike, file1);
		writeObject(bolt, file1);

		System.out.println(readObject(file1));
		System.out.println(readObject(file1));

	}

	/**
	 * 
	 * @param obj
	 * @param FileName
	 *            : Name of the file under files folder
	 */
	public static void writeObject(Person obj, String FileName) {
		System.out.print("Writing object" + obj + "...");

		try (FileOutputStream fs = new FileOutputStream(
				System.getProperty("user.dir") + "//files/" + FileName);
				ObjectOutputStream os = new ObjectOutputStream(fs);) {
			
			os.writeObject(obj);
		
			System.out.println("Done");

		} catch (FileNotFoundException e) {
			System.out.println("File Not Found to write");
		} catch (IOException e) {
			System.out.println("An error occured while writing to the file..");
			e.printStackTrace();
		}
	}

	public static Person readObject(String FileName) {
		System.out.print("Reading Object...");

		try (FileInputStream in = new FileInputStream(new File(
				System.getProperty("user.dir") + "//files/" + FileName));
				ObjectInputStream os = new ObjectInputStream(in);) {
			
			Person obj = (Person) os.readObject();
			System.out.println("Done");
			os.close();
			return obj;

		} catch (FileNotFoundException e) {
			System.out.println("File Not Found to read");
			return null;
		} catch (IOException e) {
			System.out.println("An error occured while reading the file..");
			return null;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			return null;
		}
	}
}

class Person implements Serializable {
	// serialVersionUID validates that you are reading the exact same class that
	// you wrote
	private static final long serialVersionUID = 8508477797958835741L;

	private int age;
	private String name;
	private String homeTown;

	public Person(int age, String name, String homeTown) {
		this.name = name;
		this.age = age;
		this.homeTown = homeTown;
	}

	public void introduce() {
		System.out.println("Hello, i am " + name + " from " + homeTown);
	}

	public String toString() {
		return " Person [Name:" + name + ", Age: " + age + ",  Home Town: "
				+ homeTown + "]";
	}
}