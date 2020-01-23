import java.util.Scanner;
class A
{
     int a,b;
    void m1(int e,int f)
    {
    	a=e;
    	b=f;
    	System.out.println("factorial is :"+a+ " "+b);
    }
    }
    		class B extends A
    		{
				void m2()
				{
				int f;
				    f=a;
				    a=b;
				    b=f;
					System.out.println("factorial is :"+a+ " "+b);
					}
			}

    class Additi
    {
    public static void main(String args[])
    {
    	int g,f;
         System.out.println("Enter g,f value ");
         Scanner scan=new Scanner(System.in);
         g=scan.nextInt();
         f=scan.nextInt();
    B in=new B();
    in.m1(g,f);
   in.m2();
    }
    }