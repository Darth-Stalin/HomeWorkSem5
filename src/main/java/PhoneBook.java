import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map) {
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }

    public static void printBook(Map<String, ArrayList<Integer>> map) {
        for (var item : map.entrySet()) {
            String phones = "";
            for (int el : item.getValue()) {
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }

    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber("Арисова Евгения", 852, bookPhone);
        addNumber("Арисова Евгения", 89562, bookPhone);
        addNumber("Арисова Евгения", 7539512, bookPhone);
        addNumber("Шеймов Игорь", 15268, bookPhone);
        addNumber("Шеймов Игорь", 1745689, bookPhone);
        addNumber("Бодулев Сергей", 2345678, bookPhone);
        printBook(bookPhone);
    }
}
