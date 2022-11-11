public class Main {
    public static int findIndex (int arr[], int value) {
        // TODO:
        //     1. Linear Search
        //    Given an array arr[] of N elements, the challenge is to write a function to find a given element x in arr[] .
        //    Линейный поиск используется для поиска ключевого элемента среди нескольких элементов.
        //    Линейный поиск сегодня используется меньше, потому что он медленнее, чем бинарный поиск и хеширование.
        //    Алгоритм:
        //    Шаг 1: Обход массива
        //    Шаг 2: Сопоставьте ключевой элемент с элементом массива
        //    Шаг 3: Если ключевой элемент найден, верните позицию индекса элемента массива.
        //    Шаг 4: Если ключевой элемент не найден, верните -1

        //int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //int x = 8;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
               return i;
            }
        }
        return -1;
    }
    // TODO:
    //  2. Find the element that appears once in a sorted array
    //  Given a sorted array in which all elements occur twice (one after the other) and one element appears only once.
    //  Простое решение состоит в обходе массива слева направо. Поскольку массив отсортирован, мы легко можем найти нужный элемент.
    //  Алгоритм:
    //  Шаг 1: Обход массива через один элемент
    //  Шаг 2: Если элемент отличается от первого то мы нашли не задублированный элемент
    //  Шаг 3: Вернем элемент или позицию в массиве
    //  Шаг 4: Если ключевой элемент не найден, верните -1 или что то еще :)
    //  …
    //  Шаг 5: Исправить ошибку ArrayIndexOutOfBoundsException

    public static int findElements(int arr[]){

        int element = -1;
        for (int i = 0; i < arr.length-1; i+=2) {
            if (arr[i]!=arr[i+1]){
                element=arr[i];
                i--;
            }
        }
        return element;
    }

    public static void main (String[] args) {
        // 1.
        System.out.println("задача 1");
        int arr[]=new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(findIndex(arr, 8));  // 8
        System.out.println(findIndex(arr, 11));  // -1
        System.out.println(findIndex(arr, -3));  // -1
        // 2.
        System.out.println("задача 2");
        int arr1[]= new int[]{1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10,10};
        System.out.println(findElements(arr)); //  9 (длина массива)
        System.out.println(findElements(arr1)); //  -1


        /*
        int[] a1 = new int[] { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 };
        int[] a2 = new int[] { 1, 1, 2, 3, 3, 4, 4, 5, 5 };
        int[] a3 = new int[] { 1, 2, 2, 3, 3, 4, 4, 5, 5 };
        int[] a4 = new int[] { 1, 1, 2, 2, 3, 3, 4, 4, 5 };
        int[] a5 = new int[] { 1 };

        System.out.println(task2(a1));
        System.out.println(task2(a2));
        System.out.println(task2(a3));
        System.out.println(task2(a4));
        System.out.println(task2(a5));

         */
    }

    /*
    public static int task2(int[] arr) {
        int l = arr.length;

        if (l == 1) {
            return arr[0];
        }

        if (arr[l - 1] != arr[l - 2]) {
            return arr[l - 1];
        }

        for (int i = 0; i < l - 1; i += 2) {
            if (arr[i] != arr[i + 1]) {
                return arr[i];
            }
        }

        return -1;
    }

     */

    }
