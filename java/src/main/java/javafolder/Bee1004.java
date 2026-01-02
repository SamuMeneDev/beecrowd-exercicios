package javafolder;

import java.util.Scanner;

public class Bee1004 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println("PROD = "+(a*b));
        in.close();
    }
}
