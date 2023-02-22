package VelocityString;

public class BasicStringDeclare {

	public static void main(String[] args) {
		

		String s1 = new String("Mamata");
		String s2 = new String("Pujari");//Same content so heap memory object(new) is not created
		String s3 = new String("Pujari");//different content so heap memory object is created
		
		String S1 ="Mamata";
		String S2="Mamata";
		S2="Mamata";//only one object created because new keyword is not used
	}

}
