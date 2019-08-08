package demos0327;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		// 1 DIMEnsional
		// size is fixed  --> Static Array  --> to overcome this we use collections (ArrayList, HashTable)
		// Stores only similar type of data -- >to overcome this challenge we use Object array
		// ARRAY ; to store the similar values in a single variable
		// lowest bound is zero ... // highest bound is (n-1) // n is size of array
		//check for the   java.lang.ArrayIndexOutOfBoundsException
		//INT ARRAY-------------------------------------------------------------------
		int i[] = new int[4];  
		i[0]=100;
		i[1]=101;
		i[2]=102;
		i[3]=103;
//		i[4]=105;
//		System.out.println(i[4]); 
		System.out.println(i.length);  // size of the array 
		//all the values of array
		for( int j=0;j<4;j++)
	     	{
			System.out.println(i[j]); 
//			boolean b1 = driver
	        }
		//DOUBLE ARRAY-------------------------------------------------------------------
		double d[] = new double[4];
		d[0]=10.1;
		d[1]=10.2;
		d[2]=10.3;
		d[3]=10.4;
		System.out.println(d[2]);
		
		// CHAR ARRAY-------------------------------------------------------------------
		char c[]= new char[3];
		//Boolean ARRAY-------------------------------------------------------------------
		boolean b[] = new boolean[2];
		// String ARRAY-------------------------------------------------------------------
		String s[] = new String[3];
		s[0]="srinivas";
		s[1]="Hyderabad";
		s[2]="LKM";
				System.out.println(s.length);
	 // Object ARRAY-------------------------------------------------------------------
				
				Object obj[] = new Object[3];
				obj[0]=10;
				obj[1]="srinivas";
				obj[2]=true;
				System.out.println(obj.length);
				System.out.println(obj[2]);
						
	}
}
