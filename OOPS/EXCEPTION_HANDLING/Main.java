package OOPS.EXCEPTION_HANDLING;

public class Main {
    static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
//           divide(a, b);
            String name = "dhanush";
            if (name.equals("dhanush")){
                throw new OwnException("Name is dhanushkumar for fun ");
            }
        }catch (OwnException exception){
            System.out.println(exception.getMessage());

        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
        finally {
            System.out.println("It always run");
        }
    }

    public static int divide(int a, int b) throws ArithmeticException{
        if (b == 0)
            throw new ArithmeticException("A is not divided by zero");
        return  a / b;
    }
}
