import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sample6_5_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arrayScore = new int[3];
		int total = 0;
		
		for(int i = 0; i < arrayScore.length; i++) {
			System.out.print("点数を入力>");
			arrayScore[i] = Integer.parseInt(br.readLine());
			total += arrayScore[i];
		}
		System.out.println("合計 : " + total);
	}
}