package JavaIO2;

import java.io.BufferedReader;

import java.io.InputStreamReader;

public class StreamTest {
	public static void main(String[] args) throws Exception {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String str;
		while(null != (str = br.readLine())) {
			System.out.println(str);
			
		}
		br.close();
	}
}
