package LLD.DRY.GOOD;

public class LoginForm {
    private EmailValidator emailValidator = new EmailValidator();

    public boolean submit(String email, String password) {
        if (!emailValidator.isValid(email)) {
            System.out.println("Invalid email!");
            return false;
        }
        System.out.println("Login successful for " + email);
        return true;
    }
}