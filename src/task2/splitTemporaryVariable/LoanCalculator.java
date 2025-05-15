package task2.splitTemporaryVariable;

public class LoanCalculator {

    public double calculateLoanInterest(double loanAmount,
                                        double annualInterestRate,
                                        int loanTermYears) {

        double interestRateDecimal = annualInterestRate / 100;
        double totalInterest = 0;

        double monthlyInterestRate = interestRateDecimal / 12;
        double numberOfPayments = loanTermYears * 12;

        for (int i = 0; i < numberOfPayments; i++) {
            totalInterest += loanAmount * monthlyInterestRate;
        }

        return totalInterest;
    }
    // Інші методи класу...
}
