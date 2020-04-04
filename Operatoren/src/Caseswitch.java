
public class Caseswitch {
	public static void main(String[] text) {
		int checked = 0;
		char state = ' '; // Initialisierung notwendig
		switch (checked) {
		case 0:
			state = '-';
			break;
		case 1:
			state = '+';
			break;

		}

		System.out.println("state ist " + Character.toString(state));

	}
}
