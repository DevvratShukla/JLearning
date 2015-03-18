package io.github.devvratplus.java.concepts.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class UnderstandingSerializingArrays {

	public static void main(String[] args) {

		String file1 = "person.dat";
		String file2 = "employee.dat";
		Employee[] employeeArray = { new Employee(56, "Dave"),
				new Employee(45, "Peter"), new Employee(36, "Leena"),
				new Employee(34, "Sandy") };

		writeObject(employeeArray, file1);
		for (Employee emp : readObjectArray(file1)) {
			System.out.println(emp);
		}

		ArrayList<Employee> employeeList = new ArrayList<Employee>(
				Arrays.asList(employeeArray));
		writeObject(employeeList, file2);
		for (Employee emp : readObjectList(file2)) {
			System.out.println(emp);
		}
	}

	public static void writeObject(ArrayList<Employee> employeeList,
			String FileName) {
		System.out.print("Writing object" + employeeList + "...");

		try (FileOutputStream fs = new FileOutputStream(
				System.getProperty("user.dir") + "//files/" + FileName);
				ObjectOutputStream os = new ObjectOutputStream(fs);) {

			os.writeObject(employeeList);

			System.out.println("Done");

		} catch (FileNotFoundException e) {
			System.out.println("File Not Found to write");
		} catch (IOException e) {
			System.out.println("An error occured while writing to the file..");
			e.printStackTrace();
		}
	}

	public static void writeObject(Employee[] employeeArray, String FileName) {
		System.out.print("Writing object" + employeeArray + "...");

		try (FileOutputStream fs = new FileOutputStream(
				System.getProperty("user.dir") + "//files/" + FileName);
				ObjectOutputStream os = new ObjectOutputStream(fs);) {

			os.writeObject(employeeArray);

			System.out.println("Done");

		} catch (FileNotFoundException e) {
			System.out.println("File Not Found to write");
		} catch (IOException e) {
			System.out.println("An error occured while writing to the file..");
			e.printStackTrace();
		}
	}

	public static ArrayList<Employee> readObjectList(String FileName) {
		System.out.print("Reading Object...");

		try (FileInputStream in = new FileInputStream(new File(
				System.getProperty("user.dir") + "//files/" + FileName));
				ObjectInputStream os = new ObjectInputStream(in);) {

			@SuppressWarnings("unchecked")
			ArrayList<Employee> obj = (ArrayList<Employee>) os.readObject();
			System.out.println("Done");

			return obj;

		} catch (FileNotFoundException e) {
			System.out.println("File Not Found to read");

			return null;
		} catch (IOException e) {
			System.out.println("An error occured while reading the file..");

			return null;
		} catch (ClassNotFoundException e) {
			return null;
		}
	}

	public static Employee[] readObjectArray(String FileName) {
		System.out.print("Reading Object...");

		try (FileInputStream in = new FileInputStream(new File(
				System.getProperty("user.dir") + "//files/" + FileName));
				ObjectInputStream os = new ObjectInputStream(in);) {

			Employee[] obj = (Employee[]) os.readObject();
			System.out.println("Done");

			return obj;

		} catch (FileNotFoundException e) {
			System.out.println("File Not Found to read");
			return null;
		} catch (IOException e) {
			System.out.println("An error occured while reading the file..");
			return null;
		} catch (ClassNotFoundException e) {
			return null;
		}
	}

}

class Employee implements Serializable {
	// serialVersionUID validates that you are reading the exact same class that
	// you wrote
	private static final long serialVersionUID = 8508477797958835741L;

	private int age;
	private String name;

	public Employee(int age, String name) {
		this.name = name;
		this.age = age;
	}

	public void introduce() {
		System.out.println("Hello, i am " + name);
	}

	public String toString() {
		return " Person [Name:" + name + ", Age: " + age + "]";
	}
}