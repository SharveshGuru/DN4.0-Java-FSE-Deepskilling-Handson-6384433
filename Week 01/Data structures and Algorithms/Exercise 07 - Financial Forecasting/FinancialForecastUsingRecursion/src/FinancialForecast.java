import java.util.HashMap;

public class FinancialForecast {
    public static double calculateFutureValue(double presentValue, double interestRate, int years) {
        if(years==0) {
            return presentValue;
        }
        return calculateFutureValue(presentValue, interestRate, years-1) * (1 + interestRate);
    }    

    public static double memoizedCalculateFutureValue(double presentValue, double interestRate, int years, HashMap<Integer, Double> memo) {
        if(years == 0) {
            return presentValue;
        }
        if (memo.containsKey(years)) {
            return memo.get(years);
        }
        double futureValue = memoizedCalculateFutureValue(presentValue, interestRate, years-1, memo)*(1+ interestRate);
        memo.put(years, futureValue);
        return futureValue;
    }
}
