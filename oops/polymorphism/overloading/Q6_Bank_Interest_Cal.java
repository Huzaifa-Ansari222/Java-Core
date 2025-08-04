package oops.polymorphism.overloading;

public class Q6_Bank_Interest_Cal {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Case 1: Principal and rate only (default time = 1 year)
        double simpleInterest = bank.calculateInterest(10000, 5);
        System.out.println("Simple Interest (1 year): " + simpleInterest);

        // Case 2: Principal, rate, and time
        double interestFor3Years = bank.calculateInterest(10000, 5, 3);
        System.out.println("Simple Interest (3 years): " + interestFor3Years);

        // Case 3: Compound interest with frequency
        double compoundInterest = bank.calculateInterest(10000, 5, 3, 4); // Quarterly
        System.out.println("Compound Interest (3 years, quarterly): " + compoundInterest);

    }
}
class Bank{

    // Overload 1: Principal and rate only, time is 1 year (Simple Interest)
    double calculateInterest(double principal, double rate) {
        int time = 1;
        return (principal * rate * time) / 100;
    }

    // Overload 2: Principal, rate, and time (Simple Interest)
    double calculateInterest(double principal, double rate, int time) {
        return (principal * rate * time) / 100;
    }

    // Overload 3: Compound Interest with frequency
    double calculateInterest(double principal, double rate, int time, int frequencyPerYear) {
        double compoundAmount = principal * Math.pow((1 + (rate / (100.0 * frequencyPerYear))), frequencyPerYear * time);
        return compoundAmount - principal;
    }

}

