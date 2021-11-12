package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "madam";
		int length = str.length();
	 String	strrev = " ";
	 char[] charArray = str.toCharArray();
	// for (int i = 0; i < charArray.length; i++) {
	
	 //System.out.println(charArray[i]);
		
	 //}
	 for (int i = length - 1; i>=0; i--) 
	 {
		 strrev = strrev + charArray[i];
	 }
		 System.out.println("reversed string :" +strrev);
		
	
	 if (str.equals(strrev)) 
		 System.out.println("The given string is palindrome");
		 
	 
	
	}

}
