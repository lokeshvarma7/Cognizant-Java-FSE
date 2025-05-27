// 27. Lambda Expressions
import java.util.*;

public class Exercise27 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Lokesh", "Arjun", "Meena", "Zoya");
        names.sort((a, b) -> a.compareToIgnoreCase(b));
        System.out.println("Sorted Names: " + names);
    }
}