public class SummaChisel {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {
        System.out.println("Сумма 2 чисел: " + sum(5, 10));
        System.out.println("Сумма 3 чисел: " + sum(1, 2, 3));
        System.out.println("Сумма 4 чисел: " + sum(4, 5, 6, 7));
    }
}
