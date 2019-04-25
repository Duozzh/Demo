package Collection;

public class Print {
	public static void main(String[] args) { 
		/*for(int j = 0;j < 1000;j++) {
			//byte n = (byte) i;
			System.out.println("0001181022000" + "%X\n",i);
			//System.out.println("0001181022000"+Integer.toHexString(i));// 以十六进制（基数 16）无符号整数形式返回一个整数参数的字符串表示形式。
		}*/
			for(int i=0x0;i<=0xf;i++){
				System.out.format( "00011810220000"+"%02x\n ", i );
			
		}
	}
}
