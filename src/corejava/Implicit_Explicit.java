package corejava;
 
public class Implicit_Explicit {

	public static void main(String[] args) {
		 //Implicit
		 System.out.println("implicit") ;
		  byte b = 5;
		  short s = b;
		  System.out.println("byte to short : "+s);
		  int i = s;
		  System.out.println("short to int : "+i);
		  long l = i;
		  System.out.println("int to long: "+l);
		  float f = l;
		  System.out.println("long to float : "+s);
		  double o = f;
		  System.out.println("float to double : "+o); 
		 //Explicit
		  System.out.println("Explicit : ");
		  double e = (char)o;
		  System.out.println("double to char : "+e);
	
		  
	}

}
