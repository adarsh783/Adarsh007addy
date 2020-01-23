import java.util.Scanner;
class reversenumber
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int num,c,d=0,fact;
System.out.println("Enter number :");
num=in.nextInt();
c=num;
while(num>0)
{
fact=num%10;
d=d+(fact*fact*fact);
num=num/10;
}
if(d==c)
{
System.out.println("armstrong number :"+d);
}
else
{
System.out.println("not armstrong number :"+c);
}
}
}
