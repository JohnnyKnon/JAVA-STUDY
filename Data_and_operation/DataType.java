public class DataType{
	public static void main(String[] args) {
		System.out.println(6); // Number
		System.out.println("six"); // String
		
		System.out.println("6"); // String 6
		
		System.out.println(6+6); // 12 더하기 연산
		System.out.println("6"+"6"); // 66 결합 연산
		
		System.out.println(6 * 6); // 36
//		System.out.println("6"*"6"); 는 문자열 곱하기 연산자라 에러
		
		System.out.println("1111".length()); // 문자열 길이
//		System.out.println(1111.length()); 숫자는 길이 측정이 안되기 때문에 에러
	}
}