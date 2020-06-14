package iamkamal.gitup.io;
import java.util.Scanner;

public class Timeprint {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println ("Enter current time in HH:MM formet");
        String time = kb.nextLine();
        System.out.println ("Enter current date in DD/MM/YY formet");
        String date = kb.nextLine();
        System.out.println ("time is"+time );
        System.out.println ("Date is"+date );
    }
}
