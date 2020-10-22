package gb.lesson5;

public class Employee
{
	private String fio;
	private String position;
	private String email;
	private String phone;
	private int pay;
	private int age;

	public Employee(String _fio, String _position, String _email, String _phone, int _pay, int _age)
	{
		fio         = _fio;
		position    = _position;
		email       = _email;
		phone       = _phone;
		pay         = _pay;
		age         = _age;
	}

	public void empInfo()
	{
		System.out.println(fio + " " + position + " " + email + " " + phone + " " + pay + " " + age);
	}

	public String getEmail()
	{
		return email;
	}

	public String getFio()
	{
		return fio;
	}

	public String getPhone()
	{
		return phone;
	}

	public String getPosition()
	{
		return position;
	}

	public int getAge()
	{
		return age;
	}

	public int getPay()
	{
		return pay;
	}
}
