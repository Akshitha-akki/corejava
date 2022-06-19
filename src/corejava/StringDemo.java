package corejava;
import java.util.Scanner;

public class StringDemo 
{
	public static void main(String[] args) 
	
	{
		//DYNAMIC ALLOCATION
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter String_1"); //String 1
		 String s1= scan.nextLine();
		 System.out.println("Enter String_2"); //String 2
		 String s2= scan.nextLine();
		 System.out.println(s1+" "+s2);
		 String s= s1+" "+s2; // Concatenation of two Strings using '+' Symbol
		 //String Length -> returns integer
		 System.out.println("Length of String : "+s.length());
		 //String Upper case -> returns in the capital letters 
		 System.out.println("Upper case : "+s.toUpperCase());
		//String Lower case -> returns in the lower case letters
		 System.out.println("Upper case : "+s.toLowerCase());
		// String - Concatenation 
		 System.out.println("Concatenation of Two Strings : "+s1.concat(s2));
		// String - Equals -> returns boolean(true or false) 
		 System.out.println("Equals of two Strings : "+s1.equals(s2));
		 System.out.println("== of two Strings : "+(s1==s2));
		 //String - startsWith ->returns boolean
		 System.out.println("Enter the String for startsWith");
		 String str= scan.nextLine();
		 System.out.println("startsWith : "+s.startsWith(str));
		//String - endsWith -> returns boolean
		 System.out.println("Enter the String for endsWith");
		 String str1= scan.nextLine();
		 System.out.println("endsWith : "+s.endsWith(str1));
		//String -  indexOf -> returns integer 
		 System.out.println("Enter the String for indexOf");
		 String str2= scan.nextLine();
		 System.out.println("indexOf : "+s.indexOf(str2));
		//String -  lastindexOf ->returns integer
		 System.out.println("Enter the String for lastIndexOf");
		 String str3= scan.nextLine();
		 System.out.println("lastIndexOf : "+s.lastIndexOf(str3));
		//String - equalsIgnoreCase -> returns boolean
		 System.out.println("EqualsIgnoreCase of two Strings : "+s1.equalsIgnoreCase(s2));
		//String - trim -> removes the space with is in the starting of sentence.
		 System.out.println("Enter the sentence");// enter the sentence with spaces in starting 
		 String string1 = scan.nextLine();
		 System.out.println("Trim :"+string1.trim());
		//String - replace -> returns the string
		 System.out.println("Enter the target and replacement values");
		 String target=scan.nextLine();
		 String replacement= scan.nextLine();
		 System.out.println("Replacing of char :"+s.replace(target,replacement));
		//String - contains -> returns string
		 System.out.println("Enter the String for Contains- str4:");	 
		 String str4 = scan.nextLine();
		 System.out.println("Contains:"+s.contains(str4));
		// String - CompareTo -> returns boolean
		 System.out.println("Enter the String for compareTo- str5:");	 
		 String str5 = scan.nextLine();
		 System.out.println("Enter the String - str6:");	 
		 String str6 = scan.nextLine();
		 System.out.println("CompareTo : "+str5.compareTo(str6));
		 //String - CharAt - returns the character
		 System.out.println("Enter the integer :");
		 int n1 = scan.nextInt();
		 System.out.println("charAt : "+s1.charAt(n1));
	}

}

























