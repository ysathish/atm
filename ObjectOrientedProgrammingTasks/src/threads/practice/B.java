package threads.practice;

public class B implements Runnable 
{ 
	public void run() 
	{  
		new A().run();  
		new Thread(new A(),"T2").run();  
		new Thread(new A(),"T3").start();  
	}
}  
