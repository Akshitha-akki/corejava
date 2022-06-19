package corejava;
import java.util.Scanner;

public class Bitwise_operator {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter n1");//5
		 int n1 = s.nextInt();
		 System.out.println("Enter n2");//7
		 int n2 = s.nextInt();
		 int xor = n1^n2; // XOR Operator
		 System.out.println("XOR operator :"+xor);
		 int or = n1|n2; // OR Operator
		 System.out.println("OR operator :"+or);
		 int and = n1&n2; // AND Operator
		 System.out.println("AND operator :"+and);
		 int n = ~n1; // Complement Operator
		 System.out.println("Complement operator :"+n);
	}

}
