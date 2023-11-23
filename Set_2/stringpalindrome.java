import java.util.*;

class stringpalindrome
{
	public static void main(String args[])
		{
			int i,j,l;
			Scanner input=new Scanner(System.in);	
			System.out.print("Enter the String: ");
			String s1=input.next();
			String s2="";
			l=s1.length();
			for(i=l-1;i>=0;i--)
				{
					s2+=s1.charAt(i);
				}
			if(s1.equalsIgnoreCase(s2)==true)
				System.out.println("Entered String is palindrome.");
			else
				System.out.println("Entered String is not palindrome.");
		}
}
