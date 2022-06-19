package corejava;
import java.util.*;

public class Switch_case {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in) ;
		int i=0;
		   while(i<=100)
		   {
			   System.out.println("Enter 1 or 0  ");
			   int Choise= scan.nextInt();
			   if(Choise == 1)
			   {
				   System.out.println("Menu");
				   System.out.println("Enter the operator : \n Addition -> + \n Substraction -> - \n Multiplication -> * \n Division -> \n Mod -> % \n Square root -> s \n Power -> p \n Exit -> 0 ");
			       char expr= scan.next().charAt(0);
			       switch (expr) 
			       {
				    case '+': 
					    	   System.out.println("Enter the number_1 : ");
							   int num_1= scan.nextInt();
							   System.out.println("Enter the number_2 : ");
							   int num_2= scan.nextInt();
						    	     
							   System.out.println("Addition of "+num_1+" and "+num_2+" : "+(num_1+num_2));
					    	      break;
				    case '-': 
					    	   System.out.println("Enter the number_1 : ");
							   num_1= scan.nextInt();
							   System.out.println("Enter the number_2 : ");
							   num_2= scan.nextInt();
					    		 
							   System.out.println("Substraction of "+num_1+" and "+num_2+" : "+(num_1-num_2));
				    			  break;
				    case '*': 
					    	   System.out.println("Enter the number_1 : ");
							   num_1= scan.nextInt();
							   System.out.println("Enter the number_2 : ");
							   num_2= scan.nextInt();
					    	     
							   System.out.println("Multiplication of "+num_1+" and "+num_2+" : "+(num_1*num_2));
					    	      break;
				    case '/': 
					    	   System.out.println("Enter the number_1 : ");
							   num_1= scan.nextInt();
							   System.out.println("Enter the number_2 : ");
							   num_2= scan.nextInt();
					    	     if((num_1==0) ||(num_2==0))
					    	     {
					    	    	 System.out.println("ZeroDivisionException");
					    	    	 break;
					    	     }
					    		 System.out.println("Division of "+num_1+" and "+num_2+" : "+(num_1/num_2));
					    		  break;
				    case '%': 
						       System.out.println("Enter the number_1 : ");
							   num_1= scan.nextInt();
							   System.out.println("Enter the number_2 : ");
							   num_2= scan.nextInt();
						    		 
							   System.out.println("Mod of "+num_1+" and "+num_2+" : "+(num_1%num_2));
				    		    break;  
				    case 's':
							   System.out.println("Enter the number : ");
							   int num= scan.nextInt();
				    	    	 System.out.println("Square root of "+num+" : "+Math.sqrt(num));
				    	         break;
				    case 'p' :
					    	   System.out.println("Enter the number : ");
							   int number= scan.nextInt();
							   System.out.println("Enter the power : ");
							   int power= scan.nextInt();
							   double result = (Math.pow(number,power));
					    	   System.out.println("The Power of a "+number+"^"+power+" : "+ result);
					    		  break;
				    case '0':
				    		 System.exit(0);
				    default :
				    	     System.out.println("Entered the Worng expression");
				    	      break;
		            }
			   
			   }
			   else
			   {
				   System.exit(0);
			   }
			   i++;
		   }
	}
}


