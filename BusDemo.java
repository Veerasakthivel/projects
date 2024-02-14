package busreservation;
import java.text.ParseException;
import java.util.*;
public class BusDemo {

	public static void main(String[] args) throws ParseException 
	{
		
		ArrayList<Bus> buses=new ArrayList<Bus>();
		ArrayList<Booking> bookings=new ArrayList<Booking>();
		
		buses.add(new Bus(1,true,1));
		buses.add(new Bus(3,false,50));
		buses.add(new Bus(2,true,25));
		
		for(Bus b:buses) //buses is list
		{
			b.businfo();
		}
		
		int user=1;
		Scanner in=new Scanner(System.in);
		while(user==1)   
		{
			System.out.println("enter 1 to start or 2 to exit");
			user=in.nextInt();
			if(user==1)
	 		{
				Booking booking=new Booking();
				if(booking.isAvailable(buses,bookings))
				{
					bookings.add(booking);
							
					System.out.println("your ticket is confirmed");
				}
				else
				{
					System.out.println("sorry bus is full try another date");
				}
			}
			
		}
	}

}
