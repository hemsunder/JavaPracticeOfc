package JavaBasics;

abstract class Person {
	
	public int age=20;
	public String name = "Kalnal";
	
	public abstract void study();
	
	abstract class Student extends Person {

		public int graduationYear = 2018;
		  public void study() { // the body of the abstract method is provided here
		    System.out.println("Studying all day long");
		  }
		
	}

}
