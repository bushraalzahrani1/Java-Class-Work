import java.net.SocketOption;
import java.util.Scanner;

public class days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter day number");
        int day = sc.nextInt();

        if (day == 7 || day >= 1 && day <= 4) {
            System.out.println("work day");

        } else if (day == 5 || day == 6) {
            System.out.println(" off day");


        } else {
            System.out.printf("invalid");
        }

    }
}





