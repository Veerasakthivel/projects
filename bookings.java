package busreservation;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Booking {
	String passengerName;
	int Busno;
	Date date;
	
	Booking() throws ParseException
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter the passengername");
		passengerName=in.next();
		
		System.out.println("enter the busno");
		Busno=in.nextInt();
		
		System.out.println("enter date dd-mm-yyyy");
		String dateinput=in.next();
		SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-yyyy"); //change the string in date object that why i create this object
		
		date=dateformat.parse(dateinput); //understand the string date format to create date object
	}

	public boolean isAvailable(ArrayList<Bus> buses, ArrayList<Booking> bookings) {
		int capacity=0;
		for(Bus bus:buses)
		{
			if(bus.getBusno()==Busno)
			{
				capacity=bus.getcapacity();
			}
		}
		int booked=0;
		for(Booking b:bookings)
		{
			if(b.Busno==Busno && b.date.equals(date))
			{
				booked++;
			}
		}
		return booked<capacity?true:false;
	}
}
