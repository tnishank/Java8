class Bird
{
	public void fly()
	{
		System.out.println("I am flying");
	}

	
}

class Animall
{
	int a=10;
	
	public void run()
	{
		System.out.println("I am running");
	}

	public void eat()
	{
		System.out.println("I am eating");
	}
	
	public static void main(String args[])
	{
		
		Animall a = new Animall();
		a.run();
		a.eat();


		Bird b = new Bird();
		b.fly();
	}

	
}