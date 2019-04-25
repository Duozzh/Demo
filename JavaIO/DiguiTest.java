package JavaIO;

public class DiguiTest {
	 public int compute(int number) {
		 int result = 1;
		 for(int i = number; i>0;i--) {
			 result*=i;
		 }
		 return result;
	 }
	 public int compute2(int number) {
		 if(1==number) {
			 return 1 ;
			 
		 }
		 else {
			 return number*compute2(number - 1);
		 }
	 }
	 public static void main(String[] args) {
		DiguiTest test = new DiguiTest();
		System.out.println(test.compute(5));
		System.out.println(test.compute2(5));
		
	}
}
