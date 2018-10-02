import java.util.Scanner;
import java.util.Arrays;
/**
 * Class for teams.
 */
class Teams {
    /**
     * team name.
     */
    private String teamname;
    /**
     * wins of team.
     */
    private int wins;
    /**
     * losses.
     */
    private int losses;
    /**
     * draws.
     */
    private int draws;
    /**
     * Constructs the object.
     *
     * @param      name  The name
     * @param      win   The window
     * @param      loss  The loss
     * @param      draw  The draw
     */
    Teams(final String name, final int win, final int loss, final int draw) {
        teamname = name;
        wins = win;
        losses = loss;
        draws = draw;
    }
    /**
     * compares two teams.
     *
     * @param      items  The items
     *
     * @return     returns -1 or 1 or 0
     */
    public int compareTo(final Teams items) {
        if (this.wins == items.wins && this.losses == items.losses) {
            if (this.draws < items.draws) {
                return 1;
            }
        }
        if (this.wins == items.wins) {
            if (this.losses > items.losses) {
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
    /**
     * returns teamname.
     *
     * @return     { teamname}
     */
    public String getteamname() {
        return teamname;
    }

}
/**
 * Class for leadboard.
 */
class Leadboard {
    /**
     * array of teams.
     */
    private Teams[] teams;
    /**
     * size of teams.
     */
    private int size;
    /**
     * selectionsort calling.
     */
    private Insertionsort so;
    /**
     * Constructs the object.
     */
    Leadboard() {
        teams = new Teams[2 + 2];
        size = 0;
        so = new Insertionsort();
    }

    /**
     * adds team to a leadboard.
     *
     * @param      item  The item
     */
    public void add(final Teams item) {
        if (teams.length == size) {
            resize();
        }
        teams[size++] = item;
    }
    /**
     * increses the size of array.
     */
    public void resize() {
        teams = Arrays.copyOf(teams, teams.length * 2);
    }
    /**
     * calling sort function.
     */
    void sort() {
        so.sort(teams, size);
    }

}
/**
 * Class for selectionsort.
 */
class Insertionsort {
    /**
     * sorts the teams.
     *
     * @param      items  The items
     * @param      size   The size
     * time complexity is O(N^2)
     */
    void sort(final Teams[] items, final int size) {
        for (int i = 1; i < size; i++) {
            int min = i;
            int j = i - 1;
            while (j >= 0) {
                if (items[i].compareTo(items[j]) < 0) {
                    break;
                }
                items[j + 1] = items[j];
                j = j - 1;
            }
            items[j + 1] = items[min];
            
        }
        for (int i = 0; i < size - 1; i++) {
            System.out.print(items[i].getteamname() + ",");
        }
        System.out.println(items[size - 1].getteamname());
    }

}
/**
 * Solution class.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //empty.
    }
    /**
     * main function.
     * time complexity is O(N)
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        // Teams team = new Teams();
        Leadboard board = new Leadboard();
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            String[] tokens = scan.nextLine().split(",");
            board.add(new Teams(tokens[0], Integer.parseInt(
tokens[1]), Integer.parseInt(tokens[2]), Integer.parseInt(tokens[2 + 1])));
        }
        board.sort();
    }
}
