package io.github.devvratplus.java.concepts.casting;

public class UnderstandingCasting {
	
	public static void main(String[] args) {
		
		byte byteValue = 9;
		short shortValue = 88;
		int intValue = 777;
		long longValue = 6666;

		float floatValue = 555.5f;
		double doubleValue = 44444.444;
		
		//casting
		System.out.println("intValue before casting to longValue to int>" + intValue);
		intValue = (int)longValue; 
		// here we can see the value if longValue could be handled by int
		System.out.println("intVaule after casting to longValue to int >" + intValue);
		
		System.out.println("doubleValue before casting to intValue to double >" + doubleValue);
		doubleValue = intValue;
		System.out.println("doubleValue after casting to intValue to double >" + doubleValue);

		System.out.println("intValue before casting to floatValue to int >" + intValue);
		intValue = (int)floatValue; 
		// this will chop off the decimal value
		// casting to int wont round off the floatValue
		System.out.println("intValue after casting to floatValue to int >" + intValue);

	}

	public static void printMaxValue(){
		
		System.out.println("Max byte value >" + Byte.MAX_VALUE);
		System.out.println("Max short value >" + Short.MAX_VALUE);
		System.out.println("Max int value >" + Integer.MAX_VALUE);
		System.out.println("Max float value >" + Float.MAX_VALUE);
		System.out.println("Max double value >" + Double.MAX_VALUE);
		
	}
	
	public static void printMinValue(){
		
		System.out.println("Min byte value >" + Byte.MIN_VALUE);
		System.out.println("Min short value >" + Short.MIN_VALUE);
		System.out.println("Min int value >" + Integer.MIN_VALUE);
		System.out.println("Min float value >" + Float.MIN_VALUE);
		System.out.println("Min double value >" + Double.MIN_VALUE);
		
	}
	
	
}
