package by.it.sc02_morning.safronov.lesson05;

/*
Выведите на экран в цикле 10 раз фразу
Я изучаю программирование.

при  выводе сделайте такое разветвление в теле цикла,
чтобы вместо 3-й и 9-й по счету фраз выводилась фраза
Меня интересует высокая зарплата!

Должнен получиться следующий вывод строк:

Я изучаю программирование.
Я изучаю программирование.
Меня интересует высокая зарплата!
Я изучаю программирование.
Я изучаю программирование.
Я изучаю программирование.
Я изучаю программирование.
Я изучаю программирование.
Меня интересует высокая зарплата!
Я изучаю программирование.



 */
public class TaskA1 {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 10; i++) {
            if (i== 3 || i== 9) System.out.println("Меня интересует высокая зарплата!");
            else System.out.println("Я изучаю программирование.");

        }
    }
}
