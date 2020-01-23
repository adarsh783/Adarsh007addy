import java.util.Scanner;
class Fabonaccii
{
	int n;
	void m1(int &n)
	{
		int a=0,b=1,c,g,f=0;
	g=n;
	System.out.printf("%d%d",a,b);
	 for(c=0;c<=g;c++)
	  {
	    f=a+b;
	    System.out.printf("%d",f);
	    a=b;
	    b=f;
}
	System.out.println("fabonacci number :"+f);
	    }
  public static void main(String args[])
  {
  int n;
  Scanner scan=new Scanner(System.in);
  System.out.println("Enter n value :");
  n=scan.nextInt();
    Fabonaccii in=new Fabonaccii();
   in.m1(n);
    }
    }

