package week1.day2;

public class Calculator {
	//int n1 = 5 , n2 = 6, n3 = 7;
  
  public int add(int n1 ,int n2 , int n3) {
	// TODO Auto-generated method stub
	  int sum;
        sum = n1+n2+n3;
   return sum;
}
 public int sub(int n1 , int n2) {
	 // TODO Auto-generated method stub
	 int diff;
     diff = n1 - n2;
     return diff;
 
}
 public double mul(double n1 , double n2) {
	// TODO Auto-generated method stub
	 double multiple;
   multiple = n1 * n2;
     return multiple;
}
 public float divide(float n1 , float n2) {
	// TODO Auto-generated method stub
	 float divided;
    divided = n1 / n2;
  return divided;
}
 public static void main(String[] args) {
	 Calculator cal = new Calculator();
	 System.out.println("addition : " +cal.add(5,6,7));
	 System.out.println("subtraction : " +cal.sub(10,8));
	 System.out.println("multiplication  :"  +cal.mul(10.4525,8.452) );
	 System.out.println("division  : "  +cal.divide(10,15 ));
	 
	 
}
}
