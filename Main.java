import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // =========================
    // 1. Класс с символом и текстом
    // =========================
    static class SymbolText {
        char symbol;
        String text;

        void setValue(char c) { symbol = c; }
        void setValue(String s) { text = s; }

        void setValue(char[] arr) {
            if (arr.length == 1) symbol = arr[0];
            else text = new String(arr);
        }
    }

    // =========================
    // 2. Статический счётчик
    // =========================
    static class Counter {
        private static int count = 0;

        static void showAndIncrement() {
            System.out.println("Counter = " + count);
            count++;
        }
    }

    // =========================
    // 3. Max, Min, Average
    // =========================
    static class MathUtils {
        static int max(int... n) {
            int m = n[0];
            for (int x : n) if (x > m) m = x;
            return m;
        }

        static int min(int... n) {
            int m = n[0];
            for (int x : n) if (x < m) m = x;
            return m;
        }

        static double average(int... n) {
            int s = 0;
            for (int x : n) s += x;
            return (double) s / n.length;
        }
    }

    // =========================
    // 4. Двойной факториал
    // =========================
    static class Factorial {
        static long doubleFactorial(int n) {
            long r = 1;
            for (int i = n; i > 0; i -= 2) r *= i;
            return r;
        }
    }

    // =========================
    // 5. Сумма квадратов
    // =========================
    static class SquaresSum {
        static long sumSquares(int n) {
            return (long) n * (n + 1) * (2L * n + 1) / 6;
        }
    }

    // =========================
    // 6. Копирование части массива
    // =========================
    static class ArrayUtils {
        static int[] copyPart(int[] arr, int n) {
            if (n >= arr.length) return arr.clone();
            return Arrays.copyOf(arr, n);
        }
    }

    // =========================
    // 7. Коды символов
    // =========================
    static class CharCodes {
        static int[] toCodes(char[] arr) {
            int[] r = new int[arr.length];
            for (int i = 0; i < arr.length; i++) r[i] = arr[i];
            return r;
        }
    }

    // =========================
    // 8. Среднее массива
    // =========================
    static class AverageArray {
        static double average(int[] arr) {
            int s = 0;
            for (int x : arr) s += x;
            return (double) s / arr.length;
        }
    }

    // =========================
    // 9. Перестановка символов
    // =========================
    static class ReverseChars {
        static void reverse(char[] arr) {
            for (int i = 0; i < arr.length / 2; i++) {
                char t = arr[i];
                arr[i] = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = t;
            }
        }
    }

    // =========================
    // 10. Min и Max
    // =========================
    static class MinMax {
        static int[] find(int... n) {
            int min = n[0], max = n[0];
            for (int x : n) {
                if (x < min) min = x;
                if (x > max) max = x;
            }
            return new int[]{max, min};
        }
    }

    // ==================================================
    // TIMUS 1293 — Eniya
    // ==================================================
    static class Timus1293 {
        static long solve(long n, long a, long b) {
            return 2 * n * a * b;
        }
    }

    // ==================================================
    // TIMUS 1639 — Chocolate 2
    // ==================================================
    static class Timus1639 {
        static String solve(int n, int m) {
            if ((n * m) % 2 == 0)
                return "[:=[first]";
            else
                return "[second]=:]";
        }
    }

    // =========================
    // MAIN — проверка ВСЕХ заданий
    // =========================
    public static void main(String[] args) {

        System.out.println("=== Задание 1 ===");
        SymbolText st = new SymbolText();
        st.setValue('X');
        st.setValue("Hello");
        System.out.println(st.symbol + " " + st.text);

        System.out.println("\n=== Задание 2 ===");
        Counter.showAndIncrement();
        Counter.showAndIncrement();

        System.out.println("\n=== Задание 3 ===");
        System.out.println("Max: " + MathUtils.max(2, 5, 1));
        System.out.println("Min: " + MathUtils.min(2, 5, 1));
        System.out.println("Avg: " + MathUtils.average(2, 5, 1));

        System.out.println("\n=== Задание 4 ===");
        System.out.println("5!! = " + Factorial.doubleFactorial(5));

        System.out.println("\n=== Задание 5 ===");
        System.out.println("Sum squares (5) = " + SquaresSum.sumSquares(5));

        System.out.println("\n=== Задание 6 ===");
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(ArrayUtils.copyPart(a, 3)));

        System.out.println("\n=== Задание 7 ===");
        System.out.println(Arrays.toString(CharCodes.toCodes(new char[]{'A', 'B'})));

        System.out.println("\n=== Задание 8 ===");
        System.out.println(AverageArray.average(a));

        System.out.println("\n=== Задание 9 ===");
        char[] c = {'a', 'b', 'c', 'd'};
        ReverseChars.reverse(c);
        System.out.println(Arrays.toString(c));

        System.out.println("\n=== Задание 10 ===");
        System.out.println(Arrays.toString(MinMax.find(9, 2, 7, 1)));

        System.out.println("\n=== TIMUS 1293 ===");
        System.out.println(Timus1293.solve(1, 2, 3));

        System.out.println("\n=== TIMUS 1639 ===");
        System.out.println(Timus1639.solve(2, 3));
    }
}
