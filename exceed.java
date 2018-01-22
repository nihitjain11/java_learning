class Exceed
{
	public static void main(String args[])
	{
		double ram = 10000, shyam = 1;
		int day = 0;
		double tram = 0, tshyam = 0; //total amount given by ram and shyam
		while (tshyam <= tram)
		{
			day = day + 1;
			tshyam = tshyam + shyam;
			tram = tram + ram;
			shyam = shyam*2;
		}
		System.out.println("On day "+ (day+1) +"\nShyam paid a total amount of Rs. "+ tshyam +"/-\nRam paid a total amount Rs."+ tram +"/-");

	}
}
