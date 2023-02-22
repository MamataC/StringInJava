import java.util.Scanner;
//Concat two strings and create a new string
//Input:-s1="Mamata" and s2="Pujari"
//output:-str="MamataChetan"
public class ConcatTwoStringsAndCreateNewString {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter String1:-");
		String str1=in.nextLine();
		
		System.out.println("Enter String2");
		String str2 =in.nextLine();
		
		//By using concat() inbuilt function
		String string=str1.concat(str2);
		System.out.println("String concat:-"+string);
		
		//Manually String combine two string
		String str=str1+str2;
		System.out.println("String Concat:-"+str);
		
	}

}
