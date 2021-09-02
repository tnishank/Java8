
class A
{
	void show()
	{
		System.out.println("1");
		
	}
}

class B extends A
{
	protected  void show()
	{
		System.out.println("2");
	}
}

class MethodOverriding7
{
	public static void main(String []args)
	{
		A obj = new B();
		obj.show();
	}
}

