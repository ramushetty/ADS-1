import java.util.Scanner;
class Reservation implements Comparable<Reservation>{
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

	public int compareTo(Reservation pl2){
		if(this.totalmarks < pl2.totalmarks){
			return 1;
			
		}else if(this.totalmarks > pl2.totalmarks){
			return -1;
		}else if(this.subject3tmarks < pl2.subject3tmarks){
			return 1;
		}else if(this.subject3tmarks > pl2.subject3tmarks){
			return -1;
		// }else if(this.name.compareTo(pl2.name) < 0){
		// 	return 1;
		// }else if(this.name.compareTo(pl2.name) > 0){
		// 	return -1;
		}
		return 0;
	}
}




class Solution{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int nostudents = scan.nextInt();
		int noofvacancy = scan.nextInt();
		int unrescat = scan.nextInt();
		int bc = scan.nextInt();
		int sc = scan.nextInt();
		int st = scan.nextInt();
		scan.nextLine();
		Reservation[] rev = new Reservation[nostudents];
		for (int i = 0; i < nostudents; i++) {
			String[] tokens = scan.nextLine().split(",");
			int s1 = Integer.parseInt(tokens[2]);

			int s2 = Integer.parseInt(tokens[3]);
			int s3 = Integer.parseInt(tokens[4]);
			int tot = Integer.parseInt(tokens[5]);
			rev[i] = new Reservation(tokens[0], tokens[1], s1, s2, s3, tot,tokens[6]);

		}
		
		for(int i = 0; i < nostudents; i++){
			System.out.println(rev[i].name + ","+rev[i].totalmarks +"," + rev[i].category);
		}
		Merge.sort(rev);
		System.out.println();
		for(int i = 0; i < noofvacancy; i++){
			System.out.println(rev[i].name + ","+rev[i].totalmarks + "," + rev[i].category);
		}
	}
}