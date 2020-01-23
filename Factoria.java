import java.util.Scanner;
class Fac
{
  private int a,n,f=1;
  void setm1(int t)
  {
    n=t;
    for(a=1;a<=n;a++)
    {
    f=f*a;
    }
}
int getm2()
    {
       return(f);
       }
   }
       class Factoria
       {
       public static void main(String args[])
       {
       int g;
       System.out.println("Enter g value :");
       Scanner scan=new Scanner(System.in);
       g=scan.nextInt();
       Fac in=new Fac();
       in.setm1(g);
       System.out.println(in.getm2());
       }
       }