public class Sample6_8_1 {
	public static void main(String[] args) {
		int[][] arrayMat = new int[3][4];
		
		for(int i = 0; i < arrayMat.length; i++) {
			for(int j = 0; j < arrayMat[i].length; j++) {
				arrayMat[i][j] = (i + 1) * 10 + (j + 1);
			}
		}
		
		for(int i = 0; i < arrayMat.length; i++) {
			for(int j = 0; j < arrayMat[i].length; j++) {
				System.out.print(arrayMat[i][j] + " ");
			}
			System.out.println();
		}
	}
}