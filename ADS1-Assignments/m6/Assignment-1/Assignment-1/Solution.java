import java.util.Scanner;
class AddLargeNumbers {
    public static LinkedList numberToDigits(String number) {
    	LinkedList list = new LinkedList();
    	if (number.length() == 1) {
    		list.insertlast(Integer.parseInt(number));
    		return list;

    	}
    	String[] numbers = number.split("");
    	for (int i = 0; i < numbers.length; i++) {
    		int tem = Integer.parseInt(numbers[i]);
    		list.insertlast(tem);
    	}
    	return list;

    }

    public static String digitsToNumber(LinkedList list) {
    	
    	
    	return list.tostring();
    }

    public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) {
    	LinkedList listtotal = new LinkedList();

    	Stack st1 = new Stack();
    	Stack st2 = new Stack();
    	Node ptr1 = list1.first;
        while (ptr1.next != null) {
         	st1.push(ptr1.data);
            ptr1 = ptr1.next;
        }
        st1.push(ptr1.data);

        Node ptr2 = list2.first;
        while (ptr2.next != null) {
         	st2.push(ptr2.data);
            ptr2 = ptr2.next;
        }
        st2.push(ptr2.data);
    	while (!st1.isempty()) {
    		int quot = 0;
    		int f1 = st1.pop();
    		int f2 = st2.pop();
    		int total = f1 + f2; 
    		if (total / 10 >= 0) {
    			listtotal.insertfirst(total % 10);
    			quot = total % 10;
    		} else {
    			listtotal.insertfirst(total + quot);

    		}

    	}
    	return listtotal;


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
