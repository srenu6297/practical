//Author name : Renu Sharma
/*
 * Write a program to print table of any number input by user.
 */
package Loop_Project;

import java.util.Scanner;

class Table
{
	public void table()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any number to get Table : " );
		int a=sc.nextInt();									//Take input from user
		System.out.println(".............................\n");
		for(int i=1;i<=10;i++)
		{
			System.out.println(a*i);
		}
	}
}

public class Table_Print 
{
	public static void main(String...args)
	{
		Table ob=new Table();    // create class object
		ob.table();				// call class method
		
	}

}
