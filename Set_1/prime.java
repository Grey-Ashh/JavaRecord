import java.util.*;

class prime
{	
	public static void main(String args[])
		{
			int num,i,flag=1;
			Scanner input=new Scanner(System.in);
			System.out.print("Enter the number: ");
			num=input.nextInt();
			for(i=2;i<num/2;i++)
				{
					if(num%i==0)
						{
							flag=0;	
							break;					
						}
				}
			if(flag==1)
				System.out.println("The entered number is prime.");
			else
				System.out.println("The entered number is composite.");
		}
}
