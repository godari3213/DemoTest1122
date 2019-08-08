package MyDemo03.MyDemo03;

public class OMCDemo1 {
     
	int x=100;
	int y=200;
	public static void main(String[] args) 
	{
		OMCDemo1 obj1= new OMCDemo1();
		System.out.println("x value is :"+obj1.x);
		System.out.println("y value is :"+obj1.y);
		obj1.Sum();
	}
	public void Sum()
	{
		int x=100;
		int y=200;
		int total;
		total=x+y;
		System.out.println(total);
	}
}
