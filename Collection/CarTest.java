package Collection;

public class CarTest {
	/*public void run(BMW bmw) {
		bmw.run();
	}
	public void run(QQ qq) {
		qq.run();
	}*/
	public void car(Car car) {
		car.run();
	}
	public static void main(String[] args) {
		CarTest test = new CarTest();
		/*
		BMW bmw = new BMW();
		test.run(bmw);
		QQ qq = new QQ();
		test.run(qq);
		*/   
		Car car = new BMW();
		test.car(car); 
		Car qq = new QQ();
		test.car(qq);
	}

}
class Car {
	public void run() {
		System.out.println("car is runing");
	}
}
class BMW extends Car {
	public void run() {
		System.out.println("bmw is runing");
	}
}
class QQ extends Car {
	public void run() {
		System.out.println("qq is runing");
	}
}