package busreservation;

public class Bus {
	int Busno;
	boolean ac;
	int capacity; //get and set method used to acces the data;
	public int getBusno()
	{
		return Busno;
		
	}
	
	Bus(int no,boolean ac,int cap)
	{
		this.Busno=no;
		this.ac=ac;
		this.capacity=cap;
	}
	
	public boolean getAc()
	{
		return ac;
	}
	
	public void setAc(boolean val)
	{
		ac=val;
	}
	
	
	public int getcapacity()
	{
		return capacity;
	}
	
	public void setcapacity(int cap)
	{
		capacity=cap;
	}
	
	
	public void businfo()
	{
		System.out.println("busno "+Busno+" Ac "+ac+"capacity"+capacity);
	}
}

