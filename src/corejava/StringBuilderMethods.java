package corejava;

public class StringBuilderMethods {

	public static void main(String[] args) 
	{
	//String Builder - capacity -> returns integer
	   StringBuilder sb = new StringBuilder();
	    System.out.println(sb.capacity());
	   StringBuilder sbm = new StringBuilder(" World");
	    System.out.println(sbm.capacity());
	// StringBuilder - insert ->returns string
		System.out.println("Insert : "+sbm.insert(0,"Hello"));
	//StringBuilder - delete ->returns string
		System.out.println("Delete : "+sbm.delete(6, 11));
	//StringBuilder - append ->returns string
		System.out.println("Append : "+sbm.append("World"));
	//StringBuilder -replace ->returns string
		System.out.println("Replace : "+sbm.replace(6, 18,"Akshitha"));
	//StringBuilder - length ->returns Integer
		System.out.println("Length : "+sbm.length());
	//StringBuilder - reverse ->returns String
		System.out.println("Reverse : "+sbm.reverse());
	//StringBuilder - charAt -> Returns String
		System.out.println("charAt :"+sbm.charAt(4));
	//EnsureCapacity
		sbm.ensureCapacity(50);
		System.out.println("EnsureCapacity : "+sbm.capacity());
	}

}
