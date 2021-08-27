class A
{
	void show1()
	{
		System.out.println("I am in show1 method");
	}
}

class B extends A
{
	void show2()
	{
		System.out.println("I am in show2 method");
	}
}

class C extends A
{
	void show3()
	{
		System.out.println("I am in show3 method");
	}
}

class HierarchicalInheritance
{
	public static void main(String []args)
	{
		A obj1 = new A();
		obj1.show1();

		B obj2 = new B();
		obj2.show1();
		obj2.show2();

		C obj3 = new C();
		obj3.show1();
		obj3.show3();
	}
}