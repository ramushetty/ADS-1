


import java.util.Scanner;
/**
 * Class for percolation.
 */
class Percolation {
	/**
	 * { boolean 2D array }.
	 */
	private boolean[][] grid;
	/**
	 * { size of array }.
	 */
	private int size;
	WeightedQuickUnionUF obj;
	/**
	 * Constructs the object.
	 *
	 * @param      size  The size
	 */
	Percolation(final int size) {
		grid = new boolean[size][size];
		this.size = size;
		obj = new WeightedQuickUnionUF(size * size + 2);
	}
	/**
	 * { checks percolate or not}.
	 *
	 * @return     { return true or false }
	 */
	public boolean ispercolate() {
		return obj.connected(size * size, size * size + 1);
	}
	/**
	 * { opens the block sites }.
	 *
	 * @param      row     The row
	 * @param      column  The column
	 */
	public void open(final int row, final int column) {
		if(grid[row][column]) {
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
		if(column > 0 && grid[row][column - 1]) { //left element
			obj.union(convert(row, column), convert(row, column - 1));
		}
		if(column < size - 1 && grid[row][column + 1]) { //right element
			obj.union(convert(row, column), convert(row, column + 1));
		}
	
	}
	/**
	 * { converts to single array }.
	 *
	 * @param      i     { row }
	 * @param      j     { column }
	 *
	 * @return     { returns true or not }
	 */
	public int convert(final int i , final int j) {
		return i * size + j;
	}
}
/**
 * Class for solution.
 */
public class Solution {
	/**
	 * Constructs the object.
	 */
	Solution() {
		//empty.
	}
	/**
	 * { main function }.
	 *
	 * @param      args  The arguments
	 */
	public static void main(final String[] args) {
		Scanner scan = new Scanner(System.in);
		int inp = Integer.parseInt(scan.nextLine());
		Percolation per = new Percolation(inp);
		while (scan.hasNextLine()) {
			String[] tokens = scan.nextLine().split(" ");
			per.open(Integer.parseInt(
				tokens[0]) - 1, Integer.parseInt(tokens[1]) - 1);
		}
		System.out.println(per.ispercolate());
	}
}