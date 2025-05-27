// 7. Type Casting Example
public class Exercise7 {
    public static void main(String[] args) {
        double d = 9.78;
        int i = (int) d; // narrowing casting
        int x = 7;
        double y = x; // widening casting
        System.out.println("Double to Int: " + i);
        System.out.println("Int to Double: " + y);
    }
}