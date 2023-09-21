public class Q6_8_2 {
	public static void main(String[] args) {
		int[][] arrayGoban = {{ 0, 1, 1, 1, 1, 1, 1, 0 },
		                      { 0, 0, 2, 2, 1, 2, 0, 0 },
		                      { 1, 0, 2, 2, 2, 2, 2, 2 },
		                      { 2, 1, 2, 2, 1, 2, 2, 0 },
		                      { 2, 2, 2, 1, 1, 2, 2, 2 },
		                      { 1, 2, 2, 1, 1, 2, 2, 2 },
		                      { 0, 0, 2, 2, 1, 2, 0, 0 },
		                      { 0, 0, 2, 2, 2, 0, 0, 0 }};
		int white = 0;
		int black = 0;
		int stone;
		
		for(int i = 0; i < arrayGoban.length; i++) {
			for(int j = 0; j < arrayGoban[i].length; j++) {
				stone = arrayGoban[i][j];
				if(stone == 1) {
					white++;
				} else if(stone == 2) {
					black++;
				}
			}
		}
		System.out.println("白 = " + white);
		System.out.println("黒 = " + black);
	}
}