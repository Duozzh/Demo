package Collection;

public class Print {
	public static void main(String[] args) { 
		/*for(int j = 0;j < 1000;j++) {
			//byte n = (byte) i;
			System.out.println("0001181022000" + "%X\n",i);
			//System.out.println("0001181022000"+Integer.toHexString(i));// ��ʮ�����ƣ����� 16���޷���������ʽ����һ�������������ַ�����ʾ��ʽ��
		}*/
			for(int i=0x0;i<=0xf;i++){
				System.out.format( "00011810220000"+"%02x\n ", i );
			
		}
	}
}
