// 41. Executor Service and Callable
import java.util.concurrent.*;

public class Exercise41 {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        Callable<String> task = () -> "Hello from Callable";
        Future<String> result = executor.submit(task);
        System.out.println(result.get());
        executor.shutdown();
    }
}