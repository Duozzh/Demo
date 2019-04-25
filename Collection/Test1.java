package Collection;
public class Test1
{
	public static void main(String[] args)
	{
		Shuiguo shuiguo = new Shuiguo();
		shuiguo.setName("apple");
		shuiguo.setSize("10cm");
		shuiguo.print();

	}

}
class Shuiguo
{
	public String name;
	public String size;
	public void setName(String name)
	{
		this.name = name;
		
	}
	public String getname()
	{
		return this.name;
	}
	public void setSize(String size)
	{
		this.size = size;
		
	}
	public String getSize()
	{
		return this.size;
	}
	public void print()
	{
		System.out.println(name);
		System.out.println(size);
	}
	
}
