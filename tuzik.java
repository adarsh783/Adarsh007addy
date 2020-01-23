import java.util.*;
class tuzik
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t;
t=sc.nextInt();
while(t!=0)
{
int n,k,temp,tempo;
n=0;
k=0;
temp=0;
tempo=0;
n=sc.nextInt();
k=sc.nextInt();
temp=n/k;
tempo=temp*k;
System.out.println(n-tempo);
t--;
}
}
}