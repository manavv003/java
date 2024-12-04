

class odd extends Thread
{
	public void run()
	{
		synchronized(this)
    	{
		try
		{
			for(int i=1;i<=100;i=i+2)
			{
				System.out.println("odd: " + i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("odd exception: " + e);
		}
    	}
	}
}
class PrimeThread implements Runnable {
  
    public void run() {
        for (int i = 2; i <= 100; i++) { 
            if (isPrime(i)) {
                System.out.println("PrimeThread: " + i);
                try {
                    Thread.sleep(1000); 
                } catch (InterruptedException e) {
                    System.out.println("PrimeThread interrupted: " + e.getMessage());
                }
            }
        }
    }

  
    private boolean isPrime(int number) {
        if (number <= 1) 
        {
             	return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
            {
            	 return false;
            }
        }
        return true;
    }
}
public class multitread
{
	public static void main(String[] args)
	{
		odd o = new odd();
		PrimeThread p = new PrimeThread();
		Thread pt = new Thread(p);
		
		o.start();
		pt.start();
	}
}
