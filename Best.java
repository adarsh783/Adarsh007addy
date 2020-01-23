class Best
{
	int a;
	Best()
	{
		System.out.println("kuch bhi");
	}
	Best(int a)
	{
		this.a=a;
	}
 public static void main(String args[])
 {
 Best t=new Best(20);
 Best d=new Best();
 System.out.println("Addition is  :"+t.a);
 }
 }
