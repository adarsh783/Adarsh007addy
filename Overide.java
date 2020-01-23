import java.util.Scanner;
class Name
{
	int n;
	void m1(int g)
	{
		n=g;
	}
}
		class Overide extends Name
		{
	void m1(int g)
	{
		super.m1(g);
		int a,f=1;
		for(a=1;a<=n;a++)
		{
		f=f*a;
	}
	System.out.println("factorial is :"+f);
	}
	public static void main(String args[])
	{
		int s,f;
		System.out.println("Enter s value :");
		Scanner scan=new Scanner(System.in);
		s=scan.nextInt();
	Overide is=new Overide();
	is.m1(s);
	}
	}