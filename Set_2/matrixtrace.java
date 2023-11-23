import java.util.*;

class matrixtrace
{
	public static void main(String args[])
		{
			int n,i,j,sum=0;
			Scanner input=new Scanner(System.in);			
			System.out.print("Enter the order number: ");
			n=input.nextInt();
			int a[][]=new int[n][n];
			for(i=0;i<n;i++)
				{
					for(j=0;j<n;j++)
						{
							System.out.print("Enter elements ["+(i+1)+"]"+"["+(j+1)+"]: ");
							a[i][j]=input.nextInt();
						}
				}
			for(i=0;i<n;i++)
				{
					for(j=0;j<n;j++)
						{
							if(i==j)
								{
									sum+=a[i][j];
								}
						}
				}
			System.out.println("Trace of the elements= "+sum);			
		}
}
