package exmple;

public class Temparature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] temp;
temp = new int[5];
temp[0]=10;
temp[1]=10;
System.out.println("the temparature is:"+ temp.length);// returns array length
System.out.println("the array value:" +temp[4]);
System.out.println(temp);
//printArray(temp);

	}
	public static void printArray(int[] anArray) {
	      for (int i = 0; i < anArray.length; i++) {
	         if (i > 0) {
	            System.out.print(", ");
	         }
	         System.out.print(anArray[i]);
	      }
}
}