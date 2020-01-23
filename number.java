import java.util.Scanner;
class number
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
long n,mi,km,cm,m;
System.out.println("Enter number:");
n=input.nextLong();
mi=n/160000;
n=n%160000;
km=n/100000;
n=n%100000;
cm=n/100;
cm=n%100;
m=n/100;
m=n%100;
System.out.println("Miles : "+mi);
System.out.println("km : "+km);
System.out.println("cm : "+cm);
System.out.println("m : "+m);
}
}
