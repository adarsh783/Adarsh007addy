class Tet
{
	int m1(int n)
	{
		int a=0,f=0;
		while(n>0)
		{
		f=n%10;
		a=a+f*f*f;
		n=n/10;
	}
	return(a);
}
	public static void main(String args[])
	{
		Tet in=new Tet();
		int i=1,t=0,n=500;
		while(i<=n)
		{
			t=in.m1(i);
			if(t==i)
			System.out.println(i);
			i++;
		}
	}
}