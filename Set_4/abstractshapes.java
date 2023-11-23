abstract class Shape
{
	abstract void numberofsides();
}

class Rectangle extends Shape
{
	void numberofsides()
	{
		System.out.println("Rectangle No.of sides: 4");		
	}	
}

class Triangle extends Shape
{
	void numberofsides()
		{
			System.out.println("Triangle No.of sides: 3");
		}	
}

class Hexagon extends Shape
{
	void numberofsides()
		{
			System.out.println("Hexagon No.of sides: 6");
		}
}

class abstractshapes
{
	public static void main(String args[])
		{
			Shape r=new Rectangle();
			Shape t=new Triangle();
			Shape h=new Hexagon();
			r.numberofsides();
			t.numberofsides();
			h.numberofsides();
		}
}
