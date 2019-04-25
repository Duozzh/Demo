package Collection;

public class Person 
{
	public static void main(String[] args) 
	{
		A a = new A();
		a.change(a);
		int age = a.age;
		System.out.println(age);
	}
}
class A
{
	int age = 20;
	public void change(A a)
	{
		a = new A();
		a.age = 30;
	}
}



