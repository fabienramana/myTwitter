package fra.esgi.twitter;
import com.sun.net.httpserver.*;
import org.json.JSONObject;
import org.json.JSONPropertyName;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;


public class TwittClient {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newHttpClient();
        int fabienUserId = login(httpClient, "Fabien");
        postSample(httpClient, fabienUserId, "Hello World", 0);
        
        int andyUserId = register(httpClient, "Andy");
        int postId = postSample(httpClient, andyUserId, "Je suis Andy,ravi!", 0);
        
        getPost(httpClient, postId);

        fabienUserId = login(httpClient, "Fabien");
        getHistorique(httpClient, fabienUserId);
        
        andyUserId = login(httpClient, "Andy");
        follow(httpClient, andyUserId, fabienUserId);
        getTimeline(httpClient, andyUserId);
    }

    private static int postSample(HttpClient httpClient, int userId, String message, int origin) throws IOException, InterruptedException {
        String body ="{\"message\":\""+message+"\",\"origin\":"+origin+"}";
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:8080/post"))
                .POST(HttpRequest.BodyPublishers.ofString(body))
                .header("Content-type", "application/json")
                .setHeader("Cookie", "userId="+userId)
                .build();
        HttpResponse<String> response = httpClient.send(request, BodyHandlers.ofString());
        System.out.println(response.body());
        JSONObject jsonObject = new JSONObject(response.body());
        int tweetid = jsonObject.getInt("tweetid");
        return tweetid;
    }

    private static void getPost(HttpClient httpClient, int postId) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:8080/post/"+ postId))
                .GET()
                .build();

        HttpResponse<String> response = httpClient.send(request, BodyHandlers.ofString());
        System.out.println(response.body());
    }

    private static void getHistorique(HttpClient httpClient, int authorId) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:8080/historique/"+authorId))
                .GET()
                .build();

        HttpResponse<String> response = httpClient.send(request, BodyHandlers.ofString());

        System.out.println(response.body());
    }

    private static int register(HttpClient httpClient, String name) throws IOException, InterruptedException {
        String body ="{\"login\":\""+name+"\"}";
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:8080/register"))
                .POST(HttpRequest.BodyPublishers.ofString(body))
                .header("Content-type", "application/json")
                .build();

        HttpResponse<String> response = httpClient.send(request, BodyHandlers.ofString());
        System.out.println(response.body());
        JSONObject jsonObject = new JSONObject(response.body());
        int userId =jsonObject.getInt("authorid");
        return userId;
    }

    private static int login(HttpClient httpClient, String name) throws IOException, InterruptedException {
        String body ="{\"login\":\""+name+"\"}";
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:8080/login"))
                .POST(HttpRequest.BodyPublishers.ofString(body))
                .header("Content-type", "application/json")
                .build();

        HttpResponse<String> response = httpClient.send(request, BodyHandlers.ofString());
        System.out.println(response.body());
        JSONObject jsonObject = new JSONObject(response.body());
        int userId =jsonObject.getInt("authorid");
        return userId;
    }

    private static void follow(HttpClient httpClient, int userId, int followId) throws IOException, InterruptedException {
        String body ="{}";
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:8080/follow/"+followId))
                .POST(HttpRequest.BodyPublishers.ofString(body))
                .header("Content-type", "application/json")
                .setHeader("Cookie", "userId="+userId)
                .build();

        HttpResponse<String> response = httpClient.send(request, BodyHandlers.ofString());

        System.out.println(response.body());
    }

    private static void getTimeline(HttpClient httpClient, int userId) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:8080/timeline"))
                .GET()
                .setHeader("Cookie", "userId="+userId)
                .build();

        HttpResponse<String> response = httpClient.send(request, BodyHandlers.ofString());

        System.out.println(response.body());
    }
}