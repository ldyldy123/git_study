package first;

public class Ex1 {

	public static void main(String[] args) {

		System.out.println("hello java!");

		int sum = 0;

		for (int i = 0; i < 11; i++) {

			sum += i;

		}
		System.out.println(sum);

		for (int i = 2; i < 10; i++) {

			for (int j = 1; j < 10; j++) {

				System.out.println(i + "x" + j + "=" + i * j);
			}

		}

		int sum2 = 0;
		for (int i = 1; i < 101; i++) {

			if (i % 3 == 0) {
				System.out.println("100까지의 숫자 중 3의 배수 인것들만 출력" + i);
				sum2 += i;

			}

		}
		System.out.println("100까지의 숫자 중 3의 배수의 합" + sum2);
	}

}
