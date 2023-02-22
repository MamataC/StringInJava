
public class ConcatEachCharacterOfTwoStringWithDiffLength {
//concat each char of two string with different length
//Input:-s1="Sachin" and s2="Tendulkar"
//Output:-s2="STaecnhdiunlkar"
	
	public static void main(String[] args) {
		String s1 = "Sachin";
		String s2 = "Tendulkar";
		String s3 = "";
		int i = 0;
		int l1 = s1.length();
		int l2 = s2.length();
		int max = 0;
		if (l1 > l2)
			max = l1;
		else
			max = l2;

		for (i = 0; i < max; i++) {

			if (i < l1) {

				s3 = s3 + s1.charAt(i);
			}
			if (i < l2) {

				s3 = s3 + s2.charAt(i);
			}

		}

		System.out.println(s3);
	}

}
