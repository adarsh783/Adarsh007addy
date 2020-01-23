class War
{
public static void main(String args[])
{
int n=32,c,d=0;
while(n>0)
{
c=n%10;
d=d*10+c;
n=n/10;
}
System.out.println("reverse number is "+d);
}
}