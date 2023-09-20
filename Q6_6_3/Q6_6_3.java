public class Q6_6_3 {
	public static void main(String[] args) {
		int[] arrayAdm = { 856, 861, 862, 854, 864, 846, 848 };
		int max = 0;
		
		for(int i = 0; i < arrayAdm.length; i++) {
			if(max < arrayAdm[i]) {
				max = arrayAdm[i];
			}
		}
		System.out.println("最大 = " + max);
	}
}