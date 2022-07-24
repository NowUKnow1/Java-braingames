package hexlet.code;

import  java.util.Scanner;

public class Cli {
    public static String getName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("May I Have your name?");
        String userName = sc.next();
        String result = userName;
        return result;
    }
}
