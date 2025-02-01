package threads.practice;

public class MultiThread implements Runnable {

	@Override
	public void run() {
		System.out.println("Naresh it");
		
	}
	public static void main(String[] args) throws InterruptedException {
		Thread thread=new Thread(new MultiThread());
		thread.start();
		System.out.println("nit");
		thread.join();
		System.out.println("google");  
	}

}
