//Author name : Renu Sharma

/*
 * Write a program to count number of char in a string entered by user excluding space. 
 */

package Loop_Project;

import java.util.Scanner;

class count
{
	void char_count()
	{
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String to Count Char with space.... :  ");
		String a=sc.nextLine();
		a.toLowerCase();
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)!=' ') //use for count only characters 
			{
				count++;
			}
		}
		System.out.println("Total characters in string are : "+count);
	}
}

public class Count_Char {

	public static void main(String[] args) 
	{
		count ob=new count();
		ob.char_count();

	}
}
