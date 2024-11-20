package Synchronization;

class Busbooking
{
	int totalseat=40;
	public synchronized void Seatbook(int seat)
	{
		if(seat<=totalseat)
		{
			totalseat=totalseat-seat;
			System.out.println(seat+" Seat is avialable");
			System.out.println("Remaining seat are :"+totalseat);
		}
		else
		{
			totalseat=totalseat-seat;
			System.out.println("Sorry..!!  Booking is Full No seat avialable :" +totalseat);
		}
	}
}
//------------------------------------------------------------------------------------------------

class person1 extends Thread
{
	Busbooking b1;
	
	public person1(Busbooking b1)
	{
		this.b1=b1;
	}
	
	public void run()
	{
		b1.Seatbook(10);
	}
}
//-------------------------------------------------------------------------------------------------

class person2 extends Thread
{
	Busbooking b2;
	
	public person2(Busbooking b2)
	{
		this.b2=b2;
	}
	
	public void run()
	{
		b2.Seatbook(10);
	}
}


//------------------------------------------------------------------------------------------------
class person3 extends Thread
{
	Busbooking b3;
	
	public person3(Busbooking b3)
	{
		this.b3=b3;
	}
	
	public void run()
	{
		b3.Seatbook(20);
	}
}
//-------------------------------------------------------------------------------------------------
public class Booking 
{
	public static void main(String[] args) 
	{	
		Busbooking bb = new Busbooking();
		
		person1 p1 = new person1(bb);
		person2 p2 = new person2(bb);
		person3 p3=new person3(bb);
		p1.start();
		p2.start();
		p3.start();
	}
}
