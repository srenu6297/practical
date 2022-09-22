// Author name : Renu Sharma

/*
   Threads.java
Q.1 Write a Java program to create multiple thread in Java.
    (Print even and Odd numbers)Set their name and prorities.


 */

package MultiThreading;

class EvenOddNum
{
	 void even()
	{
		 System.out.println(Thread.currentThread().getName()+"The Even numbers are :");
			
			for(int i=0;i<50;i++)
			{	
				//checking condition for Even using if condition
				if(i%2==0)
				{
					System.out.println(Thread.currentThread().getName()+"Even number : "+i);
				}
			}
	}
	 void odd()
	 {
		 System.out.println(Thread.currentThread().getName()+"The Odd numbers are :");
		 for(int i=0;i<50;i++)
			{	
				//checking condition for odd using if condition
				if(i%2!=0)
				{
					System.out.println(Thread.currentThread().getName()+"Odd number : "+i);
				}
			}

	 }
}
class Even implements Runnable
{
	@Override
	public void run() 
	{
		EvenOddNum e=new EvenOddNum();
				e.even();		
	}
}


class Odd implements Runnable
{

	@Override
	public void run() {
		EvenOddNum e=new EvenOddNum();
				e.odd();
		
	}
	
}


public class Threads {

	public static void main(String[] args) {
		EvenOddNum r=new EvenOddNum();
		Odd r1=new Odd();
		Even r2=new Even();
		
		Thread th1=new Thread(r1,"Thread 1 ");
		Thread th2=new Thread(r2,"Thread 2 ");
		
		th1.start();
		th1.setPriority(1);
		th2.start();
		th2.setPriority(2);
	}

}
