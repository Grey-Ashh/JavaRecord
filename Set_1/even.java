import java.util.*;

class even
{	
	public static void main(String args[])
		{
			int num;
			Scanner input=new Scanner(System.in);
			System.out.print("Enter the number: ");
			num=input.nextInt();
			if(num%2==0)
				System.out.println("The entered number is even.");
			else
				System.out.println("The entered number is odd.");
		}
}
