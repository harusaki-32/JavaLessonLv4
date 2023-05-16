import java.util.Scanner;

public class LessonLv4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("数値xを入力>");
        int x = sc.nextInt();
        System.out.print("数値yを入力>");
        int y = sc.nextInt();

        System.out.println("合計:" + sum(x, y));
        System.out.println("平均:" + avg(x, y));

        sc.close();
    }

    public static int sum(int x, int y) {
        return x + y;
    }

    public static int avg(int x, int y) {
        return (x + y) / 2;
    }
}
