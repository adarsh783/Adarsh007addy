import java.util.Scanner;
class simpleInterest
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
int t;
double p,r,si;
System.out.println("Enter p,r,t value");
p=scan.nextDouble();
r=scan.nextDouble();
t=scan.nextInt();
si=((p*r*t)/100);
System.out.println("The simple interest is :"+si);
}
}

