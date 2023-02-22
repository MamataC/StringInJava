
public class PrintEachCharacterNumberOfTimesAsDigit {
//Print Each Character Number Of Times As Digit
//Input:-"a1b2c3d4"
//Output:-a bb ccc dddd
	public static void main(String[] args) {

		String s = "a1b2c3d4";
		int j = 0, count = 0;

		while (j < s.length()) {

			char c = s.charAt(j);

			count = (s.charAt(j + 1) - 48);

			// System.out.println(count);

			for (int i = 0; i < count; i++) {

				System.out.print(c);
			}

			j += 2;

		}

	}

}
