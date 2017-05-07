package io.github.devvratplus.java.concepts.threads;

public class ClassImplementsRunnableApp {
	
	public static void main(String[] args) {
		Thread thread1 = new Thread(new Arunner("thread1"));
		Thread thread2 = new Thread(new Arunner("thread2"));
		
		thread1.start();
		thread2.start();
		
	}

}

class Arunner implements Runnable {
	String refVarName = null;

	public Arunner(String refVarName) {
		this.refVarName = refVarName;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello" + " | " + refVarName + " | " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}