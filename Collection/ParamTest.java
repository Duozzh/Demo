package Collection;

public class ParamTest 
{
	public void change(Persons p,Persons p2)
	{
		p.name = "lisi";
		p2.name = "wangwu";
	}
	public static void main(String[] args) 
	{	
		Persons p = new Persons();
		p.name = "zhangsan";
		Persons p2 = p;
		ParamTest pt = new ParamTest();
		pt.change(p, p2);
		System.out.println(p.name);
	}

}
 class Persons 
   {
	  String name;
   }