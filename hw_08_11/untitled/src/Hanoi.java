import java.util.Scanner;

public class Hanoi {
    static void hanoi(int n, char start, char temp, char end) {
        if (n == 1) {
            System.out.println(n + " Из " + start + " в " + end);
            return;
        }
        hanoi(n - 1, start, end, temp);
        System.out.println(n + " Из " + start + " в " + end);
        hanoi(n - 1, temp, start, end);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        hanoi(n, 'A', 'B', 'C');
    }
}
