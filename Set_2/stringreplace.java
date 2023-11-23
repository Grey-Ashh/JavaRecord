import java.util.*;

class stringreplace
{
	public static void main(String args[])
		{
			int i,j,l,flag=0;
			char ch,re;
			Scanner input=new Scanner(System.in);	
			System.out.print("Enter the String: ");
			String s1=input.next();
			l=s1.length();
			System.out.print("Enter the character to be replaced: ");
			ch=input.next().charAt(0);
			System.out.print("Enter the character to be replaced with: ");
			re=input.next().charAt(0);
			for(i=0;i<l;i++)
				{
					if(ch==s1.charAt(i))
						{s1=s1.replace(ch,re);}
				}
			System.out.println("New string:  "+s1);
		}
}
