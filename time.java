import java.util.Scanner;
class time
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
double n,hours,minutes,seconds;
System.out.println("Enter double value :");
n=scan.nextDouble();
hours=n/3600;
minutes=n/60;
seconds=n/60;
System.out.println("hours : "+hours);
System.out.println("minutes : "+minutes);
System.out.println("seconds : "+seconds);
System.out.printf("%02f:%02f:%02f\n",hours,minutes,seconds);
}
}