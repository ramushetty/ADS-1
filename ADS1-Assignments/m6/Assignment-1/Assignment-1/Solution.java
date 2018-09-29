import java.util.Scanner;
class AddLargeNumbers {
    public static LinkedList numberToDigits(String number) {
    	LinkedList list = new LinkedList();

    	String[] numbers = number.split("");
    	for (int i = 0; i < numbers.length; i++) {
    		int tem = Integer.parseInt(numbers[i]);
    		list.insertlast(tem);
    	}
    	return list;

    }

    public static String digitsToNumber(LinkedList list) {
    	Node temp = list.first;
    	String str = "";
    	while(temp.next != null) {
    		str += temp.data;
    	}
    	str += temp.data;
    	return str;
    }

    public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) {
    	return list1;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String p = sc.nextLine();
        String q = sc.nextLine();
        switch(input){
            case "numberToDigits":
                LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
                LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
                System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
                System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
                break;

            case "addLargeNumbers":
                pDigits = AddLargeNumbers.numberToDigits(p);
                qDigits = AddLargeNumbers.numberToDigits(q);
                LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits, qDigits);
                System.out.println(AddLargeNumbers.digitsToNumber(result));
                break;
        }
    }
    
}
