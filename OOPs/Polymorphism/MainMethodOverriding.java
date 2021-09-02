/*
 Main method can not be overriden therefore it will print out put of show method of class A
*/



class A
{
	public static void main(String [] args)
	{
		System.out.println("1");
		
	}
}

class B extends A
{
	public static void main(String [] args)
	{
		System.out.println("2");
	}
}

class MainMethodOverriding
{
	public static void main(String []args)
	{
		String [] arguments= {"a", "b", "c"};
		A obj = new B();
		obj.main(arguments);
	}
}

