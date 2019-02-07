package first;

public class ExArray3 {

	public static void main(String[] args) {

		int[] score = new int[5];
		score[0] = 10;
		System.out.println(score[0]);
		System.out.println(score[1]);

		String[] name = new String[5];
		name[0] = "이다영";
		System.out.println(name[0]);
		System.out.println(name[1]);
		
		if (name[1] == null) {
			System.out.println("name에 값을 입력해주세요");
		} else {
			System.out.println(name[0]);
		}
	
	int[] arr = new int[5];
	for (int i = 0; i < arr.length; i++) {
		System.out.println("arr"+ i + " : " + arr[i]);
		
	}
	arr[0] = 10;
	arr[1] = 20;
	arr[2] = 30;
	arr[3] = 40;
	arr[4] = 50;
	
	for (int i = 0; i < arr.length; i++) {
		System.out.println("arr"+ i + " : " + arr[i]);
		
	}
	
	System.out.println(arr.length);
	
	}

}
