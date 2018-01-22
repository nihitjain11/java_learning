class RoomRun
{
	public static void main(String args[])
  {
    Room r1 = new Room(10,10,10);
	  r1.volume();
	}
}

class Room
{
	double l, b, h, v;

	Room (double length,double breadth,double height)
	{
  	l = length;
    b = breadth;
    h = height;
  }

	void volume()
	{
    v = l * b * h;
    System.out.println("Volume of Room: " + v + " m^3");
  }
}
