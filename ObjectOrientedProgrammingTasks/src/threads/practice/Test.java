package threads.practice;

public class Test  extends Thread{

//	public void go() 
//	{
//		Runnable r = new Runnable()
//		{
//			@Override
//			public void run() 
//			{
//				System.out.println("foo");
//			}
//		};
//		Thread t = new Thread(r);
//		t.start();
//		t.run();
//	}
	@Override
	public void run()
	{
		System.out.println("run");
		super.run();
		
	}
	@Override
	public synchronized void start()
	{
		System.out.println("start");
		super.start();
	}

	


}
