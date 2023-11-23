import java.util.*;

class employee
{	
	String Name;
	int Age;
	int Ph_no;
	int Salary;
	String Address;
	Scanner input=new Scanner(System.in);
	employee(String name,int age,int ph_no,int salary,String address)
		{
			Name=name;
			Age=age;
			Ph_no=ph_no;
			Salary=salary;
			Address=address;
		}
	void printsalary()
		{
			System.out.println("Salary : "+Salary);
		}
	void display()
		{	
			System.out.println();
			System.out.println("Name : "+Name);
			System.out.println("Age : "+Age);
			System.out.println("Phone : "+Ph_no);
			System.out.println("Salary : "+Salary);
			System.out.println("Address : "+Address);
		}

}

class officer extends employee
{
	String Sp;
	officer(String name,int age,int ph_no,int salary,String address,String sp)
		{	
			super(name,age,ph_no,salary,address);
			Sp=sp;
		}
	void display()
		{	
			System.out.println();
			super.display();
			System.out.println("Specialisation : "+Sp);		
		}
}

class manager extends employee
{
	String Department;
	manager(String name,int age,int ph_no,int salary,String address,String department)
		{	
			super(name,age,ph_no,salary,address);
			Department=department;
		}
	void display()
		{
			System.out.println();
			super.display();
			System.out.println("Department : "+Department);		
		}
}

class organisation
{
	public static void main(String args[])
	{
		String Name;
		int Age;
		int Ph_no;
		int Salary;
		String Address;
		int n,x,y;
		String Sp;
		String Department;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter no of Employee : ");
		n=input.nextInt();
		employee e[]=new employee[n];
		System.out.print("Enter no of Manager : ");
		x=input.nextInt();
		manager m[]=new manager[x];	
		System.out.print("Enter no of Officer : ");
		y=input.nextInt();
		officer o[]=new officer[y];
		if (n>0)
		{
			for (int i=0;i<n;i++)
			{	
				System.out.println("Employee Details");
				System.out.print("Enter name : ");
				Name=input.next();
				System.out.print("Enter Age : ");
				Age=input.nextInt();
				System.out.print("Enter phone : ");
				Ph_no=input.nextInt();
				System.out.print("Enter Salary : ");
				Salary=input.nextInt();
				System.out.print("Enter Address : ");
				Address=input.next();			
				e[i]=new employee(Name,Age,Ph_no,Salary,Address);
			}			
		}
		if (y>0)
		{
			for (int i=0;i<y;i++)
			{	
				System.out.println("Officer Details");
				System.out.print("Enter name : ");
				Name=input.next();
				System.out.print("Enter Age : ");
				Age=input.nextInt();
				System.out.print("Enter phone : ");
				Ph_no=input.nextInt();
				System.out.print("Enter Salary : ");
				Salary=input.nextInt();
				System.out.print("Enter Address : ");
				Address=input.next();	
				System.out.print("Enter Specialisation : ");
				Sp=input.next();		
				o[i]=new officer(Name,Age,Ph_no,Salary,Address,Sp);
			}
		}		
		if (x>0)
		{
			for (int i=0;i<x;i++)
			{
				System.out.println("Manager Details");
				System.out.print("Enter name : ");
				Name=input.next();
				System.out.print("Enter Age : ");
				Age=input.nextInt();
				System.out.print("Enter phone : ");
				Ph_no=input.nextInt();
				System.out.print("Enter Salary : ");
				Salary=input.nextInt();
				System.out.print("Enter Address : ");
				Address=input.next();	
				System.out.print("Enter Department : ");
				Department=input.next();		
				m[i]=new manager(Name,Age,Ph_no,Salary,Address,Department);
			}
		}
		for (int i=0;i<y;i++)
				o[i].display();
		for (int i=0;i<x;i++)
				m[i].display();
		for (int i=0;i<n;i++)
				e[i].display();		
	}
}
