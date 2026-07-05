package LLD.DRY.GOOD;

public class Main {
    public static void main(String[] args) {
        SignupForm signup = new SignupForm();
        signup.submit("rahul@gmail.com", "pass123");

        LoginForm login = new LoginForm();
        login.submit("invalidemail", "pass123");
    }
}