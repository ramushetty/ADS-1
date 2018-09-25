// public class Percolation {
//    public Percolation(int n)                // create n-by-n grid, with all sites blocked
//    public    void open(int row, int col)    // open site (row, col) if it is not open already
//    public boolean isOpen(int row, int col)  // is site (row, col) open?
//    public boolean isFull(int row, int col)  // is site (row, col) full?
//    public     int numberOfOpenSites()       // number of open sites
//    public boolean percolates()              // does the system percolate?
// }


// You can implement the above API to solve the problem
import java.util.Scanner;
class Percolation {
	private boolean[][] grid;
	private int size;
	WeightedQuickUnionUF obj;
	Percolation(final int size) {
		grid = new boolean[size][size];
		this.size = size;
		obj = new WeightedQuickUnionUF(size * size + 2);
	}
	public boolean ispercolate() {
		return obj.connected(size * size , size * size + 1);
	}
	public void open(final int row, final int column){
		if(grid[row][column]){
			return;
		}
		grid[row][column] = true;
		if(row == 0) {
			obj.union(convert(row, column), size * size);
		}
		if(row == size - 1) {
			obj.union(convert(row, column), size * size + 1);
		}
		if(row < size - 1 && grid[row + 1][column]) { //bottom element
			obj.union(convert(row, column), convert(row + 1, column));
		}
		if(row > 0 && grid[row - 1][column]) { //top element
			obj.union(convert(row, column), convert(row - 1, column));
		}
		if(column > 0 && grid[row][column - 1]){ //left element
			obj.union(convert(row, column), convert(row, column - 1));
		}
		if(column < size - 1 && grid[row][column + 1]){ //right element
			obj.union(convert(row, column), convert(row, column + 1));
		}
	
	}
	public int convert(final int i , final int j) {
		return i * size + j;
	}
}
public class Solution {
	Solution() {
		//empty.
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int inp = Integer.parseInt(scan.nextLine());
		Percolation per = new Percolation(inp);
		while(scan.hasNextLine()) {
			String[] tokens = scan.nextLine().split(" ");
			per.open(Integer.parseInt(tokens[0]) - 1, Integer.parseInt(tokens[1]) - 1);
		}
		System.out.println(per.ispercolate());
	}
}