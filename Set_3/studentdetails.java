import java.util.*;

class student
{
	Scanner input=new Scanner(System.in);
	String name;
	int roll;
	int mark[]=new int[5];

	void read()
		{
			System.out.print("Enter name : ");
			name=input.next();
			System.out.print("Enter Roll.no : ");
			roll=input.nextInt();
			for(int j=0;j<5;j++)
				{
					System.out.print("Enter mark of sub "+(j+1)+" : ");
					mark[j]=input.nextInt();
				}
		}
	void display()
		{
			System.out.println("Name : "+name);
			System.out.println("Roll.no :"+roll);
			for(int j=0;j<5;j++)
				{
					System.out.println("Mark of sub "+(j+1)+" : "+mark[j]);
				}
		}

}
class studentdetails
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		student s=new student();
		s.read();
		s.display();
	}
}
