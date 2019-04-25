package Collection;

public class Test2 {
	int age = 20;
	public static void main(String[] args)
	{
		Test2 test = new Test2();
		int age = test.age;
		System.out.println(age);
		test.change(test);
		int age2 = test.age;
		System.out.println(age2);
		
		
	}
	public void change(Test2 test)
	{
		test.age = 30;
	}

}
