package week1.day2;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "$$ Welcome to 2nd class of Automation $$";
		int letter = 0 , space = 0, num = 0, specialchar = 0;
		char charArray[] = test.toCharArray();
		for (int i = 0; i < charArray.length; i++) 
			{
			if (Character.isLetter(charArray[i])) 
			{
				letter +=1;
				
			}
			else if (Character.isDigit(charArray[i])) 
			{
				num +=1;
			}
			else if (charArray[i] ==' ') 
			{
				space +=1;
				
			}
			else
			{
				specialchar +=1;
			}
		}
		System.out.println("Letters :"  + letter);	
		System.out.println("Numbers :"   + num);
		System.out.println("Spaces : "  +space);
		System.out.println("Specialcharacters :"   +specialchar);


	}

}
