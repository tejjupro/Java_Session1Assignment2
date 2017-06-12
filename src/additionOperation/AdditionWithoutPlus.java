package additionOperation;
import java.util.Scanner;
public class AdditionWithoutPlus {

	//int x = 10, y = 5, i;
	static int add(int x, int y)
    {
		//using carry for  and b
        int carry;
        
        //using while loop
        while(y!=0)
        {
            carry = x & y;
            x = x ^ y;
            y = carry << 1;
        }
        return x;
    }
	
	//main method	
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	        
	        // to ask for value input for getting the result
	        
	        System.out.println("The numbers to be added are: ");
	        
	        //condition to variables
	        
	        int x = input.nextInt();
	        
	        int y = input.nextInt();
	        
	        //to print the summation
	        
	        System.out.println("The Summation is: "+add(x, y));
	        
	        input.close();
	    }

		@SuppressWarnings("unused") //suppression of compiler warnings used
		private static String add1(final int x, final int y) 
		{
			return null;
		

	}

}
