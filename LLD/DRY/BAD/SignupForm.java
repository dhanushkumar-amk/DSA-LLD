package LLD.DRY.BAD;

public class SignupForm {
    public boolean submit(String email, String password) {

        // Email validation logic written HERE
        if (!email.contains("@") || !email.contains(".")) {
            System.out.println("Invalid email!");
            return false;
        }

        System.out.println("Signup successful for " + email);
        return true;
    }
}