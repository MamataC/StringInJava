import java.util.Scanner;
//count Consonants In The Given String
//Input:-s1="Program"
//Output:-Total consonant count:-5
public class CountConsonantsInTheGivenString {

	public static void main(String[] args) {

		int count = 0;

		Scanner in = new Scanner(System.in);

		System.out.println("Enter String:-");
		String str = in.nextLine();

		for (int i = 0; i < str.length(); i++) {

			char c = str.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
					|| c == 'U') {
				continue;
			} 
			else {
				count++;
			}
			
		}
		
		System.out.println("Total Consonant Count:-" + count);
 
	}

}
