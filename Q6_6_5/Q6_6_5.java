public class Q6_6_5 {
	public static void main(String[] args) {
		String[] arrayEvalu = { "優", "良", "可", "不可" };
		int[] arrayCount = { 23, 10, 5, 2 };
		double[] arrayRatio = new double[4];
		int total = 0;
		
		for(int idx = 0; idx < arrayEvalu.length; idx++) {
			total += arrayCount[idx];
		}
		
		for(int idx = 0; idx < arrayEvalu.length; idx++) {
			arrayRatio[idx] = ((double)arrayCount[idx] / total) * 100;
		}
		
		for(int idx = 0; idx < arrayEvalu.length; idx++) {
			System.out.print(arrayEvalu[idx] + "\t");
			System.out.println(arrayRatio[idx] + "%");
		}
	}
}