public class Q6_8_1 {
	public static void main(String[] args) {
		int[][] arrayScore = {{ 95, 70, 85, 85 },
		                      { 90, 70, 80, 90 },
		                      { 90, 65, 80, 80 }};
		int[] total = new int[arrayScore.length];
		
		for(int i = 0; i < arrayScore.length; i++) {
			total[i] = 0;
			for(int j = 0; j < arrayScore[i].length; j++) {
				total[i] += arrayScore[i][j];
			}
		}
		
		for(int i = 0; i < total.length; i++) {
			System.out.println(total[i]);
		}
	}
}