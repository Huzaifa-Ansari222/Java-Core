//lamda expression question with functionalInterface
package java_8.lamda;

public class Q1_Otp_Sender {
    public static void main(String[] args) {

        // Lambda implementation of OTPSender
        OTPSender otpSender = (phoneNumber)->{ //return int
            System.out.println("Sending OTP to: "+phoneNumber);
            return 2344; // example OTP to return
        };
//        (params...) -> {
//            // do stuff
//            return <ReturnType>;
//        }

        // Call the lambda and get the returned OTP
        int otp = otpSender.sendOTP(34332242); //2344 otp
        System.out.println("Generated OTP: " + otp);    }
}

@FunctionalInterface
interface OTPSender {
//    ReturnType methodName(params...)
    int sendOTP(int phoneNumber); // returns an OTP (int)
}
