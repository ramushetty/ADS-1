import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
class Studentdata {
	int id;
	String name;
	double marks;
	Studentdata(int idd, String nname, double markss) {
		this.id = idd;
		this.name = nname;
		this.marks = markss;

	}
}
public class Solution {
	private Solution() {

	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Studentdata> student = new ArrayList<Studentdata>();
		int count = Integer.parseInt(scan.nextLine());
		int c = count;
		while (c > 0) {
			String[] tokens = scan.nextLine().split(",");
			int id = Integer.parseInt(tokens[0]);
			double marks = Double.parseDouble(tokens[2]);
			student.add(new Studentdata(id,tokens[1],marks));
			c--;
		}
		int qu = Integer.parseInt(scan.nextLine());
		while (qu > 0) {
			String[] queries = scan.nextLine().split(" ");
			int idd = Integer.parseInt(queries[1]);
			int pri = Integer.parseInt(queries[2]);
			for (int i = 0; i < count; i++) {
				// if (student.get(i).id.contains(idd)) {
				// 	if (pri == 1) {
				// 		System.out.println(student.get(i).name);
				// 	} else {
				// 		System.out.println(student.get(i).marks);
				// 	}
				// }
				System.out.println(student.get(i));
			}
			qu--;
		}
	}
}