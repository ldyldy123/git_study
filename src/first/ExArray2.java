package first;

public class ExArray2 {

	public static void main(String[] args) {
		int[] score;
		// score = {10,20,30}; > 안됨
		score = new int[] { 10, 20, 30 }; // 배열을 먼저 선언 한 다음에 변수를 지정할 경우 new 써줘야 됨.
		int sum1 = 0;

		for (int i = 0; i < score.length; i++) {

			sum1 += score[i];

		}
		System.out.println("총합 : " + sum1);
		double avg = (double) sum1 / score.length;
		System.out.println("평균 : " + avg);

		int sum2 = add(new int[] { 40, 50, 60 });
		System.out.println("총합2: " + sum2);
		double avg2 = (double) sum2 / score.length;
		System.out.println("평균2: " + avg2);
	}

	public static int add(int[] score) {
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];

		}
		return sum;
	}

}
