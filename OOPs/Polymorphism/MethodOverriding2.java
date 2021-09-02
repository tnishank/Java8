/*
It will thow error 
because return type of show method of B is trying to override show method of A 
but return type of earlier is downcasting to later one 
which is not possible in case of return type
*/

class Parent
{
}

class Child extends Parent
{
}

class A
{
	Child show()
	{
		System.out.println("1");
		return new Child();
	}
}

class B extends A
{
	Parent show()
	{
		System.out.println("2");
		return new Parent();
		
	}
}

class MethodOverriding
{
	public static void main(String []args)
	{
		A obj = new B();
		obj.show();
	}
}

