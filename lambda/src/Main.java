import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1, 0, 5, 8, 9, 15, 26, 48, 96, 155, 999, -5, -55, -48);
        System.out.println(calculatingSumOfAllEvenElementsOfList(integers, a -> a % 2 == 0));

        List<String> stringsList = Arrays.asList("red", "yellow", "green", "blue", "purples", "white", "black");
        System.out.println(determiningLongestWordInList(stringsList, (a, b) -> (a.length() < b.length())));
    }

    /*
    Напишите программу, реализующую лямбда-выражение для вычисления суммы всех четных элементов списка.
    */
    public static Integer calculatingSumOfAllEvenElementsOfList(List<Integer> integers, Predicate<Integer> predicate){
        int sum = 0;
        for (Integer i : integers){
            if (predicate.test(i)) sum += i;
        }
        return sum;
    }


    /*
    Напишите программу, реализующую лямбда-выражение для определения самого длинного слова в списке,
    состоящего из нескольких слов.
    */
    public static String determiningLongestWordInList(List<String> stringsList, BiFunction<String, String, Boolean> bf){
        String result = "";
        for (String string : stringsList) {
            if (bf.apply(result, string)) result = string;
        }
        return result;
    }
}
