package threads.practice;

public class Test27 extends Thread {
	public void run()
	{
		for(int i=1;i<2;i++)
		{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" ");
		}
		
	}

	public static void main(String[] args) {
		Test27 t=new Test27();
		Thread t1=new Thread(t,"Rahul");
		Thread t2=new Thread(t,"Ram");
		t1.start();t2.start();
	}

}
