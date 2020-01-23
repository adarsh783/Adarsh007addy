class Static
{
	int empid;
	String name;
	static String company="sp";
	Static(int empid,String name)
	{
		this.empid=empid;
		this.name=name;
}
	void display()
	{
		System.out.println(empid+" "+name+" "+company);
	}
			public static void main(String args[])
			{
				Static in=new Static(101,"amit");
		in.display();
		Static im=new Static(102,"sumit");
		im.display();
			}
			}