import java.util.Scanner;
//Uppercase The Given String
//Input:-s1="JAVA"
//Output:-"java"
public class LowercaseTheGivenString {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Enter String:-");
		String str = in.nextLine();

		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);
			if (c >= 65 || c <= 90) {

				c = (char) (c + 32);
				System.out.print(c);
			} else {

				System.out.print(c);
			}
			
		}

	}

}
