package VelocityString;
//why string is immutable and final
public class StringQue {

	public static void main(String[] args) {
		//Why its is final
		/*String s="Mamata";
		System.out.println(s);
		
		s="Automation";
		System.out.println(s);*/
		
		String username="Mamata";
		String password="Pass123";
		
		//consider if string is not final and immutable
		
		String s="MamataP";//then Mamata replace with MamataP so user unable to login with 
		                    //same password because object is getting replaced with differnt username
	}

}
