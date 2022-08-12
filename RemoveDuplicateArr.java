// Author name : Renu Sharma

//Write a program to remove duplicate elements in an array.

package aug12;

import java.util.Arrays;

public class RemoveDuplicateArr {
	
	public static int removeArray(int arr[],int n)
	{
		if(n==0 || n==1)
		{
			 return n;
		}
		int[] temp=new int[n];
		int j=0;
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				temp[j++]=arr[i];
			}
		}
		temp[j++]=arr[n-1];
		
		// Changing original array
		
		for(int i=0;i<j ;i++)
		{
			arr[i]=temp[i];
		}
		return j;
	}

	
	
	public static void main(String[] args) 
	{
		int arr[]= {10,50,30,20,70,88,8,50,30};
		Arrays.sort(arr);   // sorting array
		int length=arr.length;
		length=removeArray(arr,length);
		
		// print array elements
		
		for(int i=0;i<length;i++)
		{
			System.out.println(arr[i]+ " ");
		}

	}
}
