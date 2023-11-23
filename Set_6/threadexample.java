class odd extends Thread
{	
	public void run()
	{
		for(int i=3;i<100;i=i+2)
			System.out.print(i+"  ");
	}
}
class even extends Thread
{
		public void run()
	{
		for(int i=2;i<100;i=i+2)
			System.out.print(i+"  ");
	}
}
class threadexample
{
	public static void main(String args[])
		{
			new odd().start();
			new even().start();
		}
}
