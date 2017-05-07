package io.github.devvratplus.java.concepts.threads;

import java.util.Scanner;

public class StartingAndStoppingAThread {
	public static void main(String[] args) {

		Brunning run1 = new Brunning();
		run1.start();

		@SuppressWarnings("resource")
		Scanner scanIn = new Scanner(System.in);
		scanIn.nextLine();

		run1.shutdown();
	}
}

class Brunning extends Thread {
	//volatile prevents caching of the fields
	private volatile boolean running = true;

	@Override
	public void run() {
		System.out.println("Starting thread..");
		while (running) {
			System.out.println("Hello");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void shutdown() {
		running = false;
		System.out.println("Stopping thread..");
	}
}