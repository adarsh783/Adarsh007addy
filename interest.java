import java.util.Scanner;
class interest
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
double p,r,ci;
int t;
System.out.println("Enter p,t,r values:");
p=input.nextDouble();
r=input.nextDouble();
t=input.nextInt();
ci=Math.pow(p*(1+r/100),t);
System.out.println("compund interest value is: "+ci);
}
}
