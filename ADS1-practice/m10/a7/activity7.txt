import java.util.Scanner;
class factorial {
	public int fac(int num) {
		if (num == 0 || num == 1) {
			return 1;
		}
		
		return num * fac(num - 1);
	}
}
public class Solution {
	public static void main(String[] args) {
		factorial fa = new factorial();
		Scanner scan = new Scanner(System.in);
		int inp = scan.nextInt();
		int outt = fa.fac(inp);
		System.out.println(outt);
		
	}
}