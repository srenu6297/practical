//Author name : Renu Sharma

/*
 * 3.Create a class Calculator with two methods add() and substract() and default and parameterized constructor
 Overload theses methods--
   int add(int,int)
   double add(double,int,int)
   String add(String,String)

  int substract(int,int)
   double substract(double,double)

 * */
package Oops_LabTest;

public class Calculator 
{
	public int add(int a,int b)
	{
		int c=a+b;
		System.out.println("Addition of two numbers : "+c);
		return c;
	}
	
	public double add(double a,int b,int c)
	{
		double d=a+b+c;
		System.out.println("Addition of three numbers : "+d);
		return d;
	}
	
	public String add(String str1,String str2)
	{
		String str=str1+str2;
		System.out.println("Addition of two Strings : "+str);
		return str;
	}
	
	public int substract(int a,int b)
	{
		int c=a-b;
		System.out.println("Subtraction of two numbers : "+c);
		return c;
	}
	
	public double substract(double x,double y)
	{
		double z=x-y;
		System.out.println("Subtraction of two(double data type) numbers : "+z);
		return z;
	}
	
	
	
	
	public static void main(String...args)
	{
		Calculator cal=new Calculator();
		cal.add(10, 10);					//int add(int,int)
		cal.add(100000, 12, 566);			//double add(double,int,int)
		cal.add("RENU", "Sharma");			//String add(String,String)
		cal.substract(202, 77);				//int substract(int,int)
		cal.substract(1000000000, 77778889); //double substract(double,double)
		
	}
}
