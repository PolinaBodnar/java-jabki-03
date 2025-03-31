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



//        // Первое больше. Второе больше или равны
//
//        int p1 = 20;
//        if (p1 > 30) {
//            System.out.println(p1);
//        } else if (p1 >= 10) {
//            System.out.println(p1);
//        }
//        for (int j = 0; j < 10; j++)
//            if (j == 9) {
//                System.out.println("Первое больше");
//            } else if (j >= 10) ;
//        {
//            System.out.println("Второе больше или Равны");
//        }



//        // Положительное,Отрицательное» или Равно нулю
//
//        int e = 11;
//        if (e > 0) {
//            System.out.println("Положительное");
//        } else if (e < 0) {
//            System.out.println("Отрицательное");
//        } else {
//            System.out.println("Равно нулю");
//        }



//        // Возраст 18
//
//        int ege = 18;
//        if (ege >= 18) {
//            System.out.println("Доступ разрешен");
//        } else {
//            System.out.println("Доступ запрещен");
//        }



//        // Мой пример
//
//        int num = 15;
//        if (num >= 10 && num <= 20) {
//            System.out.println("Число в диапазоне от 10 до 20.");
//        } else {
//            System.out.println("Число вне диапазона.");
//        }



//        //1.Тернарный оператор
//        int gg = 3;
//        System.out.println((gg > 0) ? "Положительное" : (gg < 0) ? "Отрицательное" : "Ноль");


//        //2.Тернарный оператор
//        int n1 = 7;
//        System.out.println((n1 % 3 == 0) || (n1 % 5 == 0) ? "Кратно" : "Не кратно");


//        //3.Тернарный оператор
//        int n2 = 7;
//        System.out.println((n2 % 2 == 0) ? "Четное" : "Нечетное");




//        // 1 switch
//        int day = 4;
//        switch (day) {
//            case 1:
//                System.out.println("ПН");
//                break;
//            case 2:
//                System.out.println("ВТ");
//                break;
//            case 3:
//                System.out.println("СР");
//                break;
//            case 4:
//                System.out.println("ЧТ");
//                break;
//            case 5:
//                System.out.println("ПТ");
//                break;
//            case 6:
//                System.out.println("Cб");
//                break;
//            case 7:
//                System.out.println("ВС");
//                break;
//            default:
//                System.out.println("Ошибка");
//
//        }


//        // 2 switch
//        int ball = 3;
//        switch (ball) {
//            case 1:
//                System.out.println("Где я?");
//                break;
//            case 2:
//                System.out.println("Причем тут чай?");
//                break;
//            case 3:
//                System.out.println("Продолжаем программу 'Войтивайти'");
//                break;
//            case 4:
//                System.out.println("Мама, я печатаю код!!!");
//                break;
//            case 5:
//                System.out.println("Java относится к JavaScript так же, как Сом к Сомали.");
//                break;
//            default:
//                System.out.println("Ошибка. Не удалось Войтивайти.");
//        }




//        // 1 for
//        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int sum = 0;
//        for (int nom : numbers) {
//            if (num % 2 == 0) {
//                sum += num;
//            }
//        }
//        System.out.println(sum);


//        // 2 for
//        int[] numbers = {10, 2, 3, 11, 13, 12, 22, 19};
//        int max = numbers[0];
//        for (int num : numbers) {
//            if (num > max) {
//                max = num;
//            }
//        }
//        System.out.println(max);


//        // 3 for
//        int n = 2;
//        for (int i = 1; i <= 10; i++) {
//            System.out.printf("%d x %d = %d%n", n, i, n * i);
//        }


//        // 4 for
//        for (int i = 10; i >= 1; i--) {
//            System.out.println(i);
//        }


//        // 5 for
//        int count = 0;
//
//        for (int i = 1; i<= 50; i++) {
//            if (i % 2 == 0) {
//                count++;
//            }
//        }
//        System.out.println(count);




//        // 1 while
//        int number = 100;
//        int result = (number / 7 + 1) * 7;
//        System.out.println(result);


//        // 2 while
//        int i = 7;
//        long factorial = 1;
//        while (i > 1) {
//            factorial *= i;
//            i--;
//        }
//        System.out.println(factorial);

//        // 3 while
//        int n = 7;
//        if (n <= 1) {
//            System.out.println(n);
//        } else {
//            int i = 2;
//            while (i * i <= n) {
//                if (n % i == 0) {
//                    System.out.println(n + " не является простым числом.");
//                    return;
//                }
//                i++;
//            }
//            System.out.println(n + " является простым числом.");
//        }


//        // 4 while
//        int i = 100;
//        while (i > 5) {
//            System.out.println("Число: " + i);
//            i -= 25;
//        }


//        // 1 break & continue
//        for (int i = 1; i <= 20; i++) {
//            if (i % 3 == 0)
//                continue;
//            System.out.println(i);
//        }

//         // 2 break & continue
//         int[] numbers = {1, 2, 3, 4, 5, -1, 6, 7};
//         int sum = 0;

//         for (int num : numbers) {
//             if (num < 0) {
//                 break;
//             }
//             sum += num;
//         }
//             System.out.println(sum);



//        // 3 break & continue
//        int[] numbers = {20, 30, 25, 10, 50, 60, 15};
//        int sum = 0;
//
//        for (int num : numbers) {
//            sum += num;
//            if (sum > 100) {
//                break;
//            }
//        }
//        System.out.println(sum);





    }
}

