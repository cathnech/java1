package gb.lesson5;
//import java.util.AbstractCollection;
public class lesFive
{
	static Employee[] employees = new Employee[5];

	public static void main(String[] args)
	{
		employees[0] = new Employee("Щербаков Иосиф Валентинович", "Садовник", "cherb@gmail.com", "+79846693658", 35100, 45);
		employees[1] = new Employee("Трофимов Дмитрий Натанович", "Бухгалтер", "troff@gmail.com", "+79738947453", 67000, 24);
		employees[2] = new Employee("Волков Мирослав Пётрович", "Сисадмин", "volkov@gmail.com", "+7937435834", 45000, 32);
		employees[3] = new Employee("Евсеев Виталий Пётрович", "Инженер", "evceev@gmail.com", "+7946345634", 70000, 53);
		employees[4] = new Employee("Логинов Флор Сергеевич", "Программист", "loginoff@gmail.com", "+7945346364", 140000, 42);
		ageRange(41);
	}

	public static void ageRange(int age)
	{
		for (int i = 0; i < employees.length; i++)
		{
			if (employees[i].getAge() > age) employees[i].empInfo();
		}
	}
}

