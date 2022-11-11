public class Main {

    //     1
    void method (int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
    }
    // Лучший случай одна операция сравнения - если числа равны
    // Худший случай бесконечное выполнение цикла  - если одно из чисел отрицательно, оба отрицательные или одно из чисел 0)


    //     2
    void method(int n) {
        for (int i = 0; i < n / 2; i++) {                 // 1-й for сложность n/2
            for (int j = 1; j + n / 2 <= n; j++) {        // 2-й for сложность n/2
                for (int k = 1; k <= n; k = k * 2) {      // 3-й for сложность приблизительно Log n (при n = 1_000 - 10 итераций (Log_1000 = 9,9))
                    System.out.println("I am expert!");                                     //(при n = 1_000_000 - 20 итераций (Log_1_000_000 = 19,9))
                }
            }
        }
    }
    // константы не учитываем
    // В худшем случае O(n*n*Logn) или O(n^2 * Logn)


    //    доп 3
    void method3(int n) {
        for (int i = 1; i <= 100; i++) {                    // 1-й for сложность n
            for (int j = 1; j <= 100; j = j + i) {           // 2-й for сложность ???
                System.out.println("I am expert!");
            }
        }
    }

}