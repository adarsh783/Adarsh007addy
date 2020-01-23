import java.util.Scanner;
class trapezoidal
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
int x,y,volume;
float l,b;
System.out.println("Enter l,b,x,y value");
l=scan.nextFloat();
b=scan.nextFloat();
x=scan.nextInt();
y=scan.nextInt();
volume=(1/2*(l+b)*(x-y));
System.out.println("volume is equal to : "+volume);
}
}


