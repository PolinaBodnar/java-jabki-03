public class Main {
    public static void main(String[] args) {

        /* Дано число. Напишите программу, которая определяет, является ли оно четным или нечетным. */
        int op = 5;
        if (op % 2 == 0) {
            System.out.println(op + " - Число четное");
        } else {
            System.out.println(op + " - Число нечетное");
        }

        /* Даны два числа. Выведите «Первое больше», «Второе больше» или «Равны». */
        int p1 = 20;
        int p2 = 30;
        if (p1 > p2) {
            System.out.println("Сравнение чисел: Первое больше");
        } else if (p1 < p2) {
            System.out.println("Сравнение чисел: Второе больше");
        } else {
            System.out.println("Сравнение чисел: Равны");
        }

        /* Дано число. Выведите «Положительное», «Отрицательное» или «Равно нулю». */
        int e = 11;
        if (e > 0) {
            System.out.println("Число: Положительное");
        } else if (e < 0) {
            System.out.println("Число: Отрицательное");
        } else {
            System.out.println("Число: Равно нулю");
        }

        /* Дано число (возраст). Если возраст >= 18, выведите «Доступ разрешен», иначе — «Доступ запрещен. */
        int age = 18;
        if (age >= 18) {
            System.out.println("Доступ разрешен");
        } else {
            System.out.println("Доступ запрещен");
        }

        /* Придумать задачу. Задача: Дано число. Проверить, попадает ли число в диапазон от 10 до 20  */
        int num7 = 15;
        if (num7 >= 10 && num7 <= 20) {
            System.out.println("Число в диапазоне от 10 до 20");
        } else {
            System.out.println("Число вне диапазона");
        }

        /* Тернарный оператор. Дано число. Используя тернарный оператор, определите, положительное, отрицательное или нулевое */
        int gg = 3;
        System.out.println((gg > 0) ? "Определение числа: Положительное" : (gg < 0) ? "Определение числа: Отрицательное" : "Определение числа: Ноль");

        /* Тернарный оператор. Дано число. С помощью тернарного оператора проверьте, делится ли оно на 3 и 5 одновременно. Выведите «Кратно» или «Не кратно» */
        int n1 = 7;
        System.out.println((n1 % 3 == 0) && (n1 % 5 == 0) ? "Провека. Число: Кратно" : "Провека. Число: Не кратно");

        /* Тернарный оператор. Для заданного числа верните строку «Четное» или «Нечетное», используя тернарный оператор. */
        int n2 = 7;
        System.out.println((n2 % 2 == 0) ? "Заданое число: четное" : "Заданое число: нечетное");

        /* Дано число от 1 до 7. Выведите название дня недели. Если число вне диапазона, выведите «Ошибка» */
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Выбран день недели: ПН");
                break;
            case 2:
                System.out.println("Выбран день недели: ВТ");
                break;
            case 3:
                System.out.println("Выбран день недели: СР");
                break;
            case 4:
                System.out.println("Выбран день недели: ЧТ");
                break;
            case 5:
                System.out.println("Выбран день недели: ПТ");
                break;
            case 6:
                System.out.println("Выбран день недели: Cб");
                break;
            case 7:
                System.out.println("Выбран день недели: ВС");
                break;
            default:
                System.out.println("Ошибка");
        }

        /*  Дано число от 1 до 5. Выведите описание оценки (оцените свою работу) */
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

        /* Дан список чисел. Посчитайте сумму всех четных элементов */
        int sum6 = 0;
        for (int x = 0; x < 10; x++) {
            if (x % 2 == 0) {
                sum6 += x;
            }
        }
        System.out.println("Сумма всех четных элементов: " + sum6);

        /*  Дан список чисел. Найдите максимальное значение */
        int max = Integer.MIN_VALUE;
        for (int z = 0; z < 10; z++) {
             if (z > max) ; {
                 max = z;
             }
        }
        System.out.println("Максимальное значение: " + max);

        /* Дано число n. Выведите таблицу умножения для n от 1 до 10 */
        int nt = 2;
        for (int k = 1; k <= 10; k++) {
             System.out.printf("%d x %d = %d%n", nt, k, nt * k);
        }

        /* С помощью цикла for выведите числа от 10 до 1 в обратном порядке */
        for (int j = 10; j >= 1; j--) {
            System.out.println(j);
        }

        /* Найдите количество четных чисел в диапазоне от 1 до 50 */
        int count = 0;
        for (int h = 1; h <= 50; h++) {
            if (h % 2 == 0) {
                count++;
            }
        }
        System.out.println("Количество четных в диапазоне 1 до 50: " + count);

        /* Найдите наименьшее число больше 100, которое делится на 7 */
        int number3 = 100;
        int result = (number3 / 7 + 1) * 7;
        System.out.println("Наибольшее число после 100, делящиеся на 7: " + result);

        /* Дано число n. Вычислите его факториал через цикл while */
        int f = 7;
        long factorial = 1;
        while (f > 1) {
           factorial *= f;
             f--;
         }
        System.out.println("Значение фракториала: " + factorial);

        /* Дано число. Определите, является ли оно простым */
        int n = 7;
        if (n <= 0) {
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

        /* Придумать задачу самим. Задача: Выведи числа, начиная с 100 и уменьшая их на 25 в каждом цикле, пока переменная не станет меньше или равно 5 */
        int c = 100;
        while (c > 5) {
            System.out.println( c + " уменьшается на 25");
            c -= 25;
        }

        /* Выведите все числа от 1 до 20, кроме тех, что делятся на 3 */
        for (int b = 1; b <= 20; b++) {
            if (b % 3 == 0)
                continue;
            System.out.println(b);
        }

        /* Дан список чисел. Суммируйте элементы, пока не встретите отрицательное число */
        int[] numbers1 = {1, 2, 3, 4, 5, -1, 6, 7};
        int sumt = 0;
        for (int numt : numbers1) {
            if (numt < 0) {
                break;
            }
            sumt += numt;
        }
        System.out.println("После отрицательнго числа, сумма равна: " + sumt);

        /* Дан список чисел. Суммируйте элементы, пока сумма не превысит 100 */
        int[] numbers2 = {20, 30, 25, 10, 50, 60, 15};
        int sums = 0;
        for (int nums : numbers2) {
            sums += nums;
            if (sums > 100) {
                break;
            }
        }
        System.out.println("Минимальная сумма после 100: " + sums);

        }
    }


