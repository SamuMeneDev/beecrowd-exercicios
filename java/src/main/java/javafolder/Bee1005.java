package javafolder;
import java.util.Scanner;
public class Bee1005 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        double n1, n2, media;
        n1 = in.nextDouble();
        n2 = in.nextDouble();
        media = ((n1*3.5) + (n2*7.5)) / 11;
        System.out.println("MEDIA = "+String.format("%.5f", media));
        in.close();
    }
}
