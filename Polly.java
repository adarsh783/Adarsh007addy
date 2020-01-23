class Polly
{
	void m1(int... n)
	{
	System.out.println("Add is");
	}
	void m1(String d)
	{
	System.out.println("2");
	}
	public static void main(String args[])
	{
	Polly d=new Polly();
	d.m1(10,20,30);
	}
	}