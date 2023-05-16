public class LessonLv4_3 {
    public static void main(String[] args) {
        a();
        b();
        c();
    }

    public static void a() {
        System.out.println("Aだよ");
    }

    public static void b() {
        System.out.println("Bだよ");
    }

    public static void c() {
        a();
        b();
    }
}
