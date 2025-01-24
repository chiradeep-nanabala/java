import java.util.Arrays;
import java.util.List;

class Transaction {
    private String category;
    private int amount;

    public Transaction(String category, int amount){
        this.category = category;
        this.amount = amount;
    }

    public String getCategory(){
        return category;
    }

    public int getAmount(){
        return amount;
    }
}

public class StreamUseCase1 {
    public static void main(String[] args){
        List<Transaction> transactions = Arrays.asList(
                new Transaction("Grocery", 2500),
                new Transaction("Entertainment", 1000),
                new Transaction("Utilities", 1000),
                new Transaction("Personal", 5000),
                new Transaction("Grocery", 50000)
        );

        // Total amount spent on groceries
        int amount = transactions.stream()
                .filter(c -> c.getCategory().equals("Grocery"))
                .mapToInt(Transaction::getAmount)
                .sum();
        System.out.println(amount);

        // Average expenses across all categories
        double averageExpense = transactions.stream()
                .mapToDouble(Transaction::getAmount)
                .average().orElse(0.0);
        System.out.println(averageExpense);
    }
}
