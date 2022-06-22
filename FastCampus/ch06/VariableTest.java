package ch06;

public class VariableTest {

	public static void main(String[] args) {
		
//		byte 1바이 8비트 -128 ~ 127
		byte bnum = -128;
		
		System.out.println(bnum);
		
//		int num = 12345678900; int의 4바이트에는 못들어가기에 8바이트인 long으로
		long lnum = 12345678900L;
		System.out.println(lnum);
	}

}
