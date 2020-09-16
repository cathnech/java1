package gb.lesson6;
import java.util.Random;
public class Cat extends Animal
{
	private static Random rand = new Random();
	public Cat(String name)
	{
	this.typeAnimal = "Cat";
	this.name       = name;
	this.runDist    = (float)(rand.nextInt(2000) + 1000) /10;
		this.jumpHeigh  = (float)(rand.nextInt(40) + 1) / 10;
	this.swimDist   = 0;
	}
}
