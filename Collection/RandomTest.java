package Collection;
import java.util.Random;

public class RandomTest
{
	public static void main(String[] args)
	{
		int[] count = new int[41];
		Random random = new Random();
		for(int i = 0;i<50;i++)
		{
			int number = random.nextInt(41)+10;//生成10-50之间的数组
			count[number-10]++;
		}
		for(int i = 0;i<count.length;i++)
		{
			if(0 == count[i])
			{
				continue;
			}
			System.out.println((10+i)+"出现次数："+count[i]);
		}
		int max = count[0];
		for(int i = 0;i<count.length;i++)
		{
			if(max<count[i]) 
			{
				max = count[i];
			}
		}
		System.out.println("出现的最大次数为："+ max+"次");
		for(int i = 0;i<count.length;i++)
		{
			if(max == count[i])
			{ 
				System.out.println(i+10);
			}
		}
	}

}
