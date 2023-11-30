class odd extends Thread
{	
	public void run()
	{
		for(int i=3;i<100;i=i+2)
			{
				System.out.print(i+"  ");
				try{
					Thread.sleep(500);
				}catch(Exception e){System.out.println(e);}
			}
	}
}
class even extends Thread
{
		public void run()
	{
		for(int i=2;i<100;i=i+2)
			{
				System.out.print(i+"  ");
				try{
					Thread.sleep(250);
				}catch(Exception e){System.out.println(e);}
			}
	}
}
class threadexample
{
	public static void main(String args[])
		{
			odd o=new odd();
			even e=new even();
			e.start();
			o.start();
		}
}
