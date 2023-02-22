import java.util.Scanner;
//Count Vowels in the given string
//Input:-s1="Program"
//output:-Total Vowel Count:-1
public class CountVowelsInTheGivenString {

	public static void main(String[] args) {
		
		int count = 0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter String:-");
		String str = in.nextLine();
		
		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
					|| c == 'U') {
				count++;
			}

		}
		System.out.println("Total Vowel Count:-" + count);
	}

}
