import java.util.*;

class arraysum
{
	public static void main(String args[])
		{
			int n,i,sum=0;
			Scanner input=new Scanner(System.in);			
			System.out.print("Enter the number of elements: ");
			n=input.nextInt();
			int a[]=new int[n];
			for(i=0;i<n;i++)
				{
					System.out.print("Enter elements "+(i+1)+":");
					a[i]=input.nextInt();
				}
			for(i=0;i<n;i++)
				sum=sum+a[i];
			System.out.println("Sum of the elements= "+sum);			
		}
}
