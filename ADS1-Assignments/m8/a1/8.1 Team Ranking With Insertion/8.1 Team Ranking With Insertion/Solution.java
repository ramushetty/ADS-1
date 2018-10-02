import java.util.Scanner;
import java.util.Arrays;
class Teams {
	String teamname;
	int wins;
	int losses;
	int draws;
	Teams(String name, int win, int loss, int draw) {
		teamname = name;
		wins = win;
		losses = loss;
		draws = draw;
	}
	public int compareTo(Teams items) {
		if (this.wins == items.wins && this.losses == items.losses) {
			if (this.draws < items.losses) {
				return 1;
			} 
			return -1;
		}
		if (this.wins == items.wins) {
			if(this.losses > items.losses) {
				return 1;
			} else {
				return -1;
			}
		}
		if (this.wins < items.wins) {
			return 1;
		}
		return 0;
		

	}
	public String getteamname() {
		return teamname;
	}

}
class Leadboard {
	Teams[] teams;
	int size;
	selectionsort so;
	Leadboard() {
		teams = new Teams[10];
		size = 0;
		so = new selectionsort();
	}
	public void add(Teams item) {
		if (teams.length >= size) {
			resize();
		}
		teams[size++] = item;
	}
	public void resize() {
		teams = Arrays.copyOf(teams, teams.length*2);
	}
	void sort() {
		so.sort(teams);
	}

}
class selectionsort {
	void sort(Teams[] items) {
		for (int i = 0; i < items.length; i++) {
			int min = i;
			for (int j = i + 1; j < items.length; j++) {
				if (items[min].compareTo(items[j]) > 0) {
					System.out.println(items[j].getteamname());
					min = j;
				}

			}
			Teams temp = items[min];
			items[min] = items[i];
			items[i] = temp;
		}
		for (int i = 0; i < items.length; i++) {
			System.out.println(items[i].getteamname() + ",");
		}
	}

}

public final class Solution {
	private Solution() {
		//empty.
	}
	public static void main(String[] args) {
		// Teams team = new Teams();
		Leadboard board = new Leadboard();
		Scanner scan = new Scanner(System.in);
		while (scan.hasNextLine()) {
			String[] tokens = scan.nextLine().split(",");
			board.add(new Teams(tokens[0], Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]), Integer.parseInt(tokens[2 + 1])));
		}
		board.sort();
	}
}