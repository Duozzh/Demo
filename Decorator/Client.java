package Decorator;

public class Client {
	public static void main(String[] args) {
		/*
		//节点流
		Component component = new ConcreteComponent();
		//过滤器
		Component component2 = new ConcreteDecorator1(component);
		//过滤器
		Component component3 = new ConcreteDecorator2(component2);
		component3.doSomething();
		*/
		Component component = new ConcreteDecorator1(new ConcreteDecorator2(
				new ConcreteComponent()));
		component.doSomething();
		
	}
}
 