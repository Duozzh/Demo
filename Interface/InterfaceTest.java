package Interface;

public class InterfaceTest {
	public static void main(String[] args) {
		Test test = new Test();
		test.output();
		test.output2();
		test.output3();
		
	}
}
interface MyInterface{
	public void output();
}
interface MyInterface2{
	public void output2();
}
class MyParent{
	public void output3() {
		System.out.println("output3");
	}
}
class Test extends MyParent implements MyInterface,MyInterface2{
	public void output() {
		System.out.println("output");
	}	
	public void output2() {
		System.out.println("output2");
	}
}