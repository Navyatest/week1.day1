package week1.day2;

public class MyMobile {
	String brandName;
	int price;
	String imei;
	
	public void makeCall() {
		// TODO Auto-generated method stub
      System.out.println("make calls");
	}
     public void sendMsg() {
		// TODO Auto-generated method stub
      System.out.println("seng msg");
     }
     public void playvideos() {
		// TODO Auto-generated method stub
      System.out.println("play videos");
	}
     
     private void payBill() {
		// TODO Auto-generated method stub
    System.out.println("pay bills");
	}
public static void main(String[] args) {
	MyMobile objMob = new MyMobile();
	objMob.brandName = "samsung";
	objMob.price = 15000;
	objMob.makeCall();
	objMob.sendMsg();
	objMob.playvideos();
	System.out.println("brandname = " +objMob.brandName);
	System.out.println("price = "  +objMob.price);
}
}
