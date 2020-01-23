class A extends Thread
{
	public void run()
{
for(int i=1;i<=5;i++)
{
System.out.println(i);
try
{
	sleep(1000);
}
catch(Exception e)
{
}
}
}
}
class B extends Thread
{
public void run()
{
for(int i=1;i<=5;i++)
{
System.out.println(i);
try
{
	sleep(1000);
}
catch(Exception e)
{
}
}
}
}
class Threadext
{
public static void main(String args[])
{
A t1=new A();
B t2=new B();
t1.start();
t2.start();
}
}
