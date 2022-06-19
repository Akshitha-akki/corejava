package corejava;

public class Compare_To {

	public static void main(String[] args) {
		String str1 = "Teach Java";
	    String str2 = "Teach Java";
	    String str3 = "Teach Python";
	    int result;
	      result = str1.compareTo(str2);
	    System.out.println(result);  
	      result = str1.compareTo(str3);
	    System.out.println(result);  
	    result = str3.compareTo(str1);
	    System.out.println(result);


	}

}
