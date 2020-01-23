import java.util.Scanner;
class Rest
{
	int n;
       Rest(int n)
   {
     this.n=n;
     }
     int m1()
     {
		  int a,d=0,f;
		         a=n;
		         while(a>0)
		         {
		         f=a%10;
		         d=f*f*f+d;
		         a=a/10;
			 }
			 return(d);
		 }
    public static void main(String args[])
    {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter n value :");
		 in.n=scan.nextInt();
		 Rest in=new Rest(n);
		     int d;
		 d=in.m1();
        System.out.println("Armstrong number :"+d);
        }
        }
