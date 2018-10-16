//constructor example
public class Cube {

	int length;
	int weigth;
	int heigth;

	public int volume() {
		return (length * weigth * heigth);
	}

	Cube() {
		length = 10;
		weigth = 20;
		heigth = 30;
	}
	
	Cube(int l, int w, int h) {
		length = l;
		weigth = w;
		heigth = h;
	}
}
