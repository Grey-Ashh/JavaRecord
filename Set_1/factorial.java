import java.util.*;

class factorial
{	
	public static void main(String args[])
		{
			int num;
			Scanner input=new Scanner(System.in);
			System.out.print("Enter the number: ");
			num=input.nextInt();
			int facto=1;
			for(int i=1;i<=num;i++)
				facto*=i;
			System.out.println("Factorial of the number= "+facto);
		}
}
