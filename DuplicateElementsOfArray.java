package week1.day2;


public class DuplicateElementsOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,3,4,5,6,1,4,7,5,6,4,1,1,1,8};
          System.out.println(arr.length);
          System.out.println((arr.length)-1);
          int temp = 0;
          int count = 0;
          for (int i = 0; i < arr.length -1; i++) 
          {
          count = 1;
         for (int j = i+1; j < arr.length-1; j++) 
          {
        	  if(arr[i]==arr[j])
        	  {
        		  temp = arr[i];
        		  count++;
        	  }
          }
          
          
          if (count > 1) {
        	  System.out.println("duplicated values are "   + temp    +   "occurance"    + count );
          }  
          } 	  
          
		}
			
		}
