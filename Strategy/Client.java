package Strategy;

public class Client {
	public static void main(String[] args) {
		AddStrategy addstreategy = new AddStrategy();
		Environment environment = new Environment(addstreategy);
		System.out.println(environment.calculate(3, 4));
		SubtractStrategy subtreactSreategy = new SubtractStrategy();
		environment.setStrategey(subtreactSreategy);
		System.out.println(environment.calculate(3, 4));
		MultiplyStrategy multiplystrategy = new MultiplyStrategy();
		environment.setStrategey(multiplystrategy);
		System.out.println(environment.calculate(3, 4));
		DivideStrategy dividestrategy = new DivideStrategy();
		environment.setStrategey(dividestrategy);
		System.out.println(environment.calculate(3, 4));
	}
}
  