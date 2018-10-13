import java.util.Scanner;
import java.util.*;
import java.lang.*; 
import java.io.*;
public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Stocks> stocks = new ArrayList<Stocks>();
        int count = Integer.parseInt(scan.nextLine());
        int  counter = 0;
        for (int p = 1; p < count * 6 + 2; p++) {
            String[] tokens = scan.nextLine().split(",");
            stocks.add(new Stocks(tokens[0], tokens[1]));
            // stocks.sort( Comparator.comparing( String::toString ).reversed() ); 

            if (p % count == 0) {
                
                stocks.sort((o1, o2) -> o2.getvalue().compareTo(o1.getvalue()));
                int dec = 0;

                for(Stocks str: stocks){
                    if (dec  < 5) {
                        System.out.println(str.getcompanyname() +" " + Double.parseDouble(str.getvalue()) + " ==============");
                        dec++;
                    }
                }
                System.out.println();
                stocks.sort((o1, o2) -> o1.getvalue().compareTo(o2.getvalue()));
                dec = 0;

                for(Stocks str: stocks){
                    if (dec  < 5) {
                        System.out.println(str.getcompanyname() +" " + Double.parseDouble(str.getvalue()) + " ==============");
                        dec++;
                    }
                }
                System.out.println();

                counter = 0;
                stocks.clear();
                                   

            }
        }

    }
}
class Stocks {
    String companyname;
    String value;
    Stocks(String companyname, String value) {
        this.companyname = companyname;
        this.value = value;
    }
    public String getcompanyname() {
        return companyname;
    }
    public String getvalue() {
        return value;
  
    }

}

