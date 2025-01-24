import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUseCase2 {
    public static void main(String[] args){
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> squaredNumbers = nums.stream()
                .filter(n -> n % 2 == 0)    // Filter odd numbers
                .map(n -> n * n)    //  Double numbers
                .distinct() // Filter duplicate
                .peek(System.out::println)  // Debug (peek into stream)
                .collect(Collectors.toList());  // Collect results into list
        System.out.println(squaredNumbers);

        long count = nums.stream()
                .filter(n -> n > 5)
                .count();
        System.out.println(count);

        int sum = nums.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);
    }
}
