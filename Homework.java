import java.util.ArrayList;
import java.util.List;


public class Homework {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("string");
        strings.add("40");
        strings.add("-5");
        strings.add("my_string");
        removeIntegers(strings);
        System.out.println(strings); 

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(8);
        numbers.add(9);
        removeEvenNumber(numbers);
        System.out.println(numbers); 
    }
    
    static void removeEvenNumber(List<Integer> numbers) {
        // TODO: 31.03.2023 Удалить все четные элементы из списка
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
            }
        }
    }
    
    static void removeIntegers(List<String> strings) {
        // TODO: 31.03.2023 Удалить строки, которые являются целыми числами
        for (int i = 0; i < strings.size(); i++) {
            try {
                Integer.parseInt(strings.get(i));
                strings.remove(i);
            } catch (NumberFormatException e) {
            }
        }
    }
}