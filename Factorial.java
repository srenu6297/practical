//Author name : Renu Sharma

/* Write a method th find factorial of a number input by user.
factorial(int n).call this methos from main() and pass argument n .
Repeat this untill user enters no.
*/
package Loop_Project;

import java.util.Scanner;

class factorial_1
{
	void factorial()
	{
		Scanner sc=new Scanner(System.in);
		int fact=1;
		String yn="yes";
		while(yn.equals("yes")) {
		System.out.println("Enter any to find Factorial : ");
		int a=sc.nextInt();							//Take input from user
		System.out.println(".......................\n");
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		System.out.println(a+" Factorial is : "+fact+"\n");   // print output
		System.out.println("Do you Check Any Other Factorial ? yes/no");
		yn=sc.next();
	} 
}
}




public class Factorial 
{
	
	public static void main(String[] args) 
	{
		factorial_1 ob=new factorial_1();		// create class object
		ob.factorial();							// call class method

	}
}
