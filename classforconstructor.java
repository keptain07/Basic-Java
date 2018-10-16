//class for cube file
public class classforconstructor {
	
	public static void main(String aregs[])
	{
		Cube Cube1 = new Cube();
		System.out.println(Cube1.volume());
		
		Cube cube2 = new Cube(10,10,10);
		System.out.println(cube2.volume());
		
	}

}
