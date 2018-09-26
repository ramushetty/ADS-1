import java.util.Scanner;
class  Solution {
	// private Solution() {
	// 	//empty.
	// }
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int leng1 = scan.nextInt();
		int leng2 = scan.nextInt();
		if (leng2 != 0 && leng1 != 0) {
			String ast1 = scan.nextLine();
			String[] arr1 = ast1.split(",");
			String ast2 = scan.nextLine();
			String[] arr2 = ast2.split(",");
		} else {
			if (leng1 == 0) {
				System.out.println(scan.nextLine());
			} else {
				System.out.println(scan.nextLine());
			}
		}

	}
}