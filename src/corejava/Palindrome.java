package corejava;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		//STATIC ALLOCATION
	/*   String str ="sos";
		 StringBuilder sb=new StringBuilder(str);
		 String s = sb.reverse().toString();
		 if(s.contains(str))
		 {
			 System.out.println(str+" is a Palindrome");
		 }
		 else
		 {
			 System.out.println(str+" is not a Palindrome");
		 }
		 */
/*		if(s.equalsIgnoreCase(str))
		 {
			 System.out.println(str+" is a Palindrome");
		 }
		 else
		 {
			 System.out.println(str+" is not a Palindrome");
		 }
*/
		/*
		 if(s.equals(str))
		 {
			 System.out.println(str+" is a Palindrome");
		 }
		 else
		 {
			 System.out.println(str+" is not a Palindrome");
		 }*/
		//DYNAMIC ALLOCATION
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = scan.nextLine();
		StringBuilder sb=new StringBuilder(str);
		String s = sb.reverse().toString();
		if(s.contains(str))
		 {
			 System.out.println(str+" is a Palindrome");
		 }
		 else
		 {
			 System.out.println(str+" is not a Palindrome");
		 }
		  
	}

}
