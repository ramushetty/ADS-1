import java.util.Scanner;
class  Solution {
	// private Solution() {
	// 	//empty.
	// }
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String leng1 = scan.nextLine();
		String leng2 = scan.nextLine();
		String ast1 = scan.nextLine();
		String ast2 = scan.nextLine();


		if (Integer.parseInt(leng1) != 0 && Integer.parseInt(leng2) != 0) {
			String[] arr1 = ast1.split(",");
			String[] arr2 = ast2.split(",");
		} else {
			if (Integer.parseInt(leng1) == 0) {
				System.out.println(ast2);
			} else {
				System.out.println(ast1);
			}
		}

	}
}