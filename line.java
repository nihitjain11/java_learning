class Driver
{
	public static void main(String args[])
	{
		Line l1 = new Line(4,2,8,4); /*enter values x1,x2,y1,y2 here*/
		l1.calculateSlope();
		l1.calculateIntercept();
		l1.displayEquation();
	}
}

class Line
{
  double x1,x2,y1,y2,m,c;

  Line(double a,double b,double c,double d)
  {
    x1 = a;
		y1 = b;
		x2 = c;
		y2 = d;
  }

  void calculateSlope()
  {
    m = (y2 - y1)/(x2 - x1);
    System.out.println("Slope is " + m);
  }

  void calculateIntercept()
  {
    c = y2 - (m*x2);
    System.out.println("Intercept is " + c);
  }

  void displayEquation()
  {
    System.out.println("Equation: y = " + m + " x + " + c );
  }

}
