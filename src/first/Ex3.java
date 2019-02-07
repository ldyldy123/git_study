package first;

public class Ex3 {

	public static void main(String[] args) {
		
		
		String strVal1 = "이다영";
		String strVal2 = "이다영";
		
		if (strVal1==strVal2) {
			System.out.println("1과2는 참조가 같음");
		}else {
			System.out.println("참조가 다름");
		}
		
		if (strVal1.equals(strVal2)) {
			System.out.println("1,2 문자열 같음");
		}
			
		String strVal3 = new String("이다영");
		String strVal4 = new String("이다영");
		
		if(strVal3 == strVal4) {
			
			System.out.println("3과4는 참조가 같음");
		}else {
			System.out.println("참조가 다름");
		}
		
		if (strVal3.equals(strVal4)) {
			System.out.println("3,4 문자열 같음");
		}
			
	}
}
