public class Q6_7_1 {
	public static void main(String[] args) {
		int[] arrayScore = { 80, 75, 85, 95, 90 };
		int[] arrayJapan;
		
		arrayJapan = arrayScore;
		arrayScore[0] -= arrayJapan[0];	// 80 - 80 = 0
		arrayJapan[1] += 25;	// 75 + 25 = 100
		arrayScore[2] = 100;	// 100
		arrayJapan[3] = 100;	// 100
		arrayJapan[4]++;	// 90 + 1 = 91
		
		for(int i = 0; i < arrayJapan.length; i++) {
			System.out.println(i + "\t" + arrayScore[i]);	// arrayScore = { 0, 100, 100, 100, 91 }になる
		}
	}
}