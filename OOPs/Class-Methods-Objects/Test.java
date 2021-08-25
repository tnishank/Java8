class Test
{
	int a=10;

	public static void main(String args[])
	{
		Test obj1 = new Test();
		Test obj2 = new Test();

		System.out.println(obj1.a);
		System.out.println(obj2.a);
		
		obj1.a = 20;

		System.out.println(obj1.a);
		System.out.println(obj2.a);
	}
}