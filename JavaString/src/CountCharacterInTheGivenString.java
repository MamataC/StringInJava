import java.util.Scanner;
//Count Character In The Given String
//Input:-s1="mamata1234"
//Output:-Total Count=6
public class CountCharacterInTheGivenString {

	public static void main(String[] args) {

		int count = 0;

		Scanner in = new Scanner(System.in);

		System.out.println("Enter String:-");
		String str = in.nextLine();

		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);
			if (c >= 65 && c <= 90 || c >= 97 && c <= 122) {

				count++;
			}

		}
		System.out.println("Total Count:-"+count);
	}

}
