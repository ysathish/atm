package com.in.ticket;

public class TicketBook  {
   int availableSeat=1;
   int bookTicket;
   TicketBook(int bookTicket)
   {
	   this.bookTicket=bookTicket;
	   
   }
   
//   @Override
//   public void run()
//   {
//	   runs();
//   }
   public synchronized void runs() 
   {
	   String name=null;
	   if(availableSeat>=bookTicket)
	   {
		   name=Thread.currentThread().getName();
		   System.out.println("you booked "+bookTicket+"  ticket for "+name);
		   availableSeat-=bookTicket;
		   
	   }
	   else
	   {
		   name=Thread.currentThread().getName();
		   System.out.println("sorry "+name+" seats are not available");
	   }
   	
   	
   }
   public static void main(String[] args) 
   {
	   TicketBook tbk=new TicketBook(1);
	   Runnable r1=()->tbk.runs();
	   Thread t1=new Thread(r1,"scott");
	   Thread t2=new Thread(r1,"smith");
	   
	   t1.start();
	   t2.start();
//	   t1.start();
	
}

}
