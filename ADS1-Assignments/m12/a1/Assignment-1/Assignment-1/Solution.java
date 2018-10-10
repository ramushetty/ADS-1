// import java.util.Scanner;
// nemnous
// class Reservation implements Comparable<Reservation>{
// 	String name;
// 	String dob;
// 	int subject1tmarks;
// 	int subject2tmarks;
// 	int subject3tmarks;
// 	int totalmarks;

// 	String category;

// 	Reservation(String n, String dobb, int s1, int s2, int s3, int tm, String rc) {
// 		name = n;
// 		dob = dobb;
// 		subject1tmarks = s1;
// 		subject2tmarks = s2;
// 		subject3tmarks = s3;

// 		totalmarks = tm;
// 		category = rc;
// 	}

// 	public int compareTo(Reservation pl2){
		
// 		if(this.totalmarks < pl2.totalmarks){
// 			return 1;
			
// 		}else if(this.totalmarks > pl2.totalmarks){
// 			return -1;
// 		}else if(this.subject3tmarks < pl2.subject3tmarks){
// 			return 1;
// 		}else if(this.subject3tmarks > pl2.subject3tmarks){
// 			return -1;
// 		}else if(this.subject2tmarks < subject2tmarks){
// 			return 1;
// 		}else if(this.subject1tmarks < subject1tmarks){
// 			return -1;
// 		}
// 		return 0;
// 	}


// }




// class Solution{
// 	public static void main(String[] args) {
// 		Scanner scan = new Scanner(System.in);
		
// 		int nostudents = scan.nextInt();
// 		int noofvacancy = scan.nextInt();
// 		int unrescat = scan.nextInt();
// 		int bc = scan.nextInt();
// 		int sc = scan.nextInt();
// 		int st = scan.nextInt();
// 		scan.nextLine();
// 		Reservation[] rev = new Reservation[nostudents];
// 		for (int i = 0; i < nostudents; i++) {
// 			String[] tokens = scan.nextLine().split(",");
// 			int s1 = Integer.parseInt(tokens[2]);

// 			int s2 = Integer.parseInt(tokens[3]);
// 			int s3 = Integer.parseInt(tokens[4]);
// 			int tot = Integer.parseInt(tokens[5]);
// 			rev[i] = new Reservation(tokens[0], tokens[1], s1, s2, s3, tot,tokens[6]);

// 		}
		
// 		for(int i = 0; i < nostudents; i++){
// 			System.out.println(rev[i].name + ","+rev[i].totalmarks +"," + rev[i].category);
// 		}
// 		Merge.sort(rev);
// 		System.out.println();
// 		for(int i = 0; i < noofvacancy; i++){
// 			System.out.println(rev[i].name + ","+rev[i].totalmarks + "," + rev[i].category);
// 		}
// 	}
// }
//
import java.util.Scanner; 
import java.util.*;
class Solution {
	Students[] students;
	Students[] ressort;
	private int size, numberofstudents, numberofvacancies, numberofunreservedc, numberofbcstudents, numberofscstudents, numberofststudents;
	Solution(int numberofstudents, int numberofvacancies, int numberofunreservedc, int numberofbcstudents, int numberofscstudents, int numberststudents) {
		this.numberofstudents = numberofstudents;
		this.numberofvacancies = numberofvacancies;
		this.numberofunreservedc = numberofunreservedc;
		this.numberofbcstudents = numberofbcstudents;
		this.numberofscstudents = numberofscstudents;
		this.numberofststudents = numberststudents;
		students = new Students[numberofstudents];
		size = 0;
	}
	public int getsize() {
		return size;
	}
	// public int getrsize() {
	// 	return ressize;
	// }
	public void add(Students s1) {
		students[size++] = s1;
	}
	public void insertionsort(Students[] s1, int siz) {
		int i,j;
		for (i = 1; i < siz; i++) {
			j = i;
			while (j > 0) {
				if (compare(s1[j -1], s1[j]) == 1) {
					Students s = s1[j-1];
					s1[j -1] = s1[j];
					s1[j] = s;
					j--;
				} else {
					break;
				}
			}

		}
		// System.out.println(siz);
		// for (int p = 0; p < siz; p++) {
		// 	System.out.println(s1[p]);
		// }
		

	}
	public void reservation() {
		// Students[] res = (Students)students.clone();
		ressort = new Students[size];
		int ressize = 0;
		// for (int i = 0; i < size; i++) {
		// 	res[i] = students[i];
		// }
		for (int j = 0 ; j < ressort.length; j++) {
			if (numberofunreservedc > 0) {
				ressort[ressize++] = students[j];
				numberofunreservedc--;
			} else {
				String c = students[j].getcategory();
				if (numberofbcstudents > 0 || numberofscstudents > 0 || numberofststudents >0) {
					if (c.equals("BC") && numberofbcstudents > 0) {
						ressort[ressize++] = students[j];
						numberofbcstudents--;
					}
					if (c.equals("SC") && numberofscstudents > 0) {
						ressort[ressize++] = students[j];
						numberofscstudents--;
					}
					if (c.equals("ST") && numberofststudents > 0) {
						ressort[ressize++] = students[j];
						 numberofststudents--;
					}
				} else {
					break;
				}
			}

		}
		// for (int k = 0; k < ; k++) {
		// 	System.out.println(res[k]);
		// }
		// insertionsort()

	}
	// public ressort() {

	// }
	public int compare(Students s1, Students s2) {
		if (s1.gettotalmarks() < s2.gettotalmarks()) return 1;
		if (s1.gettotalmarks() > s2.gettotalmarks()) return 0;
		if (s1.getsubject3() < s2.getsubject3()) return 1;
		if (s1.getsubject3() > s2.getsubject3()) return 0;
		// if (s1.getsubject3() < s2.getsubject3()) return 1;
		if (s1.getsubject2() < s2.getsubject2()) return 1;
		if (s1.getsubject2() > s2.getsubject2()) return 0;
		String[] str1 = s1.getdob().split("-");
		String[] str2 = s2.getdob().split("-");
		if (Integer.parseInt(str1[2]) < Integer.parseInt(str2[2])) return 1;
		if (Integer.parseInt(str1[2]) > Integer.parseInt(str2[2])) return 0;
		if (Integer.parseInt(str1[1]) < Integer.parseInt(str2[2])) return 1;
		if (Integer.parseInt(str1[2]) > Integer.parseInt(str2[2])) return 0;
		if (Integer.parseInt(str1[0]) < Integer.parseInt(str2[0])) return 1;
		if (Integer.parseInt(str1[0]) > Integer.parseInt(str2[0])) return 0;
		return 0;






	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Students std = new 
		int numberofstudents = Integer.parseInt(scan.nextLine());
		int numberofvacancies = Integer.parseInt(scan.nextLine());
		int numberofunreservedc = Integer.parseInt(scan.nextLine());
		int numberofbcstudents = Integer.parseInt(scan.nextLine());
		int numberofscstudents = Integer.parseInt(scan.nextLine());
		int numberofststudents = Integer.parseInt(scan.nextLine());
		Solution stu = new Solution(numberofstudents, numberofvacancies, numberofunreservedc, numberofbcstudents, numberofscstudents, numberofststudents);
		// scan.nextLine();
		while(numberofstudents > 0) {
			String[] tokens = scan.nextLine().split(",");
			// System.out.println(Arrays.toString(tokens));
			stu.add(new Students(tokens[0], tokens[1], Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3]), Integer.parseInt(tokens[4]), Integer.parseInt(tokens[5]), tokens[6]));
			numberofstudents = numberofstudents - 1;
		}
		// System.out.println(stu.students[1]);
		stu.insertionsort(stu.students, stu.getsize());
		System.out.println();
		stu.reservation();
		stu.insertionsort(stu.ressort, numberofvacancies);

	}

}
class Students {
	private String studentname, dob, category;
	private int subject1, subject2, subject3, totalmarks;
	Students (String studentname, String dob, int subject1, int subject2, int subject3, int totalmarks, String category) {
		this.studentname = studentname;
		this.dob = dob;
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
		this.totalmarks = totalmarks;
		this.category = category;
	}
	public int gettotalmarks() {
		return totalmarks;
	}
	public int getsubject1() {
		return subject1;
	}
	public int  getsubject2() {
		return subject2;
	}
	public int getsubject3() {
		return subject3;
	}
	public String getcategory() {
		return category;
	}
	public String getstudentname() {
		return studentname;

	}
	public String getdob() {
		return dob;
	}
	public String toString() {
		String str = getstudentname() + "," + gettotalmarks() + "," + getcategory();
		return str;
	}
}