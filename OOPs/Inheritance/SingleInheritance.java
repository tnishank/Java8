class A
{
	void show()
	{
		System.out.println("I am at show function in A");
	}
}

class B extends A
{

}

class SingleInheritance
{
	public static void main(String []args)
	{
		B obj1 = new B();
		obj1.show();
	}
}