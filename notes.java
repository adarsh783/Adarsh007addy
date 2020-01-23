import java.util.*;
class notes
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t;
t=sc.nextInt();
while(t!=0)
{
t--;
int x,y,k;
x=sc.nextInt();
y=sc.nextInt();
k=sc.nextInt();
if((x+y)%k==0)
{
System.out.println("Chef");
}
else
{
System.out.println("Paja");
}
}
}
}