public class Q6_6_4 {
	public static void main(String[] args) {
		int[] arrayScore = { 80, 70, 90, 65, 80, 75, 65, 50, 100, 95 };
		int[] arrayFreq = new int[11];
		int idx;
		
		for(idx = 0; idx < arrayFreq.length; idx++) {
			arrayFreq[idx] = 0;
		}
		
		for(idx = 0; idx < arrayScore.length; idx++) {
			int j = arrayScore[idx] / 10;
			arrayFreq[j]++;
		}
		
		for(idx = 0; idx < (arrayFreq.length - 1); idx++) {
			System.out.println((idx * 10) + "点台 : " + arrayFreq[idx]);
		}
		System.out.println((idx * 10) + "点 : " + arrayFreq[idx]);
	}
}