public class Sample6_7_1 {
	public static void main(String[] args) {
		int[] arrayScore = { 80, 75, 85, 95, 90 };
		int[] arrayEnglish;
		
		arrayEnglish = arrayScore;
		arrayEnglish[2] = 100;
		
		for(int i = 0; i < arrayScore.length; i++) {
			System.out.println(arrayScore[i]);
		}
	}
}