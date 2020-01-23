import java.util.Scanner;
class farenheit
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
double f,c;
System.out.println("Enter value of c");
c=scan.nextDouble();
f=(9/5*c+32);
System.out.println("The farenheit is :"+f);
}
}
