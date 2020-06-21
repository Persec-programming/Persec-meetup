package iamAwesh.github.io;
import java.util.Scanner;
public class Datetime {
    public static void main(String[] args) {
        Scanner ak = new Scanner(System.in);
        System.out.println("Enter current time in HH:MM:SS formet");
        String time = ak.nextLine();
        System.out.println("Enter current date in DD/MM/YY formet");
        String date = ak.nextLine();
        System.out.println("time is" + time);
        System.out.println("Date is" + date);
    }
}
