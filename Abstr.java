import java.util.Scanner;
interface I1
{
	 void m1(int a,int c);
	 static void show()
	 {
		  int d;
		 System.out.println(1);
	 }
}
class Res implements I1
{
	public void m1(int a,int c)
	{
		 int b,d,e;
		b=a;
		d=c;
		e=b+d;
		System.out.println(+e);
	}
}
class New
{
public static void main(String args[])
{
	int g,h;
	System.out.println("Enter g,h value ");
	Scanner scan=new Scanner(System.in);
	g=scan.nextInt();
	h=scan.nextInt();
	Res in=new Res();
	in.m1(g,h);
}
}