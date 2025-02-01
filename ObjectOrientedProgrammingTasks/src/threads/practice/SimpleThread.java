package threads.practice;

public class SimpleThread extends Thread 
{
    public SimpleThread(String str)
    {
    	super(str);
    }
    public void run()
    {
    	for(int i=1;i<=10;i++)
    	{
    		System.out.println(i+" "+getName());
    	}
    	try
    	{
    		sleep((int)(Math.random()*1000));
    		
    	}
    	catch(InterruptedException e)
    	{
    		
    	}
    	System.out.println("Done"+" "+getName());
    }
}
