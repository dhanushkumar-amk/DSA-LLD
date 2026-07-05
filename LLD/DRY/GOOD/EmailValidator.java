package LLD.DRY.GOOD;

public class EmailValidator {
    // ONE source of truth for email validation
    public boolean isValid(String email) {
        return email.contains("@") && email.contains(".");
    }
}