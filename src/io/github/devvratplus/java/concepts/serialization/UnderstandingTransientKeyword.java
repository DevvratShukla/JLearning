package io.github.devvratplus.java.concepts.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class UnderstandingTransientKeyword {

	static File file = new File(System.getProperty("user.dir")
			+ "//files//mobile.dat");

	public static void main(String[] args) {

		Mobile m1 = new Mobile(1, "Sony");
		Mobile.setCount(81);
		writeObject(m1);
		System.out.println(readObject());
	}

	public static void writeObject(Mobile obj) {

		try (ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream(file))) {
			System.out.print("writing object...");
			oos.writeObject(obj);
			System.out.println("completed");

		} catch (FileNotFoundException e) {
			System.out.println("FileNotFound!");
		} catch (IOException e) {
			System.out.println("IOError!");
		}
	}

	public static Mobile readObject() {

		Mobile obj = null;

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
				file))) {

			obj = (Mobile) ois.readObject();

		} catch (FileNotFoundException e) {
			System.out.println("FileNotFound!");
			return null;
		} catch (IOException e) {
			System.out.println("IOError!");
			return null;
		} catch (ClassNotFoundException e) {
			System.out.println("InvalidClass!");
		}

		return obj;
	}

}

class Mobile implements Serializable {

	/**
	 * serialVersionUID is a special static variable used by the serialization
	 * and deserialization process, to verify that a local class is compatible
	 * with the class used to serialize an object. It's not just a static
	 * variable as others, which are definitely not serialized.
	 * 
	 * When an object of a class is serialized, the class name and serial
	 * version UID are written to the stream of bytes. When it's deserialized,
	 * the JVM checks if the serial version UID read from the stream of bytes is
	 * the same as the one of the local class. If they're not, it doesn't even
	 * try to deserialize the object, because it knows the classes are
	 * incompatible.
	 */
	private static final long serialVersionUID = 1L;
	// this validates whether you are using the latest version of class

	/**
	 * This instance variable wont be serialized, if you mark an instance variable
	 * as transient then that variable is not serialized
	 */
	private transient int id;
	private String model;
	
	/**
	 * Static variables are not serialized
	 */
	private static int count = 0;

	Mobile(int id, String model) {
		this.id = id;
		this.model = model;
	}

	public String toString() {
		return "Mobile [id=" + id + ", model=" + model + ", count=" + count
				+ "]";

	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Mobile.count = count;
	}
}