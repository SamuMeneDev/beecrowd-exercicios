package javafolder;
import java.util.Scanner;
public class Bee1002 {
    public static void main(String[] args) {
        double PI = 3.14159;
        var in = new Scanner(System.in);
        double raio = in.nextDouble();

        double area = PI * (raio * raio);
        System.out.println("A="+String.format("%.4f", area));
        in.close();
    }
}
