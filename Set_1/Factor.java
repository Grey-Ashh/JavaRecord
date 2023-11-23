import java.util.*;

class Factor
{	
	public static void main(String args[])
		{
			int num;
			Scanner input=new Scanner(System.in);
			System.out.print("Enter the number: ");
			num=input.nextInt();
			System.out.println("The factors are,");
			for(int i=1;i<=num;i++)
				{
					if(num%i==0)
						System.out.print(i+" ");
				}
			System.out.println();
		}
}
