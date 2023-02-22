import java.util.Scanner;

//Print each character of a string on new line
//Input:- s1="Mamata"
//Output:-
//M
//a
//m
//a
//t
//a

public class PrintEachCharOfStringOnNewLine {

	public static void main(String[] args) {

		System.out.println("Enter String:-");
		
		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();
		
		//Calculate String Length
		System.out.println(str.length());
		
		for (int i = 0; i < str.length(); i++) {
			
			//Taking character from string one by one
			char c = str.charAt(i);
			//Printing character from string one by one
			System.out.println(c);
		}
	}

}
