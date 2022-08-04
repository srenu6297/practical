// Author name : Renu Sharma

//write a java  program to calculate the average value of array elements

package practical;

public class ArrayAvg {

	public static void main(String[] args) {
		
		//initialize array
		int[] num=new int[] {20,25,30,35,55,66,77};
		// calculate sum of all array elements
		
		int sum=0;
		for(int i=0;i<num.length;i++)
		{
			sum=sum+num[i];
			
		}
		//calculate average value
		double average=sum/num.length;
		System.out.print("Average value of the array elements is : "+average);

	}
}
