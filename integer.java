import java.util.Scanner;
class integer
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
long n,mi,km,m,cm;
System.out.println("Enter positive integer ");
n=scan.nextLong();
mi=n/160000;
n=n%160000;
km=n/160000;
n=n%160000;
m=n/100;
cm=n%100;
System.out.println("miles : "+mi);
System.out.println("km : "+km);
System.out.println("m : "+m);
System.out.println("cm : "+cm);
}
}