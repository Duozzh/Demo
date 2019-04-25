package Strategy;

public class Environment {
	public Strategy strategey;
	public Environment(Strategy strategy) {
		this.strategey = strategy;
		
	}
	public Strategy getStrategey() {
		return strategey;
	}
	public void setStrategey(Strategy strategey) {
		this.strategey = strategey;
	}

	public int calculate(int a,int b) {
		return strategey.calculate(a, b);
	}
}

 