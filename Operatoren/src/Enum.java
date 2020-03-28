
public class Enum {
	private enum DaysOFTheWeek {
		Montag, Dienstag, Mittwoch, Donnerstag, Freitag, Samstag, Sonntag
	}

	public static void main(String[] args) {
		System.out.println("Die Tage einer Woche:");
		for (DaysOFTheWeek day : DaysOFTheWeek.values()) {
			System.out.println(day);
		}
	}
}
