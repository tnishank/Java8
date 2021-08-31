class Test
{
	String sum(String s1, String s2)
	{
		System.out.println("sum1");
		return s1 + s2;
	}
	float sum(int a, float b)
	{
		System.out.println("sum2");
		return (float) a + b;
	}
	float sum(float a, int b)
	{
		System.out.println("sum3");
		return a + (float) b;
	}
	float sum(float a, float b)
	{
		System.out.println("sum4");
		return a + b;
	}
}
class MethodOverloading1
{
	public static void main(String []args)
	{
		Test testObj = new Test();
		System.out.println(testObj.sum("hello ", "world"));
		
		System.out.println(testObj.sum(12, 12.0f));
		System.out.println(testObj.sum(13.2f, 13));
		System.out.println(testObj.sum(14.0f, 14.24f));
	}
}