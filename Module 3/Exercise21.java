// 21. Custom Exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
public class Exercise21 {
    public static void main(String[] args) {
        int age = 16;
        try {
            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or above!");
            }
            System.out.println("You are eligible.");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}