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

}

class MobilePhone{

	public static int count;
	public MobilePhone() {
		count++; // TODO counter not working need to check
	}
	
	@Override
	public String toString() {
		return "I am Mobile Phone no " + count;
	}
	
}

class NexusPhone extends MobilePhone{
	
	@Override
	public String toString() {
		return "I am Nexus Phone no " + count;
	}
	
}