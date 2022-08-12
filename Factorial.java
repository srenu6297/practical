//Write a program to find factorial of a number

package aug12;

import java.util.Scanner;

class fact{
	public void factNumber()
	{
		System.out.println("Enter number : ");
		Scanner s=new Scanner(System.in);
		
		// take input from user,using Scanner class
		
		int num=s.nextInt();
		int i=1;
		int fact=1;
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
			
		}
		System.out.println("Factorial of the number : "+fact);
	}
	}

public class Factorial {

	public static void main(String[] args) {
		
		fact obj=new fact();   // call method
		obj.factNumber();
		
}
}