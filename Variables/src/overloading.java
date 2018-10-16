
public class overloading {
	
	public static void main(String args[])
	{
	System.out.println(add(1,20));
	System.out.println(add(1.2,2.360));
	System.out.println(add("hey"," hi"));
	}
	
	public static int add (int a, int b) {
	return (a+b);
 
}
	
	
	public static double add (double a, double b) {
		return (a+b);
	}
	
	public static String add (String a, String b) {
		return (a+b);
}
}
