package Collection2;

import java.util.ArrayList;

public class TypeSafety {
	//@SuppressWarnings("unchecked") 
	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<Object>();
		list.add("one");
		list.add("two");
		list.add(new Integer (1));
		
		
		System.out.println(list);
	}
}
