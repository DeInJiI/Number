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
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("Выберите какое число вы хотите найти в массиве: \n наибольшее, наименьшее, среднее арифметическое");
        Scanner scanner = new Scanner(System.in);
        String action = scanner.nextLine();
        switch (action) {
            case "наибольшее":
                int max = 0;
                for (int i = 0; i < numbers.length; i++) {
                    if (numbers[i] > max)
                        max = numbers[i];

                }
                System.out.println("Наибольший элемент этого массива: " + max);
                break;
            case "наименьшее":
                int min = 0;
                for (int i = 0; i < numbers.length; i++) {
                    if (numbers[i] > min)
                        min = numbers[i];
                }
                System.out.println("Наименьший элемент этого массива: " + min);
                break;
            case "среднее арифметическое":
                    double sum = 0;
                    for (int j = 0; j < numbers.length; j++) {
                        sum += numbers[j];
                    }
                    double mid = sum / numbers.length;
                System.out.printf("Среднее арифметическое данного массива будет: " + "%.2f",mid);
                break;
        }
    }
}
