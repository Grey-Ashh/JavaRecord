import java.util.*;

class arraysecondlarge
{
	public static void main(String args[])
		{
			int n,i,j,large,temp;
			Scanner input=new Scanner(System.in);			
			System.out.print("Enter the number of elements: ");
			n=input.nextInt();
			int a[]=new int[n];
			for(i=0;i<n;i++)
				{
					System.out.print("Enter elements "+(i+1)+":");
					a[i]=input.nextInt();
				}
			large=a[0];
			for(i=0;i<=1;i++)
				{
					large=a[0];
					for(j=0;j<n-i;j++)
						{
							if(a[i]>large)
								{
									large=a[i];
									a[i]=a[n-i-1];
								}						
						}
				}
				
			System.out.println("Second largest of the elements= "+large);			
		}
}
