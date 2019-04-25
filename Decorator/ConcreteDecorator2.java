package Decorator;

public class ConcreteDecorator2 extends Decorator {
	public ConcreteDecorator2(Component component) {
		super(component);
	}
	public void doSomething() {
		super.doSomething();
		this.doAntherThing();
	}
	private void doAntherThing() {
		System.out.println("¹¦ÄÜc");
	}
}
