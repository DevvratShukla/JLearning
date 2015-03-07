package io.github.devvratplus.java.concepts.core;

public class UnderstandingPolymorphism {

	public static void main(String[] args) {

		Tree tree1 = new Tree();
		Oak oak1 = new Oak();
		
		tree1.grow();
		
		oak1.grow();
		oak1.shedLeaves();
		
		Tree tree2 = oak1;
		tree2.grow();
		//tree2.shedLeaves() - Wont work
		//Its the type of variable which decides which methods
		//can be called on it
		
		// you can also pass a subclass in place of parent class
		// this is polymorphism at work!
		doGrow(oak1);
		
	}
	
	public static void doGrow(Tree tree){
		System.out.println("--doGrow--");
		tree.grow();
		System.out.println("--doGrow--");
	}

}


class Tree{
	
	public void grow(){
		System.out.println("Tree is growing...");
	}
}

class Oak extends Tree{
	
	public void grow(){
		System.out.println("Oak is growing...");
	}
	
	public void shedLeaves(){
		System.out.println("Shedding leaves...");
	}
}