// import java.util.Scanner;
// public final class Solution {
// 	private Solution() {
// 		//empty.
// 	}
// 	public static void main(String[] args) {
// 		Scanner scan = new Scanner(System.in);
// 	}
// }
import java.util.*;
class Reservation {
	String name;
	String dob;
	int subject1tmarks;
	int subject2tmarks;
	int subject3tmarks;
	int totalmarks;

	String category;

	Reservation(String n, String dobb, int s1, int s2, int s3, int tm, String rc) {
		name = n;
		dob = dobb;
		subject1tmarks = s1;
		subject2tmarks = s2;
		subject3tmarks = s3;

		totalmarks = tm;
		category = rc;
	}

	// static Comparator<Reservation> nameComparator = new Comparator<Reservation>(){
	// 	public int compare(Reservation s1, Reservation s2) {
	// 		return s1.name.compareTo(s2.name);
	// 	}
	// };

	static Comparator<Reservation> totalComparator = new Comparator<Reservation>(){
		public int compare(Reservation s1, Reservation s2) {
			if (s1.totalmarks != s2.totalmarks) {
				return s1.totalmarks - s2.totalmarks;
			}
			else if (s1.subject3tmarks != s2.subject3tmarks) {
				return s1.subject3tmarks - s2.subject3tmarks;
			}
			else if (s1.subject3tmarks != s2.subject3tmarks) {
				return s1.subject2tmarks - s2.subject2tmarks;
			}
			else if (s1.subject3tmarks != s2.subject3tmarks) {
				return s1.subject1tmarks - s2.subject1tmarks;
			}
			return 0;
		}
	};

	// static Comparator<Reservation> ratingComparator = new Comparator<Reservation>(){
	// 	public int compare(Reservation s1, Reservation s2) {
	// 		return s1.subject3tmarks - s2.subject3tmarks;
	// 	}
	// };

	// static Comparator<Reservation> sizeComparator = new Comparator<Reservation>(){
	// 	public int compare(Reservation s1, Reservation s2) {
	// 		return s1.size - s2.size;
	// 	}
	// };



}

class Students {
	Reservation[] items;
	int size;
	Students() {
		items = new Reservation[10];
		size = 0;
	}

	public void resize() {
		items = Arrays.copyOf(items, items.length * 2);
	}

	public void addItem(Reservation item) {
		if (size == items.length) {
			resize();
		}
		items[size++] = item;
	}

	public Reservation[] getItems() {
		return items;
	}

	public void tostring() {
		for (int i = 0; i < size; i++) {
			System.out.println(items[i].name + "," + items[i].totalmarks + "," + items[i].category);
		}
	}
}

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Students sobj = new Students();
		Sort sort = new Sort();
		int nostudents = scan.nextInt();
		int noofvacancy = scan.nextInt();
		int unrescat = scan.nextInt();
		int bc = scan.nextInt();
		int sc = scan.nextInt();
		int st = scan.nextInt();
		for (int i = 0; i < nostudents; i++) {
			String str = scan.nextLine();
			// System.out.println(str + "==========");
			String[] tokens = scan.nextLine().split(",");
			// System.out.println("=========================================");
			// System.out.println(tokens[0]+  tokens[1] + " "+ tokens[2] + " " +tokens[2]  + " " + tokens[3] + " " + tokens[4] + " " + tokens[5]);
			int s1 = Integer.parseInt(tokens[2]);

			int s2 = Integer.parseInt(tokens[3]);
			int s3 = Integer.parseInt(tokens[4]);
			int tot = Integer.parseInt(tokens[5]);
			sobj.addItem(new Reservation(tokens[0], tokens[1], s1, s2, s3, tot,tokens[6]));

		}
		Reservation[] items = sobj.getItems();
		sobj.tostring();
		System.out.println("-------------------------");
		sort.iSort(items, 0, items.length - 1, Reservation.totalComparator);
		// sort.sSort(items, Reservation.costComparator);
		// Merge mer = new Merge();
		// mer.mSort(items, Reservation.sizeComparator);
		sobj.tostring();
	}
}