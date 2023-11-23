import java.util.*;

class matrixlarge
{
	public static void main(String args[])
		{
			int n,i,j,l;
			Scanner input=new Scanner(System.in);			
			System.out.print("Enter the order number: ");
			n=input.nextInt();
			int a[][]=new int[n][n];
			for(i=0;i<n;i++)
				{
					for(j=0;j<n;j++)
						{
							System.out.print("Enter elements ["+i+"]"+"["+j+"]: ");
							a[i][j]=input.nextInt();
						}
				}
			l=a[0][0];
			for(i=0;i<n;i++)
				{
					for(j=0;j<n;j++)
						{
							if(a[i][j]>l)
								{
									l=a[i][j];
								}
						}
				}
			System.out.println("larrgest of the elements= "+l);			
		}
}
