class Finaly{
public static void main(String args[])
{
	Demo d=new Demo();
	try
	{
	 System.out.println("opening database from main()");
	 d.fun1();	
	}
	catch (Exception e)
	{
	 System.out.println("Exception found in main()");
	}
	System.out.println("closing data base from main()");
}
}
class Demo
{
	void fun1()
	{
		System.out.println("opening database from fun1()");
		try
		{
		 fun2();	
		}
		catch (Exception e)
		{
			System.out.println("Exception found in fun1()");
			System.out.println("clossing database from fun1()");
			throw e;
		}
	}
	void fun2()
	{
		System.out.println("openning database from fun2()");
		try
		{
			int a=10,b=0,c;
			c=a/b;
			System.out.println(c);
		}
		catch (Exception e)
		{
			System.out.println("Exception found in fun2()");
			System.out.println("clossing database from fun2()");
			throw e;
		}
	}
}