package io.github.devvratplus.java.concepts.threads;

public class ClassExtendsThreadApp {
	public static void main(String[] args) {
		
		AppRunner runner1 = new AppRunner("runner1");
		runner1.start();
		
		AppRunner runner2 = new AppRunner("runner2");
		runner2.start();
		
		
	}
}

class AppRunner extends Thread {
	String refVarName = null;
	public AppRunner(String refVarName) {
		this.refVarName = refVarName;
	}
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
