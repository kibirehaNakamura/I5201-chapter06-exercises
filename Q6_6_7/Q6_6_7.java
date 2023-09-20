import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q6_6_7 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		final String VACANT = "*";
		final int ELEMENT = 10;
		String[] arrayReserve = new String[ELEMENT];
		int idx;
		
		System.out.print("予約人数(0-10)>");
		int n = Integer.parseInt(br.readLine());
		
		for(idx = 0; idx < n; idx++) {
			System.out.print("予約者>");
			arrayReserve[idx] = br.readLine();
		}
		
		for(idx = n; idx < arrayReserve.length; idx++) {
			arrayReserve[idx] = VACANT;
		}
		
		System.out.println("予約者リスト");
		for(idx = 0; idx < arrayReserve.length; idx++) {
			System.out.print(arrayReserve[idx] + "\t");
		}
		System.out.println();
	}
}