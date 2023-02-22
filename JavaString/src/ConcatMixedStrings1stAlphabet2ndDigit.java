
public class ConcatMixedStrings1stAlphabet2ndDigit {
//Concat Mixed Strings 1stAlphabe&2ndDigit
//Input:-"a3b5c22d4";
//output:-abcd35224;

	public static void main(String[] args) {
		
		String s = "a3b5c2d4";
		String s1 = "", s2 = "";

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);
			if (c >= 65 && c <= 90 || c >= 97 && c <= 122) {

				s1 = s1 + s.charAt(i);

			}
			if (c >= 48 && c <= 57) {

				s2 = s2 + s.charAt(i);
			}
		}
		System.out.println(s1 + s2);

	}

}
