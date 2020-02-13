package JavaBasics;

public class ClassAttributes {
	/*int x=10,y=20;

	public static void main(String[] args) {
		ClassAttributes clas = new ClassAttributes();
		System.out.println(clas.x);
		
	}*/
	
	
	static void myStaticMethod() {
	    System.out.println("Static methods can be called without creating objects");
	  }

	  // Public method
	  public void myPublicMethod() {
	    System.out.println("Public methods must be called by creating objects");
	  }

	  
	  public static void main(String[] args) {
		  myStaticMethod();
		  ClassAttributes cls = new ClassAttributes();
		  cls.myPublicMethod();
		}

}
