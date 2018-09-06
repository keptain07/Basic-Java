// method for parameter passing and returning value
public class method {

	public static void main(String[] args) {
		sayHello("john");
		add(12, 26);
		add(23, 23);
		int sum = add(23, 23);
		int total = sum * 10;

		System.out.println(total);

	}

	public static void sayHello(String name)

	{
		System.out.println("Heyy" + name);
	}

	public static int add(int a, int b) {
		// System.out.println(a + b);
		return (a + b);
	}

}
