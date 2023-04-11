import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        // Создаём массив
        int[] numbers = new int [7];

        Random random = new Random(); // Генерирует случайное число

        // Допишите условие цикла for, чтобы заполнить массив случайными тратами
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1000);
        }
        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.println("Выберите какое число вы хотите найти в массиве: \n наибольшее, наименьшее, среднее арифметическое");
        Scanner scanner = new Scanner(System.in);
        String action = scanner.nextLine();
        switch (action) {
            case "наибольшее" -> {
                int max = 0;
                for (int number : numbers) {
                    if (number > max)
                        max = number;

                }
                System.out.println("Наибольший элемент этого массива: " + max);
            }
            case "наименьшее" -> {
                int min = numbers [0];
                for (int number : numbers) {
                    if (number < min)
                        min = number;
                }
                System.out.println("Наименьший элемент этого массива: " + min);
            }
            case "среднее арифметическое" -> {
                double sum = 0;
                for (int number : numbers) {
                    sum += number;
                }
                double mid = sum / numbers.length;
                System.out.printf("Среднее арифметическое данного массива будет: " + "%.2f", mid);
            }
        }
    }
}
