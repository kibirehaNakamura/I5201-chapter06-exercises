import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practice6_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arrayDenomi = { 10000, 5000, 2000, 1000, 500, 100, 50, 10, 5, 1 };
		int[] arraySheet = new int[arrayDenomi.length];
		
		System.out.print("金額>");
		int amount = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < arrayDenomi.length; i++) {
			arraySheet[i] = amount / arrayDenomi[i];
			amount -= arraySheet[i] * arrayDenomi[i];
		}
		
		for(int i = 0; i < arrayDenomi.length; i++) {
			System.out.println(arrayDenomi[i] + "\t" + arraySheet[i]);
		}
	}
}