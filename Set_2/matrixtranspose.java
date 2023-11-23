import java.util.*;

class matrixtranspose
{
	public static void main(String args[])
		{
			int r,c,i,j;
			Scanner input=new Scanner(System.in);			
			System.out.print("Enter number of rows for Matrix: ");
			r=input.nextInt();
			System.out.print("Enter number of coloumn for Matrix: ");
			c=input.nextInt();
			int a[][]=new int[r][c];
			int b[][]=new int[r][c];
			System.out.println("Enter Matrix elements,");
			for(i=0;i<r;i++)
				{
					for(j=0;j<c;j++)
						{
							System.out.print("Enter elements ["+(i+1)+"]"+"["+(j+1)+"]: ");
							a[i][j]=input.nextInt();
						}
				}
			for(i=0;i<r;i++)
				{
					for(j=0;j<c;j++)
						{
									b[i][j]=a[j][i];
						}
				}
			System.out.println("Transpose Matrix,");
				for(i=0;i<r;i++)
					{
						for(j=0;j<c;j++)
							{
								System.out.print(b[i][j]+" ");
							}
						System.out.println();
					}			
		}
}
