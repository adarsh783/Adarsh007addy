import java.util.Scanner;
class Random
{
	public int sum()
	{
		int a,b,c;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a,b :");
		a=in.nextInt();
		b=in.nextInt();
	     c=a+b;
	     return(c);
    }
  public static void main(String args[])
  	{
		int c,d;
  	Random in=new Random();
  	c=in.sum();
  	d=in.multi();
  	System.out.println("Addition is :"+c);
  	System.out.println("Multiplication :"+d);
  	}
  	    public int multi()
  	 {
		 int a,b,d;
		 Scanner in=new Scanner(System.in);
		 System.out.println("Enter a,b :");
		 a=in.nextInt();
		 b=in.nextInt();
		  d=a*b;
		  return(d);
	 }
 }