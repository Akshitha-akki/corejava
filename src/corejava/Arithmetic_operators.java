package corejava;
import java.util.Scanner;

class Arithmetic_operators {

	public static void main(String[] args) {
		   int sum,sub,mul,div,mod;
		   Scanner sc= new Scanner(System.in);
		   System.out.println("Enter n1");
		   int n1= sc.nextInt();
		   System.out.println("Enter n2");
		   int n2= sc.nextInt();
		   sum=n1+n2;
		   sub=n1-n2;
		   mul= n1*n2;
		   div=n1/n1 ;
		   mod = n1%n2;
		   System.out.println("n1 = 8 ,n2 = 4");
		   System.out.println("Addition ="+sum);
		   System.out.println("Subtraction = "+sub);
		   System.out.println("Multiplication = "+mul);
		   System.out.println("Division = "+div);
		   System.out.println("Mod = "+mod);
	}
}
