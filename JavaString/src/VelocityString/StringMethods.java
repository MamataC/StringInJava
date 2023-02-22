package VelocityString;

public class StringMethods {

	public static void main(String[] args) {
		String s = "Automation";
		// charAT
		char var = s.charAt(0);
		// char var1 = s.charAt(11);//out of string length so throws exception

		System.out.println(var);
		// System.out.println(var1);//out of string length so throws exception

		String s1 = "Velocity";
		String s2 = "Automation";

		// concat
		String join = s1.concat(s2);
		System.out.println(join);

		// euals and ==
		String S1 = "power";
		String S2 = "power";
		String S3 = new String("power");

		boolean eql = S1.equals(S2);
		boolean eql1 = S1.equals(S3);// object is created in non-pool area(heap) string pool area but content is same
										// so its true
		
		System.out.println(eql);
		System.out.println(eql1);
		// if(S1==S2)//memory address same so true
		if (S1 == S3) {// signs compares between memory address i.e. object address
			System.out.println("TRUE");
		} else {
			System.out.println("False");
		}
			
			//equalIgnoreCase
			String str1 = "power";
			String str2 = "Power";
			String str3 = new String("Power");

			boolean eq1 = S1.equalsIgnoreCase(str2);
			boolean eq2 = S1.equalsIgnoreCase(str3);
			
			//SubString;
			String str = "selenium";
			String st = str.substring(4);
			System.out.println(st);
			
			//Substring(beginindex,endindex)
			String st1=str.substring(0, 3);
			System.out.println(st1);//endindex print with 1 before (0,3) (0,1,2)
			
			//length
			int length = str.length();
			System.out.println(length);//length of string count number of character in string and size of string count numberofcharacter+\0.		}

			//replace
			String S = "ababa";
			String Ss =S.replace('b', 'a');
			System.out.println(Ss);
			
			//tolowercase
			String a = "AbC";
			String b = a.toLowerCase();
			System.out.println(b);
			
			//touppercase
			String c = a.toUpperCase();
			System.out.println(c);
			
			//trim
			String m = "   Velocity   ";
			String p = "  V e locity";//in between space not removed by trim method
			
			String n = m.trim();
			String q = p.trim();
			
			System.out.println(n);
			System.out.println(q);
			
			//indexOf
			String string = "Velocity";
			String so = "aaab";
			int x = string.indexOf("c");
			int y = so.indexOf("a");
			System.out.println(x);
			System.out.println(y);//when got 1st matching character it will returen index of that character
			
			//lastindexof
			int si = string.lastIndexOf("i");
			int si1 = so.lastIndexOf("a");
			System.out.println(si);
			System.out.println(si1);// when got last matching character it will returun index of that character
			
			//contains
			String v = "VelocityAutomationJavaClasses";
			
			boolean op = v.contains("Automation");
			boolean op1 = v.contains("mamata");
			System.out.println(op);
			System.out.println(op1);
			
			//tochararray
			
			String S_t ="Velocityautomationjavaclasses";
			System.out.println(S_t);
			char[] Array = S_t.toCharArray();
			
			for(int i=0;i<Array.length;i++) {
				
				System.out.println(Array[i]);
			}
			
		
			//isdigit(char ch)
		String p1 = "velocityjava20";
		for(int j=0;j<p1.length();j++) {
			char ch=p1.charAt(j);
			if(ch>=48 && ch<=57) {
			boolean var2 = Character.isDigit(ch);
			System.out.println(ch);
			}
		}

			
			//split
			String Str4 ="Automation Developer";
			String[] Output = Str4.split("\\s");//regax command(\\s)
			for(String outr:Output) {
				System.out.println(outr);}
			
			//isblank
			String Str6= "";
			String Str7=" ";
			String Str8="45";
			
			boolean bo =Str6.isBlank();//true for nonspace() 
			System.out.println(bo);
			boolean bo1 =Str7.isBlank();//true for space
			System.out.println(bo1);
			boolean bo2 =Str8.isBlank();//false for character
			System.out.println(bo2);
			
			
			boolean boo =Str6.isEmpty();//true for nonspace
			System.out.println(boo);
			boolean boo1 =Str7.isEmpty();//false for space
			System.out.println(boo1);
			boolean boo2 =Str8.isEmpty();//false for character
			System.out.println(boo2);
			
		
		
	}
	
}

	
