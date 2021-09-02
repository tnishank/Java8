/*
It works because of explicit type casting. Overriding is not applied here.
*/
class Parent
{
}

class Child extends Parent
{
}

class A
{
	Parent show()
	{
		System.out.println("1");
		return new Parent();
	}
}

class B extends A
{
	Child show()
	{
		System.out.println("2");
		return new Child();
		
	}
}

class MethodOverriding3
{
	public static void main(String []args)
	{
		B obj = (B) new A();
		obj.show();
	}
}

