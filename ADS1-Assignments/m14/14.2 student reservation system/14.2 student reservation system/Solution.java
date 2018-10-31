import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 * Class for student.
 */
class Student implements Comparable<Student> {
    /**
     * student name.
     */
    private String studentName;
    /**
     * date of birth.
     */
    private Date dob;
    /**
     * subject1 marks.
     */
    private int marks1;
    /**
     * subject2 marks.
     */
    private int markss2;
    /**
     * subject3 marks.
     */
    private int marks3;
    /**
     * total marks.
     */
    private int totalmarks;
    /**
     * category.
     */
    private String category;
    /**
     * admission.
     */
    private boolean all;
    /**
     * Constructs the object.
     *
     * @param      name  The name
     * @param      dob1  The dob1
     * @param      markss1    The markss1
     * @param      markss2    The markss2
     * @param      marks3    The marks3
     * @param      totalmarkss     {Total marks}
     * @param      categoryy   The category
     */
    Student(final String name, final String dob1, final int markss1,
            final int markss2, final int marks3,
            final int totalmarkss, final String categoryy) {
        this.studentName = name;
        SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy");
        try {
            this.dob = sd.parse(dob1);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        this.marks1 = markss1;
        this.markss2 = markss2;
        this.marks3 = marks3;
        this.totalmarks = totalmarkss;
        this.category = categoryy;
        this.all = false;
    }
    /**
     * Gets the .
     * TC O(1).
     * @return     The .
     */
    public boolean getAllocation() {
        return this.all;
    }
    /**
     * Sets the .
     * Time complexity O(1).
     * @param      allot  The allot
     */
    public void setAllocation(final boolean allot) {
        this.all = allot;
    }
    /**
     * Gets the student name.
     * TC O(1).
     * @return     The student name.
     */
    public String getStudentName() {
        return this.studentName;
    }

    /**
     * Gets the markss1.
     * Time complexity O(1).
     * @return     The markss1.
     */
    public int getM1() {
        return this.marks1;
    }
    /**
     * Gets the markss2.
     * Time complexity  O(1).
     * @return     The m 2.
     */
    public int getM2() {
        return this.markss2;
    }
    /**
     * Gets the marks3.
     * Time complexity O(1).
     * @return     The m 3.
     */
    public int getM3() {
        return this.marks3;
    }
    /**
     * Gets the dob.
     * Time complexity O(1).
     * @return     The dob.
     */
    public Date getDOB() {
        return this.dob;
    }
    /**
     * Gets the reservation.
     * Time complexity O(1).
     * @return     The reservation.
     */
    public String getReservation() {
        return this.category;
    }
    /**
     * Gets the total.
     * Time complexity O(1).
     * @return     The total.
     */
    public int getTotal() {
        return this.totalmarks;
    }
    /**
     * compare.
     * Time complexity of  O(1).
     * @param      that  The that
     *
     * @return     {Int}
     */
    public int compareTo(final Student that) {
        if (this.getTotal() > that.getTotal()) {
            return -1;
        }
        if (this.getTotal() < that.getTotal()) {
            return 1;
        }
        if (this.getM3() > that.getM3()) {
            return -1;
        }
        if (this.getM3() < that.getM3()) {
            return 1;
        }
        if (this.getM2() > that.getM2()) {
            return -1;
        }
        if (this.getDOB().compareTo(that.getDOB()) < 0) {
            return 1;
        }
        if (this.getDOB().compareTo(that.getDOB()) > 0) {
            return -1;
        }
        return 0;
    }
    /**
     * Returns a string representation of the object.
     * Time complexity of this method is O(N).
     * @return     String representation of the object.
     */
    public String toString() {
        StringBuffer stringbuff = new StringBuffer();
        stringbuff.append(this.getStudentName() + ",");
        stringbuff.append(this.getTotal() + ",");
        stringbuff.append(this.getReservation());
        return stringbuff.toString();
    }
}
/**
 * Class for heap.
 */
final class Heap {
    /**
     * Constructs the object.
     */
    private Heap() {
        //emptyConstructor.
    }
    /**
     * sink method.
     * Time complexity  O(log(N)).
     * @param      a    {Comparable array}
     * @param      k     {Integer}
     * @param      n     {Integer}
     */
    private static void sink(final Comparable[] a,
                             final int k, final int n) {
        int l = k;
        while (2 * l <= n) {
            int j = 2 * l;
            if (j < n && less(a, j, j + 1)) {
                j++;
            }
            if (!less(a, l, j)) {
                break;
            }
            exch(a, l, j);
            l = j;
        }
    }
    /**
     * comparing.
     * TC O(1).
     * @param      a     {array}
     * @param      i     {int}
     * @param      j     {int}
     *
     * @return     {true or false}
     */
    private static boolean less(final Comparable[] a,
                                final int i, final int j) {
        return a[i - 1].compareTo(a[j - 1]) < 0;
    }
    /**
     * exchange.
     *  TC O(1).
     * @param      a     {array}
     * @param      i     {int}
     * @param      j     {int}
     */
    private static void exch(final Comparable[] a,
                             final int i, final int j) {
        Comparable swap = a[i - 1];
        a[i - 1] = a[j - 1];
        a[j - 1] = swap;
    }
    /**
     * {sort}.
     * TC O(Nlog(N)).
     * @param      a     {array}
     */
    public static void sort(final Comparable[] a) {
        int n = a.length;
        for (int k = n / 2; k >= 1; k--) {
            sink(a, k, n);
        }
        while (n > 1) {
            exch(a, 1, n--);
            sink(a, 1, n);
        }
    }

}
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //empty Constructor.
    }
    /**
     * main function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int vacancies = Integer.parseInt(scan.nextLine());
        int unreservedSeats = Integer.parseInt(scan.nextLine());
        int bcSeats = Integer.parseInt(scan.nextLine());
        int scSeats = Integer.parseInt(scan.nextLine());
        int stSeats = Integer.parseInt(scan.nextLine());

        Student[] students = new Student[n];
        for (int k = 0; k < n; k++) {
            String[] tokens = scan.nextLine().split(",");
            students[k] = new Student(tokens[0], tokens[1],
                                      Integer.parseInt(tokens[2]),
                                      Integer.parseInt(tokens[2 + 1]),
                                      Integer.parseInt(tokens[2 + 2]),
                                      Integer.parseInt(tokens[2 + 2 + 1]),
                                      tokens[2 + 2 + 2]);
        }
        Heap.sort(students);
        print(students);
        counselling(students, vacancies,
                    unreservedSeats, bcSeats, scSeats, stSeats);
    }
    /**
     * {print}.
     * TC O(N).
     * @param      s     {array}
     */
    public static void print(final Student[] s) {
        for (Student stu : s) {
            System.out.println(stu);
        }
        System.out.println();
    }
    /**
     * counselling method.
     * TC O(N^2).
     * @param      students         The students
     * @param      vacancies        The vacancies
     * @param      unreservedSeats  The unreserved seats
     * @param      bcSeats          The bc seats
     * @param      scSeats          The screen seats
     * @param      stSeats          The st seats
     */
    public static void counselling(final Student[] students,
                                   final int vacancies,
                                   final int unreservedSeats,
                                   final int bcSeats,
                                   final int scSeats,
                                   final int stSeats) {
        int i = 0;
        int k = 0;
        int n = students.length;
        int v = vacancies;
        int us = unreservedSeats;
        int bc = bcSeats;
        int sc = scSeats;
        int st = stSeats;
        Student[] alloted = new Student[v];
        for (i = 0; i < n; i++) {
            if (v == 0) {
                break;
            }
            if (us > 0) {
                us--;
                students[i].setAllocation(true);
                alloted[k++] = students[i];
                v--;
            }
            if (bc > 0) {
                if (!students[i].getAllocation()) {
                    if (students[i].getReservation().equals("BC")) {
                        bc--;
                        students[i].setAllocation(true);
                        alloted[k++] = students[i];
                        v--;
                    }
                }
            }
            if (sc > 0) {
                if (!students[i].getAllocation()) {
                    if (students[i].getReservation().equals("SC")) {
                        sc--;
                        students[i].setAllocation(true);
                        alloted[k++] = students[i];
                        v--;
                    }
                }
            }
            if (st > 0) {
                if (!students[i].getAllocation()) {
                    if (students[i].getReservation().equals("ST")) {
                        st--;
                        students[i].setAllocation(true);
                        alloted[k++] = students[i];
                        v--;
                    }
                }
            }
        }
        for (i = 0; i < n; i++) {
            if (!students[i].getAllocation()) {
                if (v > 0 && students[i].getReservation().equals("Open")) {
                    students[i].setAllocation(true);
                    alloted[k++] = students[i];
                    v--;
                }
            }
        }
        Heap.sort(alloted);
        print(alloted);
    }
}
