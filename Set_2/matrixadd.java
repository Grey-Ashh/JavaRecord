import java.util.*;

class matrixadd
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
			int add[][]=new int[r][c];
			int count=0;
			while(count<2)
			{
				System.out.println("For Matrix "+(count+1));
				for(i=0;i<r;i++)
					{
						for(j=0;j<c;j++)
							{
								System.out.print("Enter elements ["+(i+1)+"]"+"["+(j+1)+"]: ");
								if(count==0)						
									a[i][j]=input.nextInt();
								if(count==1)						
									b[i][j]=input.nextInt();
							}
					}
				count++;
			}
			for(i=0;i<r;i++)
				{
					for(j=0;j<c;j++)
						{
									add[i][j]=a[i][j]+b[i][j];
						}
				}
			System.out.println("Added Matrix ,");
				for(i=0;i<r;i++)
					{
						for(j=0;j<c;j++)
							{
								System.out.print(add[i][j]+" ");
							}
						System.out.println();
					}			
		}
}
