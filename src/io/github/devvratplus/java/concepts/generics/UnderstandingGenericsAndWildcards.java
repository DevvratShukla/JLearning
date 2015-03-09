package io.github.devvratplus.java.concepts.generics;

import java.util.ArrayList;

public class UnderstandingGenericsAndWildcards {

	public static void main(String[] args) {
		
		ArrayList<MobilePhone> al = new ArrayList<MobilePhone>();
		al.add(new MobilePhone());
		al.add(new MobilePhone());
		al.add(new MobilePhone());
		
		ArrayList<NexusPhone> alnp = new ArrayList<NexusPhone>();
		alnp.add(new NexusPhone());
		alnp.add(new NexusPhone());
		alnp.add(new NexusPhone());

		showListOfMobilePhones(al);
		showListOfNexusPhones(alnp);
		
		showWildList(al);
		showWildList(alnp);
		
		showExtendsList(al);
		showExtendsList(alnp);
		
		showSuperList(al);
		showSuperList(alnp);
	}
	
	public static void showListOfMobilePhones(ArrayList<MobilePhone> list){
		for (MobilePhone value: list){
			System.out.println(value);
		}
	}
	
	public static void showListOfNexusPhones(ArrayList<NexusPhone> list){
		for (NexusPhone value: list){
			System.out.println(value);
		}
	}

	public static void showWildList(ArrayList<?> list){ //using the wildcard
		for (Object value: list){
			System.out.println(value);
			// here we cannot call any methods other than those of the Object
		}	
	}
	
	public static void showExtendsList(ArrayList<? extends MobilePhone> list){ //using the wildcard
		for (MobilePhone value: list){
			System.out.println(value);
			value.switchOn(); // we can only call MobilePhone specific methods here
		}
	}
	
	public static void showSuperList(ArrayList<? super NexusPhone> list){ //using the wildcard
		for (Object value: list){ 
			// Object is the super calls of NexusPhone
			// MobilePhone is the parent call of NexusPhone
			// so you can only call Object specific methods here
			System.out.println(value);
		}	
		
	}
}

class MobilePhone{

	public static int count;
	/*public MobilePhone() {
		count++; // TODO counter not working need to check
	}*/
	
	@Override
	public String toString() {
		count++;
		return "I am Mobile Phone no " + count;
	}
	
	public void switchOn(){
		System.out.println("Mobile Phone Switched on..");
	}
}

class NexusPhone extends MobilePhone{
	
	@Override
	public String toString() {
		count++;
		return "I am Nexus Phone no " + count;
	}
	
	public void switchOff(){
		System.out.println("Nexus Phone switched off..");
	}
	
}