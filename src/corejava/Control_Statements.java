package corejava;
import java.util.*;
public class Control_Statements 
{
	public static void main(String[] args) 
	{
	//****MAX of three numbers
		Scanner scan = new Scanner(System.in);
	/*	System.out.println("Enter the num_1,num_2,num_3 :");
		int num_1=scan.nextInt();
		int num_2=scan.nextInt();
		int num_3=scan.nextInt();
		if(num_1 > num_2 && num_1 > num_3)
		{
			System.out.println(num_1+" is greater");
		}
		else if(num_2 > num_1 && num_2 > num_3)
		{
			System.out.println(num_2+" is greater");
		}
		else
		{
			System.out.println(num_3+" is greater");
		}
	*/
		
	//EVEN or ODD
/*	   System.out.println("Enter the number : ");
	   int num= scan.nextInt();
	    if(num%2 == 0)
		 {
		 	System.out.println(num+" is EVEN");
		 }
	    else 
		 {
			System.out.println(num+" is ODD");
		 }
   */
	/*	if(num%2 == 0)
		{
			System.out.println("Even numbers :");
			for(int i = 0;i<=num;i++)
			{
				if(i%2 ==0)
				{
					System.out.println(i);
				}
			}
		}
		else 
		{
			System.out.println("Odd numbers :");
			for(int i = 0;i<=num;i++)
			{
				if(i%2 !=0)
				{
					System.out.println(i);
				}
			}
		}	
   */		
  // Percentage 
	/*	System.out.println("Subject Marks");   // Giving the Subject marks as input
		System.out.println("Enter Subject_1_Marks");
		 int subject_1_Marks = scan.nextInt();
		System.out.println("Enter Subject_2_Marks");
		 int subject_2_Marks = scan.nextInt();
		System.out.println("Enter Subject_3_Marks");
		 int subject_3_Marks = scan.nextInt();
     //Calculating the Average of All Subjects
		float avg  =(subject_1_Marks+subject_2_Marks+subject_3_Marks)/3;
		System.out.println("Percentage : "+avg);
     if(avg >= 90)
     {
    	 System.out.println("OutStanding");
     }
     else if(avg >= 80 && avg < 90)
     {
    	 System.out.println("Excellent");
     }
     else if(avg >= 70 && avg < 80)
     {
    	 System.out.println("Distinction");
     }
     else if(avg >= 60 && avg < 70)
     {
    	 System.out.println("First Class");
     }
     else if(avg >= 50)
     {
    	 System.out.println("Pass");
     }
     else
     {
    	 System.out.println("Fail");
     }
   */
     //SWITCH CASE
/*		System.out.println("Enter the num_1,num_2 :");
		int num_1=scan.nextInt();
		int num_2=scan.nextInt();
	   System.out.println("Enter the operator : ");
       char expr= scan.next().charAt(0);
       switch (expr) 
       {
	    case '+': 
	    	     System.out.println("Addition of "+num_1+" and "+num_2+" : "+(num_1+num_2));
	    	      break;
	    case '-': 
	    		 System.out.println("Substraction of "+num_1+" and "+num_2+" : "+(num_1-num_2));
    			  break;
	    case '*': 
	    	     System.out.println("Multiplication of "+num_1+" and "+num_2+" : "+(num_1*num_2));
	    	      break;
	    case '/': 
	    		 System.out.println("Division of "+num_1+" and "+num_2+" : "+(num_1/num_2));
	    		  break;
	    case '%': 
	    		 System.out.println("Mod of "+num_1+" and "+num_2+" : "+(num_1%num_2));
	    		  break;  
	    default :
	    	     System.out.println("Entered the Worng expression");
	    	      break;
	   }
*/
	//Days
/*	   System.out.println("Enter the day : ");
       int day= scan.nextInt();
       switch (day) 
       {
	    case 1: 
	    	    System.out.println("Monday");
	    	    break;
	    case 2: 
	    		System.out.println("Tuesday");
	    		break;
	    case 3: 
	    		System.out.println("Wednesday");
	    		break;
	    case 4: 
   	     		System.out.println("Thursday");
   	     		break;
	    case 5: 
   	     		System.out.println("Friday");
   	     		break;
	    case 6: 
   	     		System.out.println("Saturday");
   	     		break;
	    case 7: 
   	     		System.out.println("Sunday");
   	     		break;
	    default : 
   	     		System.out.println("Invaild number");
   	     		break;
       }
  */    
		
/*		System.out.println("Subject Marks");   // Giving the Subject marks as input
		System.out.println("Enter Subject_1_Marks");
		 int subject_1_Marks = scan.nextInt();
		System.out.println("Enter Subject_2_Marks");
		 int subject_2_Marks = scan.nextInt();
		System.out.println("Enter Subject_3_Marks");
		 int subject_3_Marks = scan.nextInt();
     //Calculating the Average of All Subjects
		int average  =(subject_1_Marks+subject_2_Marks+subject_3_Marks)/3;
		System.out.println("Percentage : "+average);
		int avg = average/10;
		switch(avg) {
		case 9:
				System.out.println("OutStanding");
				break;
		case 8 :
			    System.out.println("Excellent");
			    break;
		case 7 :
			    System.out.println("Distinction");
			    break;
		case 6 :
			 	System.out.println("First Class");
			    break;
		case 5 :
			    System.out.println("Pass");
			    break;
		default :
				System.out.println("Fail");
				break;
		}  
*/
//** LOOPs **
//FOR LOOP
	   // Printing of 'n' numbers 
/*	        System.out.println("Enter the number : ");
		    int num= scan.nextInt();
		    for(int i =0 ; i<=num;i++)
		    {
		    	System.out.println(i);
		    }
*/    
	  //Sum of Digits 
/*	    	int sum=0;
	  		System.out.println("Enter the number : ");
	  	    int n = scan.nextInt();
	  		for(int i=0;i<=n;i++)
	  		{
	  			sum+=i;	
	  		}
	  		System.out.println("Sum of Digits : "+sum);
*/   
	   
	  //Multiplication table
	  	/*	System.out.println("Enter the multiplication number : ");
	  		int num = scan.nextInt();
	  		System.out.println("Enter the numbers  : ");
	  		int n = scan.nextInt();
	  		for(int i=1;i<=n;i++)
	  		{
	  			System.out.println(num+" * "+i+" = "+(num*i));		
	  		}
	  	*/
	  //Reverse of Integer 
	    /* 	System.out.println("Enter the number : ");
	  		int num = scan.nextInt();
	  		int reverse = 0;
	  		int len = String.valueOf(num).length();
	  		for(int i=0;i<len;i++)
	  		{
	  			int reminder = num % 10;
	  			reverse =reverse*10+reminder;
	  			num = num/10;
	  		}
	  		System.out.println(reverse);
	    */	
	  //While loop
	  /*	int i=0,sum=0;
	  		System.out.println("Enter the number : ");
	  		int n = scan.nextInt();
	  		while(i <= n)
	  		{
	  			sum+=i;
	  			i++;
	  		}
	  		System.out.println("Sum : "+sum);
	  */
	  //Do While loop
	  	/*	int i=0,sum=0;
	  		System.out.println("Enter the number");
	  		int n = scan.nextInt();
	  		do
	  		{
	  			sum+=i;
	  			i++;
	  		}
	  		while(i <= n);
	  		System.out.println("Sum : "+sum);
	  	*/
	  // Difference between while loop ans do..while loop
	  /*    int i = 5;
	  		while(i>=6)
	  		{
	  			System.out.println(" While loop ");
	  		}
	  	
	  		int j = 5;
	  		do
	  		{
	  			System.out.println(" Do..While loop ");
	  		}
	  		while(j>=6);
      */
	// Using while loop
	/*	System.out.println("Enter the Large number : ");
  		int i = scan.nextInt();
  		System.out.println("Enter the small number : ");
  		int n = scan.nextInt();
  		while(i>=n )
  		{
  			System.out.println(i);
  			i--;
  		}
  	*/
    //Factorial series 
	/*	System.out.println("Enter the number : ");
  		int n = scan.nextInt();
		int i=1,fact=1;
		while(i<=n)
		{
			fact=fact*i;
			i++;
		}
		System.out.println("Factorial of "+n+" is : "+fact);
		*/

   //Fibonacci Series using while loop
	/*	System.out.println("Enter the number : ");
	  	int n = scan.nextInt();
		int i=1,n1=0,n2=1;
		System.out.println("Fibonacci Series : ");
		while(i<=n)
		{
			System.out.print(n1+" ");
			int fib= n1+n2;
			n1=n2;
		    n2=fib;
			i++;
		}
	*/	
	 
//Break 
	/* 	System.out.println("Enter the number : ");
	  	int n = scan.nextInt();
		for(int i=0 ; i<=n;i++)
		{
			if(i==3)
			{
				break;
			}
			System.out.println(i);
		}
	 */
		
//continue 
	/*	System.out.println("Enter the number : ");
	  	int n = scan.nextInt();
		for(int i=0 ; i<=n;i++)
		{
			if(i==3)
			{
				continue;
			}
			System.out.println(i);
		}
	*/	
//Armstrong number
	/*	int n=153 ,sum =0;
		int num = n;
		for(int i=0;i<=5;i++)
		{
			int rem= n%10;
			sum=sum+(rem*rem*rem);  
			n=n/10;
		}
		if(sum==num)
		{
			System.out.println(sum+" is an armstrong number");
		}
		else
		{
			System.out.println(sum+" is an not armstrong number");
		}
	*/	
	/*	int i=0,n=5;
		while(i<=n)
		{
			if(i==3)
			{
				i++;
				continue;
			}
			
			System.out.println(i);
			i++;
		}
    */		
	/*	int i=0,n=5;
		while(i<=n)
		{
			if(i==3)
			{
				continue;
			}
			System.out.println(i);
			i++;
		}
	*/	
//Checking whether the number is prime number or not
	/*  	    System.out.println("Enter the number");
			int n = scan.nextInt();
			int i, flag =0;// 0 = false and 1 = true
			if(n==0|n==1)
			{
				flag =1;
			}
			for(i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					flag = 1;
					break;
				}
			}
			if(flag == 0)
			{
				System.out.println("Prime number");
			}
			else 
			{
				System.out.println("Not prime number");
			}
	*/ 
//Prime numbers from 1 to n :	
/*		System.out.println("Enter the number");
		int n = scan.nextInt();
		int i,j, flag =0;// 0 = false and 1 = true
		for(i=2;i<=n;i++)
		{
			flag =0;
			for(j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag = 1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.print(i+" ");
			}
		}
*/		  
/*	   int i=0;
	   while(i<=100)
	   {
		   System.out.println("Enter 1 or 0 ");
		   int Choise= scan.nextInt();
		   if(Choise == 1)
		   {
			   System.out.println("Enter the number_1 : ");
			   int num_1= scan.nextInt();
			   System.out.println("Enter the number_2 : ");
			   int num_2= scan.nextInt();
			   System.out.println("Enter the operator -> + , - , * , / , % : ");
		       char expr= scan.next().charAt(0);
		       switch (expr) 
		       {
			    case '+': 
			    	     System.out.println("Addition of "+num_1+" and "+num_2+" : "+(num_1+num_2));
			    	      break;
			    case '-': 
			    		 System.out.println("Substraction of "+num_1+" and "+num_2+" : "+(num_1-num_2));
		    			  break;
			    case '*': 
			    	     System.out.println("Multiplication of "+num_1+" and "+num_2+" : "+(num_1*num_2));
			    	      break;
			    case '/': 
			    		 System.out.println("Division of "+num_1+" and "+num_2+" : "+(num_1/num_2));
			    		  break;
			    case '%': 
			    		 System.out.println("Mod of "+num_1+" and "+num_2+" : "+(num_1%num_2));
			    		  break;  
			    default :
			    	     System.out.println("Entered the Worng expression");
			    	      break;
	            }
		   }
		   else
		   {
			   System.out.println("Exit for loop");
		   }
		   i++;
	   }
 */
		System.out.println(Math.pow(2,2));
		
		
		
		
		
		
		
		
		
		
       }
}
