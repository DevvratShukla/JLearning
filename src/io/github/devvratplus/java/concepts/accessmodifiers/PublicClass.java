package io.github.devvratplus.java.concepts.accessmodifiers;

public class PublicClass {
	
	    //public String name = "Adam"; bad practice
		//instance variable should be encapsulated
		private String name;
		// Private > accessible only within the class
		
		protected String type;
		//protected > accessible with package/subclass
		
		//acceptable practice - Its final
		public static final int ID = 47;
		//public > accessible anywhere
		
		static String day = "Someday";
		//default > accessible within the package
		 
		public PublicClass(){
			this.name = "Adam";
			this.type = "Plant";
		}
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}	
}
