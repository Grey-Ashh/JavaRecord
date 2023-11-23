import java.util.*;

class matrixmultiply
{
	public static void main(String args[])
		{
			int r1,c1,r2,c2,i,j,k;
			Scanner input=new Scanner(System.in);			
			System.out.print("Enter number of rows for Matrix 1: ");
			r1=input.nextInt();
			System.out.print("Enter number of coloumn for Matrix 1: ");
			c1=input.nextInt();
			System.out.print("Enter number of rows for Matrix 2: ");
			r2=input.nextInt();
			System.out.print("Enter number of coloumn for Matrix 2: ");
			c2=input.nextInt();
			int a[][]=new int[r1][c1];
			int b[][]=new int[r2][c2];
			int mul[][]=new int[r1][c2];
			if(c2==r1)
			{
				System.out.println("For Matrix 1");
				for(i=0;i<r1;i++)
					{
						for(j=0;j<c1;j++)
							{
								System.out.print("Enter elements ["+(i+1)+"]"+"["+(j+1)+"]: ");
									a[i][j]=input.nextInt();
							}
					}
				System.out.println("For Matrix 2");
				for(i=0;i<r2;i++)
					{
						for(j=0;j<c2;j++)
							{
								System.out.print("Enter elements ["+(i+1)+"]"+"["+(j+1)+"]: ");
									b[i][j]=input.nextInt();
							}
					}
				for(i=0;i<r1;i++)
					{
						for(j=0;j<c2;j++)
							{
									mul[i][j]=0;
							}
					}			
				for(i=0;i<r1;i++)
					{
						for(j=0;j<c2;j++)
							{
								for(k=0;k<r2;k++)
									{
										mul[i][j]+=(a[i][k]*b[k][j]);
									}
							}
					}
			System.out.println("Product Matrix ");
			for(i=0;i<r1;i++)
				{
					for(j=0;j<c2;j++)
						{
								System.out.print(mul[i][j]+" ");
						}
					System.out.println();
				}
			}			
			else
				System.out.println("Wrong Input.");			
		}
}
