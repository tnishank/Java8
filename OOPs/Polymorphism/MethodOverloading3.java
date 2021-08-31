class Test
{
	//String and StringBuilder are on same level therefore promote concept doesn't work here.
	//Compiler will get confuse and will throw ambigous error.

	void m1(String a)
	{
		System.out.println("1: ");
	}

	void m1(StringBuilder a)
	{
		System.out.println("2: ");
	}
}

class MethodOverloading3
{
	public static void main(String [] args)
	{
		Test t = new Test();
		t.m1(null);
		
	}
}