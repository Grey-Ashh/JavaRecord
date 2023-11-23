import java.util.*;

class perimeter
{
	perimeter(int l,int b)
		{
			int a;
			a=2*(l+b);
			System.out.println("Perimeter of Rectangle= "+a);
		}
	perimeter(int r)
		{
			float a;
			a=(float)3.14*r*2;
			System.out.println("Perimeter of Circle= "+a);
		}

}

class perimetershapes
{
	public static void main(String args[])
		{	
			Scanner input=new Scanner(System.in);
			System.out.println("Rectangle");
			System.out.print("Enter length :");
			int length=input.nextInt();
			System.out.print("Enter bredth :");
			int bredth=input.nextInt();
			System.out.println("Circle");
			System.out.print("Enter radius :");
			int radius=input.nextInt();
			perimeter x=new perimeter(length,bredth);
			perimeter y=new perimeter(radius);
		}
}
