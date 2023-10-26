import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("Выберите номер задания\n 1 - первое задание;\n 2 - второе задание;\n 3 - третье задание;\n 0 - выход из программы");
            String input = scanner.next();
            try {
                int choose = Integer.parseInt(input);
                switch (choose) {
                    case 0: {
                        exit = true;
                        break;
                    }
                    case 1: {
                        System.out.print("Введите число: ");
                        int number = scanner.nextInt();
                        if (number > 7) {
                            System.out.println("Привет");
                        }
                        break;
                    }
                    case 2: {
                        System.out.print("Введите имя: ");
                        String name = scanner.next();
                        if (name.equals("Вячеслав")) {
                            System.out.print("Привет, Вячеслав\n");
                        } else {
                            System.out.println("Нет такого имени");
                        }
                        break;
                    }
                    case 3: {

                        Random random = new Random();
                        System.out.print("Введите количество элементов массива: ");
                        int array_size = scanner.nextInt();
                        int[] array = new int[array_size];
                        for (int i = 0; i < array.length; i++) {
                            array[i] = random.nextInt(1, 100);
                            if (array[i] % 3 == 0) {
                                System.out.print("Элементы массива кратные 3: " + array[i] + "\n");
                            }

                        }
                        break;
                    }
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Некорректный ввод. Попробуйте еще раз.");
            }


        }
    }
}