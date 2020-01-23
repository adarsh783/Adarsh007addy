class sem
{
	int m1()
	{
		int c=1;
		for(int i=1;i<=n;i++)
		{
		c=c*i;
	}
	return(c);
}
public static void main(String args[])
{
int i=1,n=100,a=0;
Sem in=new Sem();
while(i<=n)
{
	a=in.m1(i);
	if(a<=100)
		System.out.println(+i);
		else
		break;
		i++;
}
}
}
