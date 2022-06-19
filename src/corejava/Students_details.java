package corejava;
import java.util.Scanner;

public class Students_details {

	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		/*
	    System.out.println("Enter Name");
		String name=s.nextLine();
		System.out.println("Enter Place");
		String place = s.nextLine();
		System.out.println("Enter age");
		int age = s.nextInt();
		System.out.println("Enter Percentage");
		int percentage = s.nextInt();
		System.out.println("Name       : "+name);
		System.out.println("Place      : "+place);
		System.out.println("Age   	   : "+age);
		System.out.println("Percentage :"+percentage);
		*/
		
	//Below Program contains the marks of Student
		System.out.println("Enter Name"); //Student name
		 String name=s.nextLine();
		System.out.println("Enter Place"); // Student Place
		 String place = s.nextLine();
		System.out.println("Enter College Name"); // Student College name
		 String college_name = s.nextLine();
		System.out.println("Enter Subject Names");  //Giving the Subject names as input
		System.out.println("Enter Subject_1");
		 String subject_1 = s.nextLine();
		System.out.println("Enter Subject_2");
		 String subject_2 = s.nextLine();
		System.out.println("Enter Subject_3");
		 String subject_3 = s.nextLine();
		System.out.println("Subject Marks");   // Giving the Subject marks as input
		System.out.println("Enter Subject_1_Marks");
		 int subject_1_Marks = s.nextInt();
		System.out.println("Enter Subject_2_Marks");
		 int subject_2_Marks = s.nextInt();
		System.out.println("Enter Subject_3_Marks");
		 int subject_3_Marks = s.nextInt();
  //Calculating the Average of All Subjects
		float avg  =(subject_1_Marks+subject_2_Marks+subject_3_Marks)/3;
  //Printing the Student Details 	
		System.out.println("\tSTUDENT DETAILS");
		System.out.println("Name              : "+name);
		System.out.println("Place             : "+place);
		System.out.println("College Name      : "+college_name);
		System.out.println("\tSTUDENT MARKS");
		System.out.println("Subject names\tMarks");
		System.out.println("  "+subject_1+"\t "+subject_1_Marks);
		System.out.println("  "+subject_2+"\t\t "+subject_2_Marks);
		System.out.println("  "+subject_3+"\t\t "+subject_3_Marks);
		System.out.println("Percentage of Three Subjects : "+avg);
		
	}
}




















