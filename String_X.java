// Author name : Renu Sharma

/* 
 * Write a method that takes a String and returns a String of the
same length containing the 'X' character in all positions except the
last 4 positions. The characters in the last 4 positions must be the
same as in the original string. For example, if the argument is
"12345678", the return value should be "XXXX5678".
*/

package StringArray;

import java.util.Scanner;

		public class String_X 
		{
		
			String character()			// Method
			{
				 Scanner sc=new Scanner(System.in); // Input for User
				 
			       System.out.println("Enter the String : ");
			       String str=sc.nextLine();
			       
			       if(str.length()>4) // length Condition 
			       {
			    	   String allexceptlast4=str.substring(0,str.length()-4);
			    	   String repeatString="x".repeat(allexceptlast4.length());
			    	    repeatString=repeatString+str.substring(str.length()-4);
			    	  
			    	   System.out.println(repeatString); // Print
			       }
			       else
			       {
			    	   System.out.println("The String should be Greater than Four Digit... ");
			       }
			       sc.close(); 	//close the Scanner
				   return str;
			       
				}
			public static void main(String args[])
			{
				String_X  obj=new String_X(); //object of Class
				
				obj.character(); 		//calling the method 
			}
	

	}


