package testing1;

public class Addex1 {
  int c= 23; //instance variable (within class , outside method constructor/
	public static void main(String[] args) {
		  // TODO Auto-generated method stub
		//whatever you declare here is the example for the local variables, this memory gets destroyed once the 
		//this variable execution is completed
		//local variables can't be accessible out side the methods
		Addex1 obj1=new Addex1();// you have create a reference object for this
		System.out.println(obj1.c);
		/*int a=10; //data type variable; (Syntax)
		short b=22;
		char ename='p';
		String s1="srinivas godari";
 System.out.println("A values is "+ a);*/
 //System.out.println("A values is "+ c);
	}

}
