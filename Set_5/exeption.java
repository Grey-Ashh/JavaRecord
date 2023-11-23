import java.util.*;
class op
{
    int x,y,res;
    int a[]={1,2,3,4,5};
    op(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    void test1()
    {
        try
        {
            res=(x+y)/(x-y);
        }catch(ArithmeticException e){System.out.println(e);}  
    }
    void test2()
    {
        try
        {
            System.out.print(a[5]);
        }catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}  
    }
}
class  exeption
{
public static void main (String[] args) 
    {
        int a,b;
        a=1;b=1;
        op o=new op(a,b);
        o.test1();
        o.test2();
    }
}
