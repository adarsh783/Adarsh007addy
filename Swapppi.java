import java.util.Scanner;
class A
{
	int n;
    void m1(int g)
    {
    n=g;
    }
    }
    class B extends A
    {
    		 int m2()
		    {
		    	int a,f=1;
		    	for(a=1;a<=n;a++)
		    	{
					f=f*a;
					}
					return(f);
    }
	}
    class Swapppi
    {
    public static void main(String args[])
    {
			int g,f;
		System.out.println("Enter g value :");
		Scanner scan=new Scanner(System.in);
		g=scan.nextInt();
    B in=new B();
    in.m1(g);
    f=in.m2();
    System.out.println("factorial is :"+f);
    }
    }
