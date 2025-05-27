// 36. HTTP Client API
import java.net.http.*;
import java.net.URI;

public class Exercise36 {
    public static void main(String[] args) throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                              .uri(URI.create("https://api.github.com"))
                              .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("Status: " + response.statusCode());
        System.out.println("Body: " + response.body());
    }
}