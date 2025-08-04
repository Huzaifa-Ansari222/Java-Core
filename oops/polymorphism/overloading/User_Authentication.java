package oops.polymorphism.overloading;

public class User_Authentication {
    public static void main(String[] args) {
        AuthSystem auth = new AuthSystem();

        // Login with username and password
        auth.login("huzaifa123", "securePass");

        // Login with email and OTP
        auth.loginByEmail("huzaifa@example.com", "482019");

        // Login with phone number and OTP
        auth.login("9876543210", 482019);
    }
}
class AuthSystem {

    // Overload 1: Login with username and password
    void login(String username, String password) {
        System.out.println("Logged in with username: " + username);
        // In real scenario, check username and password in database
    }

    // Overload 2: Login with phone number and OTP
    void login(String phoneNumber, int otp) {
        System.out.println("Logged in with phone number: " + phoneNumber + " using OTP: " + otp);
        // Validate OTP here
    }

    // Separate method: Login with email and OTP (method name changed to avoid signature conflict)
    void loginByEmail(String email, String otp) {
        System.out.println("Logged in with email: " + email + " using OTP: " + otp);
        // Validate OTP here
    }
}