public class Main {
    public static void main(String[] args) {

        // Четное или не четное
        int i;
        for (i = 0; i <= 10; i++)
            if (i % 2 == 0) {
                System.out.println(i + " - Число четное");
            } else {
                System.out.println(i + " - Число нечетное");
            }



        // Первое больше. Второе больше или равны

        int p1 = 20;
        int p2 = 30;
        if (p1 > p2) { // вывели бы это (Первое больше) но оно не больше 30
            System.out.println("Первое больше");
        } else if (p1 < p2) { // выводим (Второе больше)
            System.out.println("Второе больше");
        } else {
            System.out.println("Равны"); // По умолчанию третье сравнение "Равны" если p1 p2 были бы одинаковыми, то проигнорировались первые 2 вывода
        }



        // Положительное,Отрицательное» или Равно нулю

        int e = 11;
        if (e > 0) { //больше 0, значит положительное
            System.out.println("Положительное");
        } else if (e < 0) { // меньше 0, значит отрицательное
            System.out.println("Отрицательное");
        } else {
            System.out.println("Равно нулю"); // В значении равно
        }



        // Возраст 18

        int ege = 18;
        if (ege >= 18) { // Определение возраста
            System.out.println("Доступ разрешен");
        } else {
            System.out.println("Доступ запрещен"); // Первые условия не соблюдены
        }



        // Мой пример

        int num = 15;
        if (num >= 10 && num <= 20) { // Проверка числа в заданном диапазоне и вывод
            System.out.println("Число в диапазоне от 10 до 20.");
        } else {
            System.out.println("Число вне диапазона."); // Условия диапазона не соблюдены
        }



        //1.Тернарный оператор
        int gg = 3;
        System.out.println((gg > 0) ? "Положительное" : (gg < 0) ? "Отрицательное" : "Ноль"); // Вывод первого условия, 3>0 положительное

        int negativeNumber = -5;
        System.out.println((negativeNumber > 0) ? "Положительное" : (negativeNumber < 0) ? "Отрицательное" : "Ноль"); // Вывод первого условия, -0,5 < 0 отрицательное

        int i = 0;
        System.out.println(i > 0 ? "Положительное" : (i < 0 ? "Отрицательное" : "Ноль"));




        //2.Тернарный оператор
        int n1 = 7;
        System.out.println((n1 % 3 == 0) || (n1 % 5 == 0) ? "Кратно" : "Не кратно"); //Выводим Крастно, Значение true, так как число делится и на 3 и на 5 крастно



        //3.Тернарный оператор
        int n2 = 7;
        System.out.println((n2 % 2 == 0) ? "Четное" : "Нечетное"); // Условие деления на 2, проверяет является ли число n2 четным.



        // 1 switch //Будет искать заданную переменную, пока не найдет из всех значений, break остановит поиск
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

        // 1.1 switch //Ошибка заданная переменная,не будет найдена
        int day = 10;
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
        int ball = 3;
        switch (ball) {
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




         1 for
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //Когда дан список чисел мы его в массив определяем
        int sum = 0;
        for (int num : numbers) { // Здесь идет перебор чисел из массива
            if (num % 2 == 0) { // Проверяем на четность, фильтруем числа
                sum += num; // Суммируем четные числа
            }
        }
        System.out.println(sum); // Выводим сумму всех четных чисел


        // 2 for
        int[] numbers = {10, 2, 3, 11, 13, 12, 22, 19};
        int max = numbers[0]; // Начинаем с первого числа массива
        for (int num : numbers) { // Перебор чисел из массива
            if (num > max) { // Определяем макимальное значение
                max = num; // Здесь идет сравнение кто  больше из чисел
            }
        }
        System.out.println(max);
//

        // 3 for Таблицу умножения ранее не видела как делают, поэтому не моя работа))
        int n = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", n, i, n * i);
        }


        // 4 for
        for (int i = 10; i >= 1; i--) { //начало с 10 далее уменьшение до 1
            System.out.println(i);
        }


        // 5 for
        int count = 0;

        for (int i = 1; i<= 50; i++) { // Начало от 1 до 50, увеличиваем на 1
            if (i % 2 == 0) { // Проверка на четность
                count++; // Счетчик, увеличивается при нахождении условий (четного числа)
            }
        }
        System.out.println(count);




        // 1 while
        int number = 100;
        int result = (number / 7 + 1) * 7; // Здесь какая-то жесть происходит: узнаем сколько раз 7 помещается в 100 плюсуем 1, потом все это умножаем на 7, чтобы получить крастное 7
        System.out.println(result);


        // 2 while // Здесь тоже пришлось смотреть, как фрактал находится в java
        int i = 7;
        long factorial = 1;
        while (i > 1) {
            factorial *= i;
            i--;
        }
        System.out.println(factorial);

        // 3 while
        int n = 7; //Число 11 будет простым
        if (n <= 1) { //Простыми числами считаются только числа больше 1
            System.out.println(n);
        } else {
            int i = 2; //Начало проверки с 2
            while (i * i <= n) { //Проверяем делители до квадратного корня числа n
                if (n % i == 0) { //Если n делится без остатка на i, значит, оно не простое, и программа завершается
                    System.out.println(n + " не является простым числом.");
                    return;
                }
                i++;
            }
            System.out.println(n + " является простым числом.");
        }


        // 4 while
        int i = 100;
        while (i > 5) { //Пока i больше 5, выполняем цикл
            System.out.println("Число: " + i);
            i -= 25; //Уменьшаем i на 25
        }


        // 1 break & continue
        for (int i = 1; i <= 20; i++) { //Начинаем 1 доходим до 20
            if (i % 3 == 0) //Проверяем числа делением на 3
                continue; //Продолжаем цикл пока все цифры не проверятся до 20
            System.out.println(i); //Вывод на печать всех цифр из диапазона 1-20, которые не делятся на 3
        }

         // 2 break & continue
         int[] numbers = {1, 2, 3, 4, 5, -1, 6, 7}; //Массив из рандомных чисел
         int sum = 0;

         for (int num : numbers) { //Перебираем числа массива
             if (num < 0) { //Если встретили отрицательное число прерываем цикл
                 break;
             }
             sum += num; //Добавляем каждое положительное число к сумме
         }
             System.out.println(sum);



        // 3 break & continue
        int[] numbers = {20, 30, 25, 10, 50, 60, 15}; //Массив из рандомных чисел
        int sum = 0; //Назначена переменная

        for (int num : numbers) { //Перебираем числа массива
            sum += num;  //Добавляем каждое число к сумме
            if (sum > 100) { //Как только превысит значение 100, останавливаем
                break;
            }
        }
        System.out.println(sum); //Вывод суммы, что получилось минимально от 100





    }
}

