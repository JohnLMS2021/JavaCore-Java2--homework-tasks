package lesson4.homework;

import java.io.IOException;
import java.util.*;


public class MyHomework {
    static final String FILE_NAME1 = "D://IT/GeekBrains/уроки GeekBrains/Java/Java Core для тестировщиков/Материалы для уроков/src/main/java/lesson4/homework/Java2Lesson4Homework4.txt";
    static final String FILE_NAME2 = "Java2Lesson4Homework4.txt";

    /**
     * 1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список
     * уникальных слов, из которых состоит массив (дубликаты не считаем). Посчитать сколько раз встречается каждое
     * слово.
     * 2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
     * В этот телефонный справочник с помощью метода add() можно добавлять записи. С помощью метода get() искать
     * номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае
     * однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
     * Желательно как можно меньше добавлять своего, чего нет в задании (т.е. не надо в телефонную запись добавлять еще
     * дополнительные поля (имя, отчество, адрес), делать взаимодействие с пользователем через консоль и т.д.). Консоль
     * желательно не использовать (в том числе Scanner), тестировать просто из метода main() прописывая add() и get().
     */

    public static void main(String[] args) {
        // first homework item
        List<String> wordArray = new ArrayList<String>();
        wordArray = ArrayOperation.fillTheArray(wordArray);
        System.out.println(wordArray + "\n");
        ArrayOperation.printUniqueWords(wordArray);
        wordArray.clear();
        try {
            wordArray = ArrayOperation.fillTheArrayFromFile(wordArray, FILE_NAME2);
        } catch (IOException e) {
            System.out.println("Failed to fill array from file!\n");
        }
        try {
            wordArray = ArrayOperation.fillTheArrayFromFile(wordArray, FILE_NAME1);
        } catch (IOException e) {
            System.out.println("Failed to fill array from file!\n");
        }
        System.out.println(wordArray + "\n");
        ArrayOperation.printUniqueWords(wordArray);
        // second homework item
        Phonebook phonebook = new Phonebook();

        phonebook.add(2304578, "Ivanov");
        phonebook.add(5678794, "Ivanov");
        phonebook.add(3456783, "Petrov");
        phonebook.add(3456278, "Vainberg");
        phonebook.add(9786053, "Vlado");
        phonebook.add(6475893, "Sidor");

        phonebook.get("Ivanov");
        phonebook.get("Petrov");
        phonebook.get("Sidor");
        phonebook.get("Vainberg");
    }
}
