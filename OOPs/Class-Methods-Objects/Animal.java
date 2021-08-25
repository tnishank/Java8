class Animal
{
	int age = 10;
	String color = "black";
	
	void eat()
	{
		System.out.println("I am eating");
	}

	public static void main(String args[])
	{
		Animal a = new Animal();
		a.eat();
		System.out.println(a.age);
		System.out.println(a.color);
	}
}