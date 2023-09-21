public class Sample6_8_2 {
	public static void main(String[] args) {
		int[][] triMatrix = new int[4][];
		triMatrix[0] = new int[1];
		triMatrix[1] = new int[2];
		triMatrix[2] = new int[3];
		triMatrix[3] = new int[4];
		
		for(int i = 0; i < triMatrix.length; i++) {
			for(int j = 0; j < triMatrix[i].length; j++) {
				triMatrix[i][j] = j + 1;
				System.out.print(triMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}