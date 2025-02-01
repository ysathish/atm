package threads.practice;

public class MultiThread2 extends Thread {
	static public MultiThread2  nit()
	{
		Test t=new Test();
		t.start();
//		return ;
		MultiThread2 t1=new MultiThread2();

		return t1;
	}
	public String m()
	{
		return "g";
		
	}

	public static void main(String[] args) {
		nit();
		Thread t=new Thread();
		Thread.currentThread().getName();
		String s=MultiThread2.nit().m();

	}

}
