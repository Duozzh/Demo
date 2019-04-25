package Collection;
import java.util.ArrayList;
public class ArrayListTest 
{
	public static void main(String[] args) {
		 ArrayList<String> arrayList = new ArrayList<String>();
		 arrayList.add("Hello");
		 arrayList.add("World");
		 arrayList.add("welcome");
		 String s1 = (String)arrayList.get(0);
		 String s2 = (String)arrayList.get(1);
		 String s3 = (String)arrayList.get(2);
		 System.out.println(s1);
		 System.out.println(s2);
		 System.out.println(s3);
		 System.out.println("-----------------");
		 for(int i=0;i<arrayList.size();i++)
		 {
			 System.out.println(arrayList.get(i));
		 }
		 arrayList.clear();
		 System.out.println(arrayList.size());
	}
}
