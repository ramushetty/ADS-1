import java.util.Scanner;
class  Solution {
	// private Solution() {
	// 	//empty.
	// }
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int leng1 = scan.nextInt();
		int leng2 = scan.nextInt();
		String ast1 = scan.nextLine();
		System.out.println(ast1);
		String ast2 = scan.nextLine();
		System.out.println(ast2);
		if (leng2 != 0 && leng1 != 0) {
			String[] arr1 = ast1.split(",");
			String[] arr2 = ast2.split(",");
		} else {
			if (leng1 == 0) {
				System.out.println(ast1);
			} else {
				System.out.println(ast2);
			}
		}

	}
}