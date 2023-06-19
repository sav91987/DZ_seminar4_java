// 2. Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

package Solutions;

import java.util.LinkedList;
import java.util.Scanner;

public class task2 {

    public static LinkedList<Integer> fillArray() {

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        return list;
    }

    private static void enqueue(int numb) {

        LinkedList<Integer> ll = fillArray();
        System.out.println("Исходный список: " + ll);
        ll.add(numb);                                           // Добавляем элемент в конец списка
        System.out.println("Итоговыйсписок: " + ll);
    }

    private static void dequeue() {

        LinkedList<Integer> ll = fillArray();
        System.out.println("Исходный список: " + ll);
        ll.removeFirst();                                       // Удаляем первый элемент списка
        System.out.println("Итоговый список: " + ll);
    }

    private static void first() {

        LinkedList<Integer> ll = fillArray();
        System.out.println("Исходный список: " + ll);
        System.out.println("Первый элемент: " + ll.getFirst()); // Полусаем первый элемент, без удаления
    }

    public static void mainProgramm() {

        boolean flag = true;
        while (flag) {

            Scanner scan = new Scanner(System.in);
            System.out.println(
                    "Выберите пункт меню: \n\t1. - Метод enqueue()\n\t2. - Метод dequeue()\n\t3. - Метод first()\n\t4. - Закончить работу");
            int value = scan.nextInt();

            switch (value) {
                case 1:
                    System.out.println("Введите число");
                    int numb = scan.nextInt();
                    enqueue(numb);
                    break;
                case 2:
                    dequeue();
                    break;
                case 3:
                    first();
                    break;
                case 4:
                    flag = false;
                    scan.close();
                    break;
            }
        }
    }
}
