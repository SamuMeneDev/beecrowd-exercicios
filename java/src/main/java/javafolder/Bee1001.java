package javafolder;
import java.util.Scanner;
public class Bee1001 {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("X = "+(a+b));
        in.close();
    }
}
