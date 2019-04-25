package DynamicProxy;

import java.lang.reflect.Proxy;

public class Demo {
	public static void main(String[] args) {
		CommonInvocationHandler handler = new CommonInvocationHandler();
		Foo f = null;
		handler.setTarget(new Fooimpl());
		f = (Foo)Proxy.newProxyInstance(Foo.class.getClassLoader(),
				new Class[] {Foo.class},handler);
		f.doAction();
		handler.setTarget(new Fooimpl2());
		f = (Foo)Proxy.newProxyInstance(Foo.class.getClassLoader(),
				new Class[] {Foo.class},handler);
		f.doAction();
	}
}
 