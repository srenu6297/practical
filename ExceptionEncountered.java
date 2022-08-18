// Author name : Renu Sharma

/*	You are given a piece of Java code. You have to complete the code by writing down the handlers for exceptions thrown by the code. 
The exceptions the code may throw along with the handler message are listed below:

Division by zero: Print "Invalid division".
String parsed to a numeric variable : Print "Format mismatch".

Exceptions other than mentioned above : Any other exception except the above ones fall in this category.
 Print "Exception encountered".

Finally, after the exception is handled, print "Exception Handling Completed".


public class ExceptionTest
{
  public static void main(String args[])
  {
    //Take input from user as string (Two Numbers n1 and n2)
    //parse string in number using parseInt
    //Divide n1/n2
    
  }

} */

package lab;

import java.util.Scanner;

public class ExceptionEncountered {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two number : ");
		String st1=s.nextLine();
		String st2=s.nextLine();
		
		try
		{
			int a=Integer.parseInt(st1);
			int b=Integer.parseInt(st2);
			int c=a/b;
			System.out.println("Value of a/b : "+c);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Format Mismatch...");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Vlaue Cannot divide by Zero "+ae);
		}
		finally
		{
			System.out.println("Exception Encountered...");
		}
		
		System.out.println("Exception Handling Completed...");

	}

}
