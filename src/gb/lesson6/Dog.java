package gb.lesson6;
import java.util.Random;
public class Dog extends Animal
{
	private static Random rand = new Random();
	public Dog(String name)
	{
		this.typeAnimal = "Собака";
		this.name       = name;
		this.runDist    = (float)(rand.nextInt(2000) + 4000) /10;
		this.swimDist   = (float)(rand.nextInt(40) + 10) ;
		this.jumpHeigh  = (float)(rand.nextInt(20) + 1) / 10;

	}
}
