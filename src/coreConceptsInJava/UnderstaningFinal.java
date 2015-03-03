package coreConceptsInJava;

public class UnderstaningFinal {

	public static void main(String[] args) {
		
		//calling static/static final varaibles
		System.out.println("Count is > " + Lucky.count);
		Lucky lucky = new Lucky();
		new Lucky();
		new Lucky();
		System.out.println("Count is > " + Lucky.count);
		System.out.println("Lucky Number is > " + Lucky.NUMBER);
		
		//calling instance/final instance variables
		System.out.println("Lucky ONE is > " + lucky.ONE);
		System.out.println("Lucky id is > " + lucky.id);
		System.out.println();
		
		Lucky lucky1 = new Lucky();
		lucky1.showOtherVars();
		//lucky1.showStaticVars(); this will give a waring as showStaticVars is a static method
		Lucky.showStaticVars();
		
	}

}

final class Lucky{ // this calls cannot be extended
	public final static int NUMBER = 47;
	public final int ONE=1;
	public int id;
	public static int count = 0;
	
	Lucky(){
		count+=1;
		id=count;
	}
	
	 static void showStaticVars(){
		 System.out.println("Count is > " + count);
		 System.out.println("Lucky Number is > " + NUMBER);
	}
	 
	  void showOtherVars(){
		  System.out.println("Lucky ONE is > " + ONE);
			System.out.println("Lucky id is > " + id);
	} 
}