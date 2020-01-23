class Reference
{
	int n;
	void m1(int &n)
	{
	  n++;
	  }
  public static void main(String args[])
  {
  int n=4;
    Reference in=new Reference();
   in.m1(n);
    System.out.println(n);
    }
    }

