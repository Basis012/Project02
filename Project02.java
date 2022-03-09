import java.util.Scanner;
public class Project02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	Q 01: Write a program to get input number from the user, if number is Even OR Odd number then print that number is Odd OR Even... 	
		
	    //	Solve 01;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter you number to find it is Odd or Even...");
		int Value = s.nextInt();
		if (Value % 2 ==0)
		{
			System.out.println("Your Number is Even Number");
		}
		else 
		{
			System.out.println("Your Number is Odd Number");
		}
		// First Question is Completed
		
		
	//  Q 02: Get a number from the user at run time and factorial that number...
		
			//  solve 02;
		
		System.out.println("Please Enter the Number to find the factorial of it");
		int Value1 = s.nextInt();
		int a = 1;
		int fact = 1;
		while (a<=Value1)
		{
			fact = fact * a;
			a++;
		}
		System.out.println("Your Factorial Number is " + fact);
		// Second Question is Completed
	}

}






