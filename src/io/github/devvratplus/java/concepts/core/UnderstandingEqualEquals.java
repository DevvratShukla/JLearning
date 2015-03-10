package io.github.devvratplus.java.concepts.core;

public class UnderstandingEqualEquals {

	public static void main(String[] args) {

		// == i.e Equal Equals only check whether two variables
		// are pointing to the same object
		primitiveTypes();
		primitiveTypeObjects();
		
		//you get false only while comparing Double and Float objects through ==
	}
	
	public static void primitiveTypes() {
		int int1 = 1;
		int int2 = 1;

		byte byte1 = 1;
		byte byte2 = 1;

		short short1 = 1;
		short short2 = 1;

		long long1 = 1;
		long long2 = 1;

		double double1 = 1.1;
		double double2 = 1.1;

		float float1 = 1.1f;
		float float2 = 1.1f;

		char char1 = 'D';
		char char2 = 'D';

		boolean boolean1 = true;
		boolean boolean2 = true;

		System.out.println("int1 == int2 >" + (int1 == int2));
		System.out.println("byte1 == byte2 >" + (byte1 == byte2));
		System.out.println("short1 == short2 >" + (short1 == short2));
		System.out.println("long1 == long2 >" + (long1 == long2));
		System.out.println("double1 == double2 >" + (double1 == double2));
		System.out.println("float1 == float2 >" + (float1 == float2));
		System.out.println("char1 == char2 >" + (char1 == char2));
		System.out.println("boolean1 == boolean2 >" + (boolean1 == boolean2));
	}
	
	public static void primitiveTypeObjects() {
		Integer Integer1 = 1;
		Integer Integer2 = 1;

		Byte Byte1 = 1;
		Byte Byte2 = 1;

		Short Short1 = 1;
		Short Short2 = 1;

		Long Long1 = 11L;
		Long Long2 = 11L;

		Double Double1 = 1.1;
		Double Double2 = 1.1;

		Float Float1 = 1.1f;
		Float Float2 = 1.1f;

		Character  Char1 = 'D';
		Character  Char2 = 'D';

		Boolean Boolean1 = true;
		Boolean Boolean2 = true;

		System.out.println("Integer1 == Integer2 >" + (Integer1 == Integer2));
		System.out.println("Byte1 == Byte2 >" + (Byte1 == Byte2));
		System.out.println("Short1 == Short2 >" + (Short1 == Short2));
		System.out.println("Long1 == Long2 >" + (Long1 == Long2));
		System.out.println("Double1 == Double2 >" + (Double1 == Double2));
		System.out.println("Float1 == Float2 >" + (Float1 == Float2));
		System.out.println("Char1 == Char2 >" + (Char1 == Char2));
		System.out.println("Boolean1 == Boolean2 >" + (Boolean1 == Boolean2));

	}

}
