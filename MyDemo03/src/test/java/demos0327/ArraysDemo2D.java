package demos0327;

public class ArraysDemo2D {

	public static void main(String[] args) {
		// 2 Dimensional ARRAY
		
		String x[][] = new String[4][5];
		System.out.println(x.length); // here length will give  you total number of rows
        System.out.println(x[0].length);        ///total no of columns
        
        //storing the variables in 2D array
        x[0][0] = "hyderabad";
        x[0][1] ="srinivas";
        x[0][2] ="SrinivasGodari";
        System.out.println(x[0][1]);
        
        // printing all the values of Array
        for (int row=0;row<x.length;row++)
        {
        	for(int col=0;col<x[0].length;col++)
        	{
        		System.out.println(x[row][col]);
        	}
        		
        }
	}

}
