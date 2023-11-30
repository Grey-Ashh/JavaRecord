import java.util.*;

class arraysecondlarge
{
	public static void main(String args[])
		{
			int n,i,j,large,temp;
			Scanner input=new Scanner(System.in);			
			System.out.print("Enter the number of elements: ");
			n=input.nextInt();
			int a[]=new int[n];
			for(i=0;i<n;i++)
				{
					System.out.print("Enter elements "+(i+1)+":");
					a[i]=input.nextInt();
				}
			for (i=0; i<n;i++)   
     				{  
          			for (j=i+1;j<n;j++)   
            				{  
                				if(a[i]>a[j])   
                					{  
                    						temp=a[i];  
                    						a[i]=a[j];  
                   						a[j]=temp;  
                					}  
            				}  
        			}  
			large=a[n-2];
			System.out.println("Second largest of the elements= "+large);			
		}
}
