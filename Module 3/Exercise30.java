// 30. Pattern Matching for switch (Java 21)
public class Exercise30 {
    public static void main(Object obj) {
        switch (obj) {
            case String s -> System.out.println("It's a String: " + s);
            case Integer i -> System.out.println("It's an Integer: " + i);
            case Double d -> System.out.println("It's a Double: " + d);
            default -> System.out.println("Unknown type");
        }
    }
}