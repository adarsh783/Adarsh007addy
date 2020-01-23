import java.util.Scanner;
class reverse
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int num,reverseInteger=0,originalInteger=0,fact;
System.out.println("Enter number :");
num=in.nextInt();
originalInteger=num;
while(num>0)
{
fact=num%10;
reverseInteger=reverseInteger*10+fact;
num=num/10;
}
System.out.printf("reverse number :"+reverseInteger);
}
}
