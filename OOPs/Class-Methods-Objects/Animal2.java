class Animal2
{
	int age = 10;
	String color = "black";
	
	void eat()
	{
		System.out.println("I am eating");
	}

	void run()
	{
		System.out.println("I am running");
	}

	public static void main(String args[])
	{
		Animal2 obj1 = new Animal2();
		obj1.eat();
		obj1.run();
	
		Animal2 obj2 = new Animal2();
		obj2.eat();
		obj2.run();
	}
}