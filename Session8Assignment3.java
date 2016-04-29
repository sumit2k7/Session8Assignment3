
public class Session8Assignment3 implements Runnable {

	public static void main(String[] args) {
		Session8Assignment3 sa=new Session8Assignment3();
		Thread a=new Thread(sa);
		Thread b=new Thread(sa);
		Thread c=new Thread(sa);
		
		a.setName("Thread A");
		b.setName("Thread B");
		c.setName("Thread C");
		
		a.setPriority(Thread.MIN_PRIORITY);
		b.setPriority(Thread.MAX_PRIORITY);
		c.setPriority(Thread.NORM_PRIORITY);
		a.start();
		b.start();
		c.start();
	}	
		public void run()
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(Thread.currentThread().getName()+ " :-> "+i+ " is Running");
				try
				{
					Thread.sleep(1000);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		}
	

}
