// Author name : Renu Sharma

//Write a java program to remove all the white space from a string.

package aug12;

public class removeWhitespace {

	public static void main(String[] args) {
		String str="java Is A High Level Programming Language ";
		
		// remove white space
		
		str=str.replaceAll("\\s+","");

		System.out.println(str);

	}

}
