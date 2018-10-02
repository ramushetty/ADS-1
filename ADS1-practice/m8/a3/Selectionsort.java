import java.util.Scanner;
import java.io.*;
class Sort {
	
	public void sort(String[] item) {
		String[] items = item;
		String temp = "";
		for (int i = 0; i < items.length ; i++) {
			for (int j = i + 1; j < items.length; j++) {
				if (items[i].compareTo(items[j]) > 0) {
					temp = items[i];
					items[i] = items[j];
					items[j] = temp;
				}
			}
			
			
		}
		for (int i = 0; i < items.length -1; i++) {
			System.out.print(items[i] + ", ");
		}
		System.out.println(items[items.length-1]);
	}
}
public class Selectionsort {
	public static void main(String[] args) {
		Sort so = new Sort();

		try {
			String s = "";
			Scanner scan = new Scanner(new File("hello.txt"));
			while(scan.hasNext()) {
				String t = scan.next();

					s += t + " ";


			}
			String[] str = s.split(" ");
			so.sort(str);

			
		} catch(Exception ex) {
			System.out.println("file not found" + ex);
		}
	}
}