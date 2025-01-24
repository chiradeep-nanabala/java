import java.util.ArrayList;
import java.util.List;

public class TraditionalVsStreamExample {

    void sumOfEvenSquaresTraditional(){
        List<Integer> numbers = new ArrayList<Integer>();
        for(int i = 1; i <= 5; i++){
            numbers.add(i);
        }

        int sumOfSquares = 0;
        for(int num: numbers){
            if(num % 2 == 0){
                int square = num * num;
                sumOfSquares += square;
            }
        }
        System.out.println("Sum of squares" + sumOfSquares);
    }

    void sumOfEvenSquaresStream(){
        List<Integer> numbers = new ArrayList<Integer>();
        for(int i = 1; i <= 5; i++){
            numbers.add(i);
        }

        int sumOfSquares_Stream = numbers.stream()
                .filter(number -> number % 2 == 0)
                .mapToInt(number -> number * number)
                .sum();

        System.out.println(sumOfSquares_Stream);
    }
}
