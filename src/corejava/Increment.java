package corejava;

public class Increment {

	public static void main(String[] args) {
		int a = 5;
		int b = ++a; // Per - Increment
		System.out.println("Per-Increment of a :"+b);
		int c,d=5;
		c=d++; // Post - Increment 
		System.out.println("Post-Increment of a :"+c);
	}

}
