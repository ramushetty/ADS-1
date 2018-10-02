import java.util.Scanner;
import java.io.*;
class Insertion {
	
	public void sort(String[] item) {
		String[] items = item;
		String temp = "";

		for (int i = 1; i < items.length ; i++) {
			temp = items[i];
			int j = i -1;
			while(j >= 0){
				if (temp.compareTo(items[j]) > 0) {
					break;
				}
				items[j + 1] = items[j];
				j = j - 1;
			}
			items[j + 1] = temp;
			
		}
		for (int i = 0; i < items.length -1; i++) {
			System.out.print(items[i] + ", ");
		}
		System.out.println(items[items.length-1]);
	}
}
public class Insertionsort {
	public static void main(String[] args) {
		Insertion so = new Insertion();

		try {
			String s = "";
			Scanner scan = new Scanner(new File("tiny.txt"));
			while(scan.hasNext()) {
				String t = scan.next();

					s += t + " ";


			}
			String[] str = s.split(" ");
			so.sort(str);

			
		} catch(Exception ex) {
			System.out.println("file not found  " + ex);
		}
	}
}