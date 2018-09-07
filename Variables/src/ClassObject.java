//use of get and set from students.java
public class ClassObject {

	
	public static void main(String[] args) {
		student mark = new student();
		
		mark.setId(1);
		mark.setName ("mark");
		mark.setAge (15);
		System.out.println(mark.getName()+ " is " + mark.getAge() + "years old" );
		
student tom = new student();
		
		tom.setId (2);
		tom.setName ("tom");
		tom.setAge (15);
		System.out.println(tom.getName()+ " is " + tom.getAge() + "years old" );
		
		

		
	}
}
