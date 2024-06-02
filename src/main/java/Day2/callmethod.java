package Day2;

import java.util.Scanner;

public class callmethod {


        public static void main(String [] args){
            var sc = new Scanner(System.in);

            System.out.println("Enter fullMark and Mark");
            double fullMark = sc.nextDouble();
            double mark = sc.nextDouble();

            double pct = method1.pctCalc(fullMark, mark);
            String status = method1.getStatus(pct);
            System.out.println("Your Status:" + status);
        }
    }