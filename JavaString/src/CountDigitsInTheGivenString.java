import java.util.Scanner;
//Count Digits In The Given String
//Input:-s1="abc123"
//Output:-Total digits:-3
public class CountDigitsInTheGivenString {

	public static void main(String[] args) {

		int count = 0;

		Scanner in = new Scanner(System.in);

		System.out.println("Enter String:-");
		String str = in.nextLine();

		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);
			if (c >= 48 && c <= 57) {
				count++;
			}
		}
		System.out.println("Total digits:-" + count);
	}

}
