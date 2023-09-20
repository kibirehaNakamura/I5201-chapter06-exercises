public class Q6_6_1 {
	public static void main(String[] args) {
		int[] arrayScore = { 80, 70, 90, 65, 80, 75, 65, 50, 100, 95 };
		int count = 0;
		
		for(int idx = 0; idx < arrayScore.length; idx++) {
			if(80 <= arrayScore[idx]) {
				count++;
			}
		}
		System.out.println(count);
	}
}