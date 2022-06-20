
public class Casting {

	public static void main(String[] args) {
		
		double a = 1.1;
		double b = 1; // 손실이 없기 때문에 자동으로 이유는 자동으로 
		double b2 = (double) 1; // 이것과 b는 동일, 즉 명시적으
		System.out.println(b);
		
		
//		int c = 1.1; : convert error
		
//		(int) 1.1 을 강제로 int형으로 바꿈.
		int d = (int) 1.1; // 1 즉, 손실이 일어난다. 명시적 형변환 
		System.out.println(d);
		
		double e = 1.1;	
		System.out.println(e);
		
		// 1 to String
		String f = Integer.toString(1);
		// .getClass() 는 앞에 변수가 갖고있는 값이 어떤 데이터 타입인지 알려줌.		
		System.out.println(f.getClass());
		
	}

}
