package Collection2;

public class TreeSet {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		
		Person1 p1 = new Person1(10);
		Person1 p2 = new Person1(20);
		Person1 p3 = new Person1(30);
		Person1 p4 = new Person1(40);
		set.add(P1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		System.out.println(set);

		
	}
}
class Person1{
	int score;
	public Person1(int score) {
		this.score = score;
	}
	public String toString() {
		return String.valueOf(this.score);
	}
}
