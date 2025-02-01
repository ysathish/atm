package threads.practice;

public class Test1 {

	public static void main(String[] args)
	{
		//Question no 1
		//		Test t1=new Test();
		//		t1.start();
		//		t1.start();
		//question no 2
		//		Thread t=Thread.currentThread();
		//		System.out.println(t);
		//		System.out.println("name of the thread "+t.getName());
		//		System.out.println("name of the Id "+t.getId());
		//Question no 3
		//		new Thread()
		//		{
		//			public void run()
		//			{
		//				System.out.println("task one");
		//			}
		//		}.start();
		//		new Thread()
		//		{
		//			public void run()
		//			{
		//				System.out.println("task two");
		//			}
		//		}.start();
		//Question no 4
//		Runnable r1=new Runnable()
//		{
//			public void run()
//			{
//				System.out.println("r1");
//			}
//		};
//		Runnable r2=new Runnable()
//		{
//			public void run()
//			{
//				System.out.println("r2");
//			}
//		};
//		Thread t1=new Thread(r1);
//		Thread t2=new Thread(r2);
//		t1.start();
//		t2.start();
		//Question 5
		new SimpleThread("J2EE").start();
        new SimpleThread("J2ME").start(); 
        
		
		




	}

}
