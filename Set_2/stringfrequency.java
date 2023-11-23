import java.util.*;

class stringfrequency
{
	public static void main(String args[])
		{
			int i,j,l,flag=0;
			char ch;
			Scanner input=new Scanner(System.in);	
			System.out.print("Enter the String: ");
			String s1=input.next();
			l=s1.length();
			System.out.print("Enter the character to be searched: ");
			ch=input.next().charAt(0);
			for(i=0;i<l;i++)
				{
					if(ch==s1.charAt(i))
						{flag++;}
				}
			if(flag==0)
				System.out.println("Entered the character not present.");
			else
				System.out.println("Entered the character frequency="+flag);
		}

}
