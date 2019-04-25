package Decorator;

public class ConcreteDecorator1 extends Decorator {
	public ConcreteDecorator1(Component component) {
		super(component);
	}
	public void doSomething() {
		super.doSomething();
		this.doAntherThing();
	}
	private void doAntherThing() {
		System.out.println("¹¦ÄÜB");
	}
}
