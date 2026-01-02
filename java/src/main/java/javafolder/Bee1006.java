package javafolder;

import java.util.Scanner;

public class Bee1006 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        double a, b, c, media;
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        media = ((a*2) + (b*3) + (c*5)) / 10;
        System.out.println("MEDIA = "+String.format("%.1f", media));
        in.close();
    }
}
