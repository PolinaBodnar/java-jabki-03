public class Main {
    public static void main(String[] args) {

        // Четное или не четное число
        int op = 5;
        if (op % 2 == 0) {
                System.out.println(op + " - Число четное");
            } else {
                System.out.println(op + " - Число нечетное");
            }

        // Первое больше. Второе больше или равны
        int p1 = 20;
        int p2 = 30;
        if (p1 > p2) {
            System.out.println("Первое больше");
        } else if (p1 < p2) {
            System.out.println("Второе больше");
        } else {
            System.out.println("Равны");
        }

        // Положительное,Отрицательное» или Равно нулю
        int e = 11;
        if (e > 0) {
            System.out.println("Положительное");
        } else if (e < 0) {
            System.out.println("Отрицательное");
        } else {
            System.out.println("Равно нулю");
        }

        // Возраст 18
        int age = 18;
        if (age >= 18) {
            System.out.println("Доступ разрешен");
        } else {
            System.out.println("Доступ запрещен");
        }

        // Мой пример
        int num7 = 15;
        if (num7 >= 10 && num7 <= 20) {
            System.out.println("Число в диапазоне от 10 до 20.");
        } else {
            System.out.println("Число вне диапазона.");
        }

        //1.Тернарный оператор
        int gg = 3;
        System.out.println((gg > 0) ? "Положительное" : (gg < 0) ? "Отрицательное" : "Ноль");

        //2.Тернарный оператор
        int n1 = 7;
        System.out.println((n1 % 3 == 0) || (n1 % 5 == 0) ? "Кратно" : "Не кратно");

        //3.Тернарный оператор
        int n2 = 7;
        System.out.println((n2 % 2 == 0) ? "Четное" : "Нечетное");

        // 1 switch
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("ПН");
                break;
            case 2:
                System.out.println("ВТ");
                break;
            case 3:
                System.out.println("СР");
                break;
            case 4:
                System.out.println("ЧТ");
                break;
            case 5:
                System.out.println("ПТ");
                break;
            case 6:
                System.out.println("Cб");
                break;
            case 7:
                System.out.println("ВС");
                break;
            default:
                System.out.println("Ошибка");
            }

        // 2 switch
        int score = 3;
        switch (score) {
            case 1:
                System.out.println("Где я?");
                break;
            case 2:
                System.out.println("Причем тут чай?");
                break;
            case 3:
                System.out.println("Продолжаем программу 'Войтивайти'");
                break;
            case 4:
                System.out.println("Мама, я печатаю код!!!");
                break;
            case 5:
                System.out.println("Java относится к JavaScript так же, как Сом к Сомали.");
                break;
            default:
                System.out.println("Ошибка. Не удалось Войтивайти.");
        }

         //1 for
        int[] numbers6 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum6 = 0;
        for (int num6 : numbers6) {
            if (num6 % 2 == 0) {
                sum6 += num6;
            }
        }
        System.out.println(sum6);

        // 2 for
        int[] numbers5 = {10, 2, 3, 11, 13, 12, 22, 19};
        int max = numbers5[0];
        for (int numy : numbers5) {
            if (numy > max) {
                max = numy;
            }
        }
        System.out.println(max);

        // 3 for
        int nt = 2;
        for (int k = 1; k <= 10; k++) {
            System.out.printf("%d x %d = %d%n", nt, k, nt * k);
        }

        // 4 for
        for (int j = 10; j >= 1; j--) {
            System.out.println(j);
        }

        // 5 for
        int count = 0;

        for (int h = 1; h<= 50; h++) {
            if (h % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);

        // 1 while
        int number3 = 100;
        int result = (number3 / 7 + 1) * 7;
        System.out.println(result);

        // 2 while
        int f = 7;
        long factorial = 1;
        while (f > 1) {
            factorial *= f;
            f--;
        }
        System.out.println(factorial);

        // 3 while
        int n = 7;
        if (n <= 1) {
            System.out.println(n);
        } else {
            int d = 2;
            while (d * d <= n) {
                if (n % d == 0) {
                    System.out.println(d + " не является простым числом.");
                    return;
                }
                d++;
            }
            System.out.println(n + " является простым числом.");
        }

        // 4 while
        int c = 100;
        while (c > 5) {
            System.out.println("Число: " + c);
            c -= 25;
        }

        // 1 break & continue
        for (int b = 1; b <= 20; b++) {
            if (b % 3 == 0)
                continue;
            System.out.println(b);
        }

         // 2 break & continue
         int[] numbers1 = {1, 2, 3, 4, 5, -1, 6, 7};
         int sumt = 0;

         for (int numt : numbers1) {
             if (numt < 0) {
                 break;
             }
             sumt += numt;
         }
             System.out.println(sumt);

        // 3 break & continue
        int[] numbers2 = {20, 30, 25, 10, 50, 60, 15};
        int sums = 0;
        for (int nums : numbers2) {
            sums += nums;
            if (sums > 100) {
                break;
            }
        }
        System.out.println(sums);

    }
}

