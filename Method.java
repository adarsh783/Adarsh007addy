import java.util.Scanner;
class Method
{
   int a,b,c,f;
 public int m1(int d,int e)
  {
    a=d;
    b=e;
    c=a+b;
    return(c);
       }
       int m2(int d,int e)
       {
		   a=d;
		   b=e;
		   f=d-e;
		   return(f);
	   }
		   public static void main(String args[])
      {
		  int c,f,g,h;
		  Scanner scan=new Scanner(System.in);
		  System.out.println("Enter g,h value :");
		  g=scan.nextInt();
		  h=scan.nextInt();
      Method in=new Method();
      c=in.m1(g,h);
      f=in.m2(g,h);
	System.out.println("Addition is :"+c);
	System.out.println("Addition is :"+f);
	}
      }