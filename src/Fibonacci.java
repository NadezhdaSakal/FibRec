import java.util.Scanner;

public class Fibonacci {

    private static long fibR(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fibR(n - 1) + fibR(n - 2);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите индекс:");
        int requiredElementIndex = scanner.nextInt();

        System.out.println(fibR(requiredElementIndex));
    }
}

