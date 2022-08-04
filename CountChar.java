//java program to count the total number of characters in a string (except space)

package practical;

public class CountChar {

	public static void main(String[] args) {
		
		String line="java is platform independent";
		int count=0;
		
		//count each character except space
		
		for(int i=0;i<line.length();i++)
		{
			if(line.charAt(i)!=' ')  //use for seperate space from string and count only characters
			{
				count++;
			}
		}
		//total number of characters in string
		
		System.out.println("Total Number of characters in string = "+count);

	}

}
