import java.util.Scanner;
/**
 * Solution class.
 */
public final class Solution {
  /**
   * empty constructor.
   */
  private Solution() {
    //empty.
  }
  /**
   * main function.
   *
   * @param      args  The arguments
   */
  public static void main(final String[] args) {
    Scanner scan = new Scanner(System.in);
    LinkedList list = new LinkedList();
    int size = 0;
    while (scan.hasNextLine()) {
      String str = scan.nextLine();
      String[] tokens = str.split(" ");
      switch (tokens[0]) {
      case "insertAt":
        if (!list.insertAt(Integer.parseInt(
    tokens[1]), Integer.parseInt(tokens[2]))) {
          size++;
          System.out.println(list.tostring());
        }
        break;
      case "reverse":
        if (size == 0) {
          System.out.println(
            "No elements to reverse.");
          break;
        }
        list.reverse();
        System.out.println(list.tostring());
        break;
      default:
        break;
      }
    }
  }
}
