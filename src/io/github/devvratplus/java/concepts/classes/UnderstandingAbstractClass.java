package io.github.devvratplus.java.concepts.classes;

public class UnderstandingAbstractClass {

	public static void main(String[] args) {

		/*
		 * Difference between Interface and Abstract class 
		 * 1. Abstract class defines is - a relationship 
		 * 2. Abstract class can have partially implemented code 
		 * 3. It can have not static variables 
		 * 4. It can have private/protected methods
		 * 
		 * Interface outlines a set of behaviors which could be implemented by
		 * any class
		 */

		// Machine machine = new Machine(); // you cannot instantiate abstract
		// class
		Airplane ap1 = new Airplane();
		Truck t1 = new Truck();

		Machine ap2 = new Airplane();
		Machine t2 = new Truck();

		ap1.setId(1);
		ap1.getId();
		ap1.start();
		ap1.stop();
		ap1.run();

		t1.setId(2);
		t1.getId();
		t1.start();
		t1.stop();
		t1.beep();

		ap2.setId(3);
		ap2.getId();
		ap2.start();
		ap2.stop();

		t2.setId(4);
		t2.getId();
		t2.start();
		t2.stop();
		// t2.beep(); Error >
		// t2 is a machine type variable and it can only call Machine methods
	}

}

abstract class Machine {
	private int id;

	private void go() {
		System.out.println("Inside go");
	}

	protected void run() {
		go();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public abstract void start();

	public abstract void stop();

}

class Airplane extends Machine {

	@Override
	public void start() {
		System.out.println("Airplane stated..");
	}

	@Override
	public void stop() {
		System.out.println("Airplane stopped..");

	}

}

class Truck extends Machine {

	@Override
	public void start() {
		System.out.println("Machine started..");

	}

	@Override
	public void stop() {
		System.out.println("Machine stopped..");

	}

	public void beep() {
		System.out.println("Horn OK Please");
	}

}