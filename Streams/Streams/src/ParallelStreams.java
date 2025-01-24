import java.util.Arrays;

public class ParallelStreams {
    public static void main(String[] args){
        int[] intArray = new int[10000000];
        Arrays.fill(intArray, 2);

        // using sequential streams
        long startTime = System.currentTimeMillis();
        long sum = Arrays.stream(intArray)
                .mapToLong(num -> num * num)
                .sum();
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);


        // using parallel streams (taking more time)
        long startTimeP = System.currentTimeMillis();
        long sumP = Arrays.stream(intArray)
                .parallel()
                .mapToLong(num -> num * num)
                .sum();
        long endTimeP = System.currentTimeMillis();
        System.out.println(endTimeP - startTimeP);
    }
}
