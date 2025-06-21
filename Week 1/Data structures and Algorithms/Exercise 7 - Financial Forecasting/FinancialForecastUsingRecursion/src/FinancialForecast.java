import java.util.HashMap;

public class FinancialForecast {
    public static double calculateFutureValue(double presentValue, double interestRate, int years) {
        if(years==0) {
            return presentValue;
        }
        return presentValue * Math.pow(1 + interestRate, years);
    }    

    public static double memoizedCalculateFutureValue(double presentValue, double interestRate, int years, HashMap<Integer, Double> memo) {
        if(years == 0) {
            return presentValue;
        }
        if (memo.containsKey(years)) {
            return memo.get(years);
        }
        double futureValue = presentValue * Math.pow(1 + interestRate, years);
        memo.put(years, futureValue);
        return futureValue;
    }
}
