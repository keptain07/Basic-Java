
public class switch_statement {

	public static void main(String[] args) {
		int score = 40;

		switch (score) {
		case 100:
			System.out.println("v. Good");
			break;
		case 70:
			System.out.println("Good");
			break;
		case 35:
			System.out.println("poor");
			break;
		default:
			System.out.println("scores in not database");
			break;
		}
	}
}
