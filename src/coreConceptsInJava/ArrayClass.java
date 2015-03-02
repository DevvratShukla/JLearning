package coreConceptsInJava;

public class ArrayClass {

	public static void main(String[] args) {
		
		//Way 1. Creating and initializing an array
		int[] values;
		values = new int[3];
		
		System.out.println("***Before Initializing***");
		for(int i=0; i<values.length;i++){
			System.out.println(values[i]);
		}
		
		values[0] = 11;
		values[1] = 12;
		values[2] = 13;
		
		System.out.println("***After Initializing***");
		for(int i=0;i<values.length;i++){
			System.out.println(values[i]);
		}
		
		/* values[3] = 13; This will lead to error >
		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
		at coreConceptsInJava.ArrayClass.main(ArrayClass.java:22)
		*/
				
		//Way 2. Creating and initializing an array
		int[] numbers = {1,2,3,4,5};
		
		System.out.println("***Array initialed at creation***");
		for(int i=0;i<numbers.length;i++){
			System.out.println(numbers[i]);
		}
		
	}

}
