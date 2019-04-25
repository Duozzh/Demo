package Collection;

import java.util.Arrays;

public class BubbleSort {
	public static void bubblesort(int []array) {
		for(int i=0;i<array.length-1;i++) {//Ã°ÅÝÌËÊý
			for(int j = 0;j<array.length-i-1;j++) {
				if(array[j]>array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
			for(int x : array) {
				System.out.print(x);
			}
			System.out.println();		}
	}
	public static void main(String[] args) {
		int[] array = {6,8,3,1,9} ;
		BubbleSort.bubblesort(array);
		System.out.println(Arrays.toString(array));
	}
	
}
