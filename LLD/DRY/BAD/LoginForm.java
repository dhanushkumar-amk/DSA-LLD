package LLD.DRY.BAD;

public class LoginForm {
    public boolean submit(String email, String password) {

        // 🚨 SAME email validation logic copy-pasted AGAIN
        if (!email.contains("@") || !email.contains(".")) {
            System.out.println("Invalid email!");
            return false;
        }

        System.out.println("Login successful for " + email);
        return true;
    }
}