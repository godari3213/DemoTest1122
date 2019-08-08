package demos0327;

public class ArraysDemo2 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
////int i
//int i[]= new int[3];
//i[0]= 10;
//i[1]= 10;
//i[2]= 10;
////i[3]= 10;
//System.out.println(i[0]);
//System.out.println(i.length);
//	}
//	String s[] = new String[5];
//	s[0]= "srinivas";
//	s[1]= "hyd";
//	s[2]= "lkm";
//	System.out.println(s[0]);
//	System.out.println(s.length);
//	
//boolean b[] = new boolean[1];
//	b[0]= true;
//	b[1]= false;
//		System.out.println(b[0]);
//	System.out.println(b.length);
//	
//	char c[] = new char[3];
//	c[0]= test;
//	c[1]= tes;
//		System.out.println(c[0]);
//	System.out.println(c.length);
//	
//	double d[] = new double[3];
//	d[0]= 10.235;
//	d[1]= 79.564;
//	d[2] ="srinivas";
//		System.out.println(d[0]);
//	System.out.println(d.length);
	
	Object obj1[][] = new Object[3][4];
	obj1[0][0]= 1;
	obj1[0][1]= "Srinivas";
	obj1[0][2]= 1000;
	obj1[0][3]= true;
	obj1[1][0]= 2;
	obj1[1][1]= "SrinivasGodari";
	obj1[1][2]= 10060;
	obj1[1][3]= false;
	System.out.println("rows:"+obj1.length);
	System.out.println("cols:"+obj1[0].length);
	System.out.println("1*3 is:"+obj1[1][3]);
}
}