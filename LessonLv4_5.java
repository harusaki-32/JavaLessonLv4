import java.util.Scanner;

public class LessonLv4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("底辺の長さ>");
        double base = sc.nextInt();
        System.out.print("高さ>");
        double height = sc.nextInt();

        System.out.println("面積は " + menseki(base, height));

        sc.close();
    }

    public static double menseki(double base, double height) {
        return base * height / 2;
    }
}
