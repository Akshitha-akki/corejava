package corejava;
import java.util.*;

public class StringBufferMethods 
{
	public static void main(String[] args) 
	{ 
//STATIC ALLOCATION
	 /* StringBuffer sb= new StringBuffer();
		System.out.println("Capacity : "+sb.capacity()); //Default capacity is 16.
	    StringBuffer sbm= new StringBuffer(" World");
	 //StringBuffer - Capacity ->returns string
	    System.out.println("Capacity : "+sbm.capacity());
	 //StringBuffer - insert ->returns string
		System.out.println("Insert : "+sbm.insert(0, "Hello"));
	//StringBuffer - delete ->returns string
		System.out.println("Delete : "+sbm.delete(6, 11));
	//StringBuffer - append ->returns string
		System.out.println("Append : "+sbm.append("World"));
	//StringBuffer -replace ->returns string
		System.out.println("Replace : "+sbm.replace(6, 18,"Akshitha"));
	//StringBuffer - length ->returns Integer
		System.out.println("Length : "+sbm.length());
	//StringBuffer - reverse ->returns String
		System.out.println("Reverse : "+sbm.reverse());
	//StringBuffer - charAt ->
		System.out.println("charAt :"+sbm.charAt(4));*/
  /* 	OUTPUT :
	Capacity : 16
	Capacity : 22
    Insert : Hello World
    Delete : Hello 
	Append : Hello World
	Replace : Hello Akshitha
	Length : 14
	Reverse : ahtihskA olleH
	charAt :h	
  */
//DYNAMIC ALLOCATION
	/*  Scanner scan = new Scanner(System.in);
	  System.out.println("Enter the String : ");
	  String s=scan.nextLine();
	//Capacity - without taking the string.
	  StringBuffer sb= new StringBuffer();
	  System.out.println("Capacity : "+sb.capacity()); //Default capacity is 16.
	//Capacity - with taking the string.
	  StringBuffer sbm= new StringBuffer(s);
	  System.out.println("Capacity : "+sbm.capacity());
	//ensureCapacity - returns Integer
	  sbm.ensureCapacity(50);
	  System.out.println("EnsureCapacity : "+sbm.capacity());
	//insert - returns String
	  System.out.println("Enter Interger and String for insert method: ");
	  int n1= scan.nextInt();
 	  String str=scan.nextLine();
	  System.out.println("Insert : "+sbm.insert(n1, str));
	//append - returns string
	  System.out.println("Enter String for appending: ");
 	  String str1=scan.nextLine();
	  System.out.println("append : "+sbm.append(str1));
	//delete - returns string
	  System.out.println("Enter the integer for Starting and ending for detele method: ");
	  int start = scan.nextInt();
 	  int end = scan.nextInt();
	  System.out.println("Delete : "+sbm.delete(start, end));
	//replace - returns string
	  System.out.println("Enter starting , ending values and String for replacing: ");
	  int start_1= scan.nextInt();
	  int end_1= scan.nextInt();
 	  String str2=scan.nextLine();
	  System.out.println("Replace : "+sbm.replace(start_1, end_1, str2));
	//length - returns integer
	  System.out.println("Length : "+sbm.length());
	//charAt - returns string
	  System.out.println("Enter integer for charAt : ");
 	  int int_1=scan.nextInt();
	  System.out.println("CharAt : "+sbm.charAt(int_1));
	//reverse - returns String
	  System.out.println("Reverse : "+sbm.reverse());
    OUTPUT:
		     Enter the String : 
			 Akshitha
			 Capacity : 16
			 Capacity : 24
			 EnsureCapacity : 50
			 Enter Interger and String for insert method: 
			 8 Shyamala
			 Insert : Akshitha Shyamala
			 Enter String for appending: 
			  S
			 append : Akshitha Shyamala S
			 Enter the integer for Starting and ending for detele method: 
			 18 19
			 Delete : Akshitha Shyamala 
			 Enter starting , ending values and String for replacing: 
			 0 8 Ramadevi
			 Replace :  Ramadevi Shyamala 
			 Length : 19
			 Enter integer for charAt : 
			 3
			 CharAt : m
			 Reverse :  alamayhS ivedamaR 
   */
	StringBuffer sbm=new StringBuffer("Hello");
	StringBuffer sb= new StringBuffer();
	System.out.println("Capacity : "+sb.capacity());
	System.out.println("Capacity : "+sbm.capacity());
	sbm.ensureCapacity(30);
	System.out.println("Capacity : "+sbm.capacity());
	sbm.ensureCapacity(20);
	System.out.println("Capacity : "+sbm.capacity());
	sbm.ensureCapacity(50);
	System.out.println("Capacity : "+sbm.capacity());
	}

}