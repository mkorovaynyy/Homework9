import Service.RandomArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();

    }

    public static void task1() {
        System.out.println("Задача1");
        int[] array = RandomArray.generateRandomArray();
        int sum = 0;
        for (int waste : array) {
            sum += waste;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {
        System.out.println("Задача2");
        int[] array = RandomArray.generateRandomArray();
        Arrays.sort(array);
        int minWaste = array[0];
        int maxWaste = array[array.length - 1];
        System.out.println("Минимальная сумма трат за день составила " + minWaste + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maxWaste + " рублей");

    }

    public static void task3() {
        System.out.println("Задача3");
        int[] array = RandomArray.generateRandomArray();
        int sum = 0;
        for (int waste : array) {
            sum += waste;
        }
        int averageWaste = sum / array.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageWaste + " рублей");

    }

    public static void task4() {
        System.out.println("Задача4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}