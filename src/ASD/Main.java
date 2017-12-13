package ASD;

public class Main {
    /*Урок 4. Динамическое программирование. Поиск возвратом
    1. *Количество маршрутов с препятствиями. Реализовать чтение массива с препятствием и
    нахождение количество маршрутов.
    Например, карта:
    1 1 1 1
    0 1 0 1
    0 1 1 1
    1 0 1 1
    */

    public static void main(String[] args) {
        int[][] arr = {{1, 1, 1, 1},{0, 1, 0, 1},{0, 1, 1, 1},{1, 0, 1, 1}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                if (arr[i][j] != 0){
                    arr[i][j] = arr[i][j-1] + arr[i-1][j];
                }
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
