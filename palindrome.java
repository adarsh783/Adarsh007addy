import java.util.Scanner;
class palindrome
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int num,c=0,d,fact;
System.out.println("Enter number :");
num=in.nextInt();
d=num;
while(num>0)
{
fact=num%10;
c=c*10+fact;
num=num/10;
}
if(c==d)
{
System.out.println("number is palindrome :"+d);
}
else
{
System.out.println("not palindrome :"+d);
}
}
}