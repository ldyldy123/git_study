package first;

public class ExArray4 {

	public static void main(String[] args) {
		//다차원 배열
		
		int[][] score = new int[2][3];
	System.out.println(score.length);
	System.out.println(score[0].length);
	System.out.println(score[1].length);
	System.out.println("[0][0]"+score[0][0]);
	System.out.println("[0][1]"+score[0][1]);
	System.out.println("[0][2]"+score[0][2]);
	System.out.println("[1][0]"+score[1][0]);
	System.out.println("[1][1]"+score[1][1]);
	System.out.println("[1][2]"+score[1][2]);
	
	
	
	int[][]score1 = {{10,20},{30,40}};
	System.out.println(score1[0][0]);
	System.out.println(score1[0][1]);
	System.out.println(score1[1][0]);
	System.out.println(score1[1][1]);
	
	
	int[][]gugu;
	for (int i = 2; i < 10; i++) {
		
		for (int j = 1; j < 10; j++) {
			
			System.out.println(i+"*"+j+"="+i*j);
		}
		
	}
	}

}
