/*
2. Bank Account Simulation
Problem:
Create a BankAccount class with:
accountNumber (int)
balance (double)

Methods:
deposit(double amount) – Adds money to the balance.
withdraw(double amount) – Deducts money (ensure balance doesn’t go negative).
displayBalance() – Shows the current balance.

Test Case:
BankAccount acc = new BankAccount("123456", 5000);
acc.deposit(2000);
acc.withdraw(3000);
acc.displayBalance();
 */
package oops.class_object;
public class Q2_Bank_Sims {
    public static void main(String[] args) {
        System.out.println("---------------------------");
        BankAccount acc = new BankAccount(123456,50000); // creation of account or holder
        acc.deposit(0); // cash in
        acc.withdraw(6000); // cash out
        acc.displayBalance(); // show balance
        System.out.println("---------------------------");

    }
}
class BankAccount{
//    String name;
    int accountNumber;
    double balance ;

    BankAccount(int accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double depositAmt){
        if(depositAmt == 0 ){
            System.out.println("Nothing deposit:");
        }
        if(depositAmt > 0 ){
            System.out.println("Deposit ammount: "+depositAmt);
            balance = balance + depositAmt;
        }
        else{
            System.out.println("Enter valid ammount:");
        }
    }
    void withdraw(double withdrawAmt){
        if (withdrawAmt <= balance) { //5000 < 2000 x | 2000 < 5000
            System.out.println("Withdraw ammount: "+withdrawAmt);
            balance = balance - withdrawAmt;
        }
        else {
            System.out.println("insufficient ammount:");
        }
    }
    void displayBalance(){
        System.out.println("---------------------------");
        System.out.println("Account no: "+accountNumber);
        System.out.println("You Balance: "+balance);
    }
}

