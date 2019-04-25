package Collection;

public class ArrayPaixu {
	public static void  main(String[] args)
	{
		int[] array = {5,4,7,9,3};
		ArrayPaixu.paixu(array);

	}
	public static void paixu(int[] array)
	{
		for(int i = 0;i < array.length-1;i++)
		{
			for(int j = 0;j < array.length-i-1;j++)
			{
				if(array[j]>array[j+1])
				{
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				
				}
			}
			//System.out.println("µÚ"+(i+1)+"ÅÅÐò")
			for(int k=0;k<array.length;k++)
			{
				System.out.print(array[k]);
			}
			System.out.println();
		}
	}

}
