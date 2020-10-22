package gb.lesson6;

public class lesSix
{
	public static void  main(String[] args)
	{
		Cat cat1 = new Cat("Леопольд");
		Cat cat2 = new Cat("Барсик");
		Dog dog1 = new Dog("Рекс");
		Dog dog2 = new Dog("Шарик");

		cat1.info();
		cat2.info();
		dog1.info();
		dog2.info();


		//test
		int x = 500, y = 20;
		float z = 1.5f;
		dog1.run(x);
		dog2.run(x);
		cat1.run(x);
		cat2.run(x);
		dog1.swim(y);
		dog2.swim(y);
		cat1.swim(y);
		cat2.swim(y);
		dog1.jump(z);
		dog2.jump(z);
		cat1.jump(z);
		cat2.jump(z);


	}
}






