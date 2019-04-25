package Collection;

public class PointTest {
	public void changePoint(Point point) {
		point = new Point();
		point.x = 3;
		point.y = 4;
	}
	
	public static void main(String[] args) {
		PointTest pt = new PointTest();
		Point p = new Point();
		pt.changePoint(p);
		System.out.println(p.x);
		System.out.println(p.y);
		
	}
	
 
}
class Point {
	int x;
	int y;
}
