import java.util.ArrayList;
import java.util.List;


public class Homework {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("string");
        strings.add("40");
        strings.add("-5");
        strings.add("my_string");
        //removeIntegers(strings);
        //System.out.println(strings);
        removeEvenNumber(strings);
        System.out.println(strings); // [string, my_string]
    }
    
    static void removeEvenNumber(List<String> strings) {
        // TODO: 31.03.2023 Удалить все четные элементы из списка
        for (int i = 1; i < strings.size(); i++) {
            if (i % 2 == 0) {
                strings.remove(i);
            }
            
        }
    }
    
    static void removeIntegers(List<String> strings) {
        // TODO: 31.03.2023 Удалить строки, которые являются целыми числами
    }
}