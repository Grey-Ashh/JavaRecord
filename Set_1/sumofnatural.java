import java.util.*;

class sumofnatural
{	
	public static void main(String args[])
		{
			int n,sum=0;
			Scanner input=new Scanner(System.in);
			System.out.print("Enter the number: ");
			n=input.nextInt();
			for(int i=0;i<=n;i++)
				sum=sum+i;
			System.out.println("Enter the sum of the numbers= "+sum);
		}
}
