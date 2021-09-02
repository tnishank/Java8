/*
Overriding method should have equal or greater Access Modifier.
default < protected < public

NOTE: private methods cannot be overriden
*/



class A
{
	void show()
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

class MethodOverriding5
{
	public static void main(String []args)
	{
		A obj = new B();
		obj.show();
	}
}

