import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q6_5_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		final int N = 5;
		String[] arrayName = new String[N];
		int[] arrayScore = new int[N];
		
		for(int i = 0; i < arrayName.length; i++) {
			System.out.print((i + 1) + "人目の名前を入力>");
			arrayName[i] = br.readLine();
			System.out.print((i + 1) + "人目の点数を入力>");
			arrayScore[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = 0; i < arrayName.length; i++) {
			System.out.print(arrayName[i] + "さん ");
			System.out.println(arrayScore[i] + "点");
		}
	}
}