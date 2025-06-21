import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        double presentValue = 6700.0; 
        double interestRate = 0.17; 
        int years = 10; 

        double futureValue = FinancialForecast.calculateFutureValue(presentValue, interestRate, years);
        System.out.println("Future Value Calculation using basic Recursion:");
        System.out.printf("Future Value after %d years: %.2f%n", years, futureValue);

        HashMap <Integer, Double> memo = new HashMap<>();
        futureValue = FinancialForecast.memoizedCalculateFutureValue(presentValue, interestRate, years, memo);
        System.out.println("\nFuture Value Calculation using Recursion and Memoization:");
        System.out.printf("Future Value after %d years: %.2f%n", years, futureValue);
    }
}
