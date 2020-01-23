class Animal
{
int a;
public static void main(String args[])
{
Animal in=new Animal();
in.a=155;
int d=0,c,f=0;
c=in.a;
while(c>0)
{
	f=c%10;
	d=f*f*f+d;
	c=c/10;
}
	System.out.println("Armstrong number :"+d);
}
}

