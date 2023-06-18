package Solutions;

import java.util.LinkedList;

public class task1 {

    private static LinkedList<Integer> FillLinlList() {             // Наполняем список

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println("Исходный список: " + list);
        return list;
    }

    public static void reverseLinkList() {                          // Разворачиваем список
        LinkedList<Integer> linkList = FillLinlList();
        int len = linkList.size();
        int j = len;
        for (int i = 0; i < len; i++) {
            linkList.add(linkList.get(j - 1));                      // Добавляем в конец списка последний эемент с идексом j-1
            j--;                                                    // уменьшае j, чтобы на следующей итерации добавить в конец предпоследний
                                                                    // элемент
        }                                                           // Результат по окончании цикла [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0]

        for (int i = 0; i < len; i++) { // Удаляем ненужные элементы
            linkList.remove();
        }
        System.out.println("Перевернутый список: " + linkList);
    }
}
