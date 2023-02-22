import java.util.Scanner;
//StringReverse
public class StringReverse {

	public static void main(String[] args) {
		
		String s="";
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter String:-");
		String str = in.nextLine();
		System.out.println("Before Reverse:-"+str);
		
		for(int i=(str.length()-1);i>=0;i--) {
			
			s = s+str.charAt(i);
			
		}
		System.out.print("After Reverse:-"+s);	
	
	}

}
