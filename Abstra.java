abstract class Tes
{
	abstract void m1();
	}
		class New extends Tes
		{
			void m1()
			{
				System.out.println("bike is created ");
				}
				}
					class Res extends New
						{
						void m1()
					{
						super.m1();
						System.out.println("running safely");
						System.out.println("gear changed");
						}
						}
						class Abstra
						{
				public static void main(String args[])
					{
					Res in=new Res();
					in.m1();
					}
					}