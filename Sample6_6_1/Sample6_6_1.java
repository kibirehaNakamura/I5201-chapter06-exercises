public class Sample6_6_1 {
	public static void main(String[] args) {
		int[] arrayScore = { 80, 70, 90 };
		int total = 0;
		
		for(int idx = 0; idx < arrayScore.length; idx++) {
			total += arrayScore[idx];
		}
		System.out.println(total);
	}
}