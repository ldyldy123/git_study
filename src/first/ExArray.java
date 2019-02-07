package first;

public class ExArray {
	public static void main(String[] args) {

		String[] arr1 = {"이다영","이다혜","김정연","망고"};
		System.out.println("arr1[0] : " + arr1[0]);
		System.out.println("arr1[1] : " + arr1[1]);
		System.out.println("arr1[2] : " + arr1[2]);
		System.out.println("arr1[3] : " + arr1[3]);
		
		int[] score = {1,5,17,20};
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
			
		}
		System.out.println("총합 :" + sum);
		double avg = (double)sum/score.length;
		System.out.println("평균 : " + avg);
		
		int sum2 = add(new int[] {10,30,40,50});
		System.out.println("총합2: " + sum2);
		double avg2 = (double)sum2/score.length;
		System.out.println("평균2: " + avg2);
	}
	
	public static int add(int score[]) {
		int sum = 0;
		for (int i = 0; i < score.length ; i++) {
			sum+= score[i];
			
		}
		return sum;
		
	}
}
