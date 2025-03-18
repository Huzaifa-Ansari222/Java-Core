/*
 Create a ATM class with security checks

Properties: private cardNumber,private balance, pinCode .
Methods:
withdraw(double amount, int enteredPin) → checks if PIN is correct before withdrawal.
changePin(int oldPin, int newPin) → changes PIN only if old PIN matches.
Prevent direct access to balance and PIN.
 */
package oops.encapculation;

public class Q2_Atm_System {
    public static void main(String[] args) {
        Atm user1 = new Atm(111,20000,123);

        // BAD: Directly modifying the balance (No security)
        // user1.balance = 50000; //error because Its private if not private it direct change balance value

        //withdraw money
        user1.withdraw(2000,123);
        System.out.println();


        //change pin
        user1.changePin(123,321);//int oldPin, int newPin

        //2nd withdraw after pin change with wrong pin
        user1.withdraw(2000,123);
        //2nd withdraw after pin change with correct pin
        user1.withdraw(2000,321);

        // Checking balance using getter
        System.out.println("Final Balance: " + user1.getBalance());

    }

}

class Atm{
    private int cardNumber;
    private double balance;
    private int pincode;

    Atm(int cardNumber, double balance, int pincode) {
        this.cardNumber = cardNumber;
        this.balance = balance;
        this.pincode = pincode;
    }

    void withdraw(double amount, int enteredPin){
        if(enteredPin == pincode && amount <= balance){ //300 < 20,000
            System.out.println(amount+" INR withdraw");
            balance = balance - amount;
            System.out.println("Total balance: "+balance);
        }
        else {
            System.out.println("Invalid amount or PIN!!!:");
        }
    }

    //change pin Method
    // Setter for PIN (Controlled modification)
    void changePin(int oldPin, int newPin){
        if(oldPin == pincode){
//            System.out.println("new pin:"+newPin);
            pincode = newPin;
//            System.out.println("after new created"+pincode);
            System.out.println("PIN changed successfully!");
        }
        else{
            System.out.println("Incorrect PIN!!!");
        }
    }

    // Getter for balance (if private)
    //access via methods (getters/setters).
    public double getBalance() {
        return balance;
    }

    // Getter for card number (no setter, as card number should not be changed)
    public int getCardNumber() {
        return cardNumber;
    }

}

/*
   ┌───────────────────────────────────────────────┬───────────────────────────────────────┐
   │ ❌ Without Private Access                     │ ✅ With Private Access               │
   ├───────────────────────────────────────────────┼───────────────────────────────────────┤
   │ 🔓 Anyone can modify balance, PIN, or card   │ 🔒 Only the class controls            │
   │    number                                    │     modifications                      │
   ├───────────────────────────────────────────────┼───────────────────────────────────────┤
   │ ⚠️ No validation on changing balance/PIN     │ ✅ PIN validation before changing     │
   ├───────────────────────────────────────────────┼───────────────────────────────────────┤
   │ 🚨 No security, hackers can modify balance   │ 🔐 Secure PIN check before withdrawals│
   ├───────────────────────────────────────────────┼───────────────────────────────────────┤
   │ ⚠️ Less control over data                    │ ✅ Full control over data modifications│
   └───────────────────────────────────────────────┴───────────────────────────────────────┘
*/
