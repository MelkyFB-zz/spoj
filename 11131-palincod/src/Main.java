import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		for(int i = 1; i <= c ; i++) {
			String p = sc.nextLine();
			System.out.println(i + (new StringBuilder(p).reverse().toString().equals(p) ? " \"YES\"" : " \"NO\""));
		}
	}
}