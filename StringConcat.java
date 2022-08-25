// Author name : Renu Sharma
/*
 * Write a method that takes a String[] as an argument and returns a String containing the concatenation
 of all the strings in the input array. Invoke your method 3 times with different arguments. Make
 sure that your code handles the cases where the argument is null.

*/

package StringArray;

public class StringConcat {

			static String strConcat(String st[])
			{
				//converting st array in StringBuilder object, for using append method
				StringBuilder builder =new StringBuilder();
				try
				{
					//here, Exception will be thrown if st is empty
					if(st==null)
					{
						throw new Exception();
					}
					//here, we have used a for each loop to join array values one by one 
					for(String s:st)
					{
						builder.append(s+" ");
					}
				}
				catch(Exception e)
				{
					//this sop statement will print a msg is the string is null
					System.out.println("The Array Cannot be null");
				}
				//this will return the method in the form of string
				return builder.toString();
			}
		 public static void main(String args[])
		 {
			 //three array strings
			 String str1[]=null;
			 String str2[]= {"Hi","Dear"};
			 String str3[]= {"I", "am","Renu..."};
			 
			//invoking the method strConcat(String st[]) 3 times 
			 System.out.println(strConcat(str1));//Message will print( The Array cannot be null)
			 System.out.println(strConcat(str2));
			 System.out.println(strConcat(str3));
		 }
		
	}


