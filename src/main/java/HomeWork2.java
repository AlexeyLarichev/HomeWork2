public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println(work1(2, 8));
        work2(47);
        System.out.println(work3(12));
        work4("Juice", 9);
        System.out.println(work5 (761));

    }

    public static boolean work1(int a, int b) {

        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        }
        return false;
    }

    public static void work2(int c) {
        if (c >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отприцательное");
        }
    }

    public static boolean work3(int d) {
        if (d >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void work4(String str, int v) {
        for (int i = 1; i <= v; i++) {
            System.out.println("[" + i + "]" + " " + str);
        }
    }
    public static boolean work5 (int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        else {
            return false;
        }

    }
}

