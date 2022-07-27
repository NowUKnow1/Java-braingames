package hexlet.code;

import  java.util.Scanner;

public class Cli {
    public static String getName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("May I Have your name?");
        String userName = sc.next();
        return userName;
    }
}
