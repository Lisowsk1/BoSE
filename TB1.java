import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void ex1() {
        int n = sc.nextInt();

        long a = 0;
        long b = 1;
        long c;

        if (n == 0) {
            System.out.println(0);
        } else {
            for (int i = 2; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println(b);
        }
    }

    public static void ex2() {
        int n = sc.nextInt();
        boolean prime = true;

        if (n < 2) {
            prime = false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    prime = false;
                }
            }
        }

        if (prime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }
    }

    public static void ex3() {
        int n = sc.nextInt();
        int d = 2;

        while (n > 1) {
            if (n % d == 0) {
                System.out.print(d);
                n = n / d;
                if (n > 1) {
                    System.out.print(" * ");
                }
            } else {
                d++;
            }
        }
        System.out.println();
    }

    public static void ex4() {
        int n = sc.nextInt();
        int p = sc.nextInt();
        String result = "";

        if (n == 0) {
            result = "0";
        } else {
            while (n > 0) {
                result = (n % p) + result;
                n = n / p;
            }
        }

        System.out.println(result);
    }

    public static void ex5a() {
        double x = sc.nextDouble();
        int n = sc.nextInt();

        double sum = 0;
        double term = x;
        int sign = 1;
        int power = 1;

        while (power <= n) {
            sum = sum + sign * term;
            term = term * x * x / ((power + 1) * (power + 2));
            sign = -sign;
            power = power + 2;
        }

        System.out.println(sum);
    }

    public static void ex5b() {
        double x = sc.nextDouble();
        double epsilon = sc.nextDouble();

        double sum = 0;
        double oldSum;
        double term = x;
        int sign = 1;
        int power = 1;

        do {
            oldSum = sum;
            sum = sum + sign * term;
            term = term * x * x / ((power + 1) * (power + 2));
            sign = -sign;
            power = power + 2;
        } while (Math.abs(sum - oldSum) >= epsilon);

        System.out.println(sum);
    }

    public static void ex6a() {
        int n = sc.nextInt();
        double[] a = new double[n + 1];

        for (int i = n; i >= 0; i--) {
            a[i] = sc.nextDouble();
        }

        double x = sc.nextDouble();
        double w = 0;

        for (int i = 0; i <= n; i++) {
            w = w + a[i] * Math.pow(x, i);
        }

        System.out.println(w);
    }

    public static void ex6b() {
        int n = sc.nextInt();
        double[] a = new double[n + 1];

        for (int i = n; i >= 0; i--) {
            a[i] = sc.nextDouble();
        }

        double x = sc.nextDouble();
        double w = a[n];

        for (int i = n - 1; i >= 0; i--) {
            w = w * x + a[i];
        }

        System.out.println(w);
    }

    public static void main(String[] args) {
        int exercise = sc.nextInt();

        ex1();
        ex2();
        ex3();
        ex4();
        ex5a();
        ex5b();
        ex6a();
        ex6b();
    }
}
