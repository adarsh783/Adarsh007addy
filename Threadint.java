class A implements Runnable
{
	synchronized public void run()
{
for(int i=1;i<=5;i++)
{
System.out.println(i);
try
{
	Thread.sleep(1000);
}
catch(Exception e)
{
}
}
}
}
class B implements Runnable
{
	public void run()
{
for(int i=1;i<=5;i++)
{
System.out.println(i);
}
}
}
class Threadint
{
public static void main(String args[])
{
Thread t1=new Thread(new A());
Thread t2=new Thread(new B());
t1.start();
try
{
	t1.join();
	t1.sleep(1000);
}
catch(Exception e)
{
}

t2.start();
}
}