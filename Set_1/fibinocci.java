import java.util.*;

class fibinocci
{	
	public static void main(String args[])
		{
			int n;
			Scanner input=new Scanner(System.in);
			System.out.print("Enter the number n to which fibinocci should be printed : ");
			n=input.nextInt();
			int a=0,b=1,c;
			System.out.println("Fibinocci printed : ");
			System.out.print(a+" "+b);
			for(int i=2;i<n;i++)
				{
					c=a+b;
					System.out.print(" "+c);
					b=c;
					a=b;
				}
			System.out.println();	
		}
}
