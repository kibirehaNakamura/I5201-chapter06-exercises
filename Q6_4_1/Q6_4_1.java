public class Q6_4_1 {
	public static void main(String[] args) {
		int[] arrayAmScore = { 70, 85, 60, 65, 75 };
		int[] arrayPmScore = { 80, 60, 70, 65, 70 };
		int[] arrayTotalScore = new int[5];
		
		for(int i = 0; i < arrayTotalScore.length; i++) {
			arrayTotalScore[i] = arrayAmScore[i] + arrayPmScore[i];
			System.out.println((i + 1) + "人目の合計は" + arrayTotalScore[i]);
		}
	}
}