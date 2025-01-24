import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {
    void usingMap(){
        List<String> words = Arrays.asList("Hello", "World");
        List<String> upperCased = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(upperCased);
    }

    void usingFlatMap(){
        List<List<Integer>> nestedList = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );

        List<Integer> flattenedList = nestedList.stream()
                .flatMap(List::stream)
                .map(n -> n*2)
                .collect(Collectors.toList());
        System.out.println("flattened list: " + flattenedList);
    }
}
