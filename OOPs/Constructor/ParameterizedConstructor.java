class ParameterizedConstructor
{
	int i;
	String str;
	ParameterizedConstructor(int a, String b){
		i = a;
		str = b;
	}
	
	public static void main(String args[])
	{
		ParameterizedConstructor obj1 = new ParameterizedConstructor(120, "Nishank");
		System.out.println(obj1.i + " " + obj1.str);
	}
}