import java.util.Scanner;
//CheckStringIsPalindromeOrNot
//Input:-s1="MOM"
//Output=reversed string="MOM" string is palindrome
public class CheckStringIsPalindromeOrNot {

	public static void main(String[] args) {
		
		String s="";
		
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter String:-");
        String str=in.nextLine();
        System.out.println("input String:-"+str);
        
        for(int i=(str.length()-1);i>=0;i--) {
        	
        	s=s+str.charAt(i);
        }
        System.out.println("reversed String:-"+s);
        
        if(s.equals(str)) {
        	
        	System.out.println("String is Palindrome!");
        }
        
        else {
        	
        	System.out.println("String is not Palindrome!");
        }
	}

}
