package Collection2;
import java.util.HashMap;
public class MapTest {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("a", "zhangsan");
		map.put("b", "lisi");
		map.put("c", "wangwu");
		map.put("a", "wang");
		System.out.println(map);
		String value = (String)map.get("b");
		System.out.println(value);
		String value2 = (String)map.get("d");
		System.out.println(value2);
	}
}
  