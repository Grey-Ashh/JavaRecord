import java.util.*;

class employ
{	
	String Name;
	int No;
	int Ph_no;
	Scanner input=new Scanner(System.in);
	employ(String name,int no,int ph_no)
		{
			Name=name;
			No=no;
			Ph_no=ph_no;
		}
	void display()
		{
			System.out.println("Name : "+Name);
			System.out.println("Emp.no :"+No);
			System.out.println("Phone : "+Ph_no);
		}

}
class employdetail
{
	public static void main(String args[])
	{
		String Name;
		int No;
		int Ph_no;
		Scanner input=new Scanner(System.in);
		employ e[]=new employ[5];
		for (int i=0;i<5;i++)
		{
			System.out.print("Enter name : ");
			Name=input.next();
			System.out.print("Enter Emp.no : ");
			No=input.nextInt();
			System.out.print("Enter phone : ");
			Ph_no=input.nextInt();
			e[i]=new employ(Name,No,Ph_no);
		}
		for (int i=0;i<5;i++)
		{
			e[i].display();
		}
	}
}
