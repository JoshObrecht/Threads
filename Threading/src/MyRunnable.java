
public class MyRunnable implements Runnable {
	int random = (int)(Math.random()*999)+1;
	public void run()
	{
		try {
		System.out.println(Thread.currentThread().getName()+" is sleeping for "+random+" miliseconds.");
		Thread.sleep(random);
		System.out.println(Thread.currentThread().getName()+ " woke.");
		
		}catch(Exception e){}
	}

}
