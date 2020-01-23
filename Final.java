final class Fill
{
	void m1();
	{
	int a=10;
	System.out.println(+a);
	}
	}
		class Final extends Fill
		{
			void m1()
			{
			System.out.println(2);
			}
			public static void main(String args[])
			{
			Final in=new Final();
			in.Final();
			}
			}