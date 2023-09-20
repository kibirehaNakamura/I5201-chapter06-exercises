import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sample6_6_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] arrayWord = {"", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
		
		System.out.print("1-12の月を入力>");
		int month = Integer.parseInt(br.readLine());
		String strWord = arrayWord[month];
		
		System.out.println(strWord);
	}
}