import java.util.*;
class Employee
{
    void display()
    {
        System.out.println("The name of the class is Employee");
    }
    void calcsalary(int sal)
    {
        System.out.println("Salary of employee is "+sal+".");
    }
}
class engineer extends Employee
{
    void sal_En()
    {
        super.calcsalary(100000);
    }
    void sal_Em()
    {
        super.calcsalary(200000);
    }
}
class organisationsal
{
    public static void main(String args[])
    {
        engineer e=new engineer();
        e.sal_En();
        e.sal_Em();
        e.display();
    }
}
