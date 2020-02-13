package JavaBasics;

public class Constructor {
	 int x;
	
	public Constructor(int y){
		 x=y;
	}
	
	public static void main(String[] args) {
		
		Constructor con = new Constructor(10);
		System.out.println(con.x);
		

	}

}
