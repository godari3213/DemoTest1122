package demos0327;

public class TryCatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=0;
		int div;
		try
		{
			div=a/b;
//			System.out.println(div);
		}
	catch(Exception e)
		{
//		System.out.println(e);
		if(e.getMessage().equals("/ by zero"))
		{
			System.out.println("Exception handled");
			System.out.println(e.getMessage());
			System.out.println(e);
		}
		else
			{
			System.out.println("Hi program is executing");
		}
		}

	}

}
