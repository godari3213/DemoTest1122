package prjct1;

public class Test3 {

	
	public int m1(int val1, int val2)// change void to int as void will not return anything
	{
	System.out.println(val1);
	System.out.println(val2);
	System.out.println("line3");
	System.out.println("line4");
	int res= val1+val2; 
	return res;
	}
	
	public int m1(String val17 ,int val92)
	{
	System.out.println("here is the result");
		return 20;	
	}
	
	public static void main(String[] args) {
		Test3 obj1 = new Test3();
		//obj1.m1(10,20);
System.out.println(obj1.m1(10,20));
		//System.out.println("sample program for the methods creation & Accessing");
		//System.out.println(obj1.m1(10,20));
      obj1.m1("Hello", 20);
		System.out.println();

	}

}
