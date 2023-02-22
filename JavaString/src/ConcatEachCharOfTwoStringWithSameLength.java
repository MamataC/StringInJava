import java.util.Scanner;
//concat each char of two string with same length
//Input:-s1="Virat" and s2="Kohli"
//output:-"vkiorhalti"
public class ConcatEachCharOfTwoStringWithSameLength {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 1st String:-");
		String s1 = in.nextLine();
		System.out.println("Enter 2nd String:-");
		String s2=in.nextLine();
		
		
			if(s1.length()==s2.length()) {
			for(int i=0;i<s1.length();i++) {
				
				for(int j=i;j<=i;j++) {
					
					System.out.print(s1.charAt(i));
					System.out.print(s2.charAt(j));
				}
			}
		}
			
				
			}
				
	}

