import java.util.*;

class arrayreplace
{
	public static void main(String args[])
		{
			int n,i,x,temp;
			Scanner input=new Scanner(System.in);			
			System.out.print("Enter the number of elements: ");
			n=input.nextInt();
			int a[]=new int[n];
			for(i=0;i<n;i++)
				{
					System.out.print("Enter elements "+(i+1)+":");
					a[i]=input.nextInt();
				}
			System.out.print("Enter the element to be replaced: ");
			x=input.nextInt();
			System.out.print("Enter the element to be replaced with: ");
			temp=input.nextInt();
			for(i=0;i<n;i++)
				{
					if(a[i]==x)
						{
							a[i]=temp;
						}
				}
			System.out.println("New array,");
			for(i=0;i<n;i++)
				{
					System.out.print(a[i]+" ");
				}
			System.out.println();		
		}
}
