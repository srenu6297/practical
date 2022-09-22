// Author name : Renu Sharma

/*
 * Q.2 Write a JAVA program which will generate two threads:(Use Synchronization)

- To display 10 terms of Fibonacci series.
- To display 1 to 10 in reverse order.


 */

package MultiThreading;

class Series
{
	synchronized static public void fibonacci()
	{
		System.out.println(Thread.currentThread().getName()+"....Fibonacci Series.....");
		int n1=0,n2=1,n3,i,count=10;
		System.out.print(n1+" "+n2);
		for(i=2;i<count;++i)
		{
			n3=n2+n1;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}
	
	synchronized static public void reverse()
	{
		System.out.println("\n"+Thread.currentThread().getName()+"....Reverse order.....");
		for(int i=10;i>=1;i--)
		{
			System.out.println("Reverse order : "+i);
		}
	}
}


class NewThread implements Runnable
{

	@Override
	public void run()
	{
		Series s=new Series();
		s.fibonacci();
	}
}


class NewThread1 implements Runnable
{

	@Override
	public void run()
	{
		Series s=new Series();
		s.reverse();
	}
}


public class FiboRevThread {

	public static void main(String[] args) {
		Series s=new Series();
		NewThread r=new NewThread();
		NewThread1 r1=new NewThread1();
		
		Thread th1=new Thread(r,"Thread 1 ");
		Thread th2=new Thread(r1,"Thread 2 ");
		
		th1.start();
		
		th2.start();
		

	}

}
