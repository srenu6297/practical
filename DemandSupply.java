// Author name : Renu Sharma

/*
  Q.3 Apply InterThread Communication on demand and supply model.
  Create a class Producer with one data member int availableProduct and 
  two methods --demand() and supply().
  Create two threads . In the run() of first thread call demand(int n) and 
  In the run() of second thread call supply(int n).If deamnding number is gretaer than availableProduct
  consumer should wait till supply increases the availableProduct.
 */

package MultiThreading;

class Producer
{
	 int availableProduct=5000;
	synchronized  public void demand(int n)
	{
		System.out.println(Thread.currentThread().getName()+"....Demand.....");
		if(availableProduct<n)
		{
			try
			{
				wait(10);
				
			}
		 catch (Exception e) {
			
			e.printStackTrace();
		}
			availableProduct-=n;
		}
		else
		{
			availableProduct-=n;
			System.out.println(Thread.currentThread().getName()+" product left After demand : "+availableProduct);
		}
	}

	synchronized  public void supply(int n)
	{
		System.out.println(Thread.currentThread().getName()+"....Supply.....");
		availableProduct+=n;
		System.out.println(Thread.currentThread().getName()+" product After supply : "+availableProduct);
		notifyAll();
	}
	
}

class First_thread implements Runnable
{
	Producer pro;
	First_thread(Producer pro)
	{
		this.pro=pro;
	}
	@Override
	public void run() {
		pro.demand(7000);
			
	}
	
}


class Second_thread implements Runnable
{
	Producer pro;
	Second_thread(Producer pro)
	{
		this.pro=pro;
	}
	@Override
	public void run() {
		pro.supply(3000);
		
	}
	
}

public class DemandSupply {

	public static void main(String[] args) {
		Producer pro=new Producer();
		First_thread t1=new First_thread(pro);
		Second_thread t2=new Second_thread(pro);
		
		Thread th1=new Thread(t1,"Thread 1 ");
		Thread th2=new Thread(t2,"Thread 2 ");
		//th1.isAlive();
		th1.start();
		th2.start();
		
	}

}
