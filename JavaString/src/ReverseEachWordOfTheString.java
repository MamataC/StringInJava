
public class ReverseEachWordOfTheString {
//Reverse Each Word of the string
//Input:-"Sachin Ramesh Tendulkar"
//Output:-"nihcaS hsemaR rakludneT"
	public static void main(String[] args) {
		String s = "Sachin Ramesh Tendulkar ";
		String s1 = "",s3="";
		int i, j, k;
		String s2 = "";
		for (i = 0; i < s.length(); i++) {
             char ch = s.charAt(i);
              s2 = "";
              
			if (ch!=' ') {
				s1 = s1 + s.charAt(i);
				//System.out.println(s1);
			}
			else {
				
				for (j = s1.length()-1; j >= 0; j--) {
					s2 += s1.charAt(j);
			//		System.out.println(s2);
				}
				s1 = "";
				s3 = s3+" "+s2;
				
			}
			
			
		}
		
		System.out.println(s3);
	}
}
