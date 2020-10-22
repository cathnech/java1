package gb.lesson6;

public class Animal
{
	protected String typeAnimal;
	protected String name;
	protected float runDist;
	protected float swimDist;
	protected float jumpHeigh;

	public void info() {

		if (swimDist == 0)
			System.out.println(typeAnimal + " " + name + "\nмаксимальная дистанция бега " + runDist + "м,\nвысота прыжков " + jumpHeigh + "м\n");

		else
			System.out.println(typeAnimal + " " + name + "\nмаксимальная дистанция бега " + runDist + "м,\nвысота прыжков " + jumpHeigh + "м,\nплавает на " + swimDist + "м\n");

	}
	public void run(float distance)
	{
		if (distance > 0 && distance <= runDist)
		{
			System.out.println(name + " может пробежать " + distance + "м");
		}
		else System.out.println(name + " не может пробежать " + distance + "м");

	}

	public void swim(float distance)
	{
		if (distance > 0 && distance <= swimDist)
		{
			System.out.println(name + " может проплыть " + distance + "м");
		}
		else System.out.println(name + " не может проплыть " + distance + "м");
	}

	public void jump(float high)
	{
		if (high > 0 && high <= jumpHeigh)
		{
			System.out.println(name + " может прыгнуть " + high + "м");
		}
		else System.out.println(name + " не может прыгнуть " + high + "м");
	}
}



