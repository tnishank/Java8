/*
ERROR: Static method can not be overriden

NOTE: private methods cannot be overriden
*/



class A
{
	static void show()
	{
		System.out.println("1");
		
	}
}

class B extends A
{
	public void show()
	{
		System.out.println("2");
	}
}

class MethodOverriding6
{
	public static void main(String []args)
	{
		A obj = new B();
		obj.show();
	}
}

