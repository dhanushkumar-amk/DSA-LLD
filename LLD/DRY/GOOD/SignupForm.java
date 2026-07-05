package LLD.DRY.GOOD;

public class SignupForm {
    private EmailValidator emailValidator = new EmailValidator();

    public boolean submit(String email, String password) {
        if (!emailValidator.isValid(email)) {
            System.out.println("Invalid email!");
            return false;
        }
        System.out.println("Signup successful for " + email);
        return true;
    }
}