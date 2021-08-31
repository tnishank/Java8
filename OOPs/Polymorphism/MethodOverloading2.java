class Test
{
	//return type does not count in signature. Therefore methods of same name, 
	//having same number of parameters of same datatype in same sequence but different return type 
	//will be considered as two same methods with same signature.

	void sum(int a, int b)
	{
		System.out.println("1: " + (a+b));
	}

	int sum(int a, int b)
	{
		System.out.println("2: " + (a+b));
		return 1;
	}
}

class MethodOverloading2
{
	public static void main(String [] args)
	{
		Test t = new Test();
		t.sum(2, 3);
		t.sum(2, 3);
	}
}