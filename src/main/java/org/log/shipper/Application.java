package org.log.shipper;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

class Application {
    static HttpClient client = HttpClient.newHttpClient();

    public static void main(String[] args) {
        client.sendAsync(request(), HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println)
                .join();
    }

    static HttpRequest request() {
        final String property = System.getProperty("message");
        final String message = property == null || property.isBlank() ? "# Hello from Shipping-Logs-Application" : property;

        return HttpRequest.newBuilder(LoggerUtil.uri)
                .timeout(Duration.ofSeconds(30))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(LoggerUtil.toJson(message)))
//                .POST(HttpRequest.BodyPublishers.ofString("{\"content\":\"<h1>H1 Header</h1>\",\"embeds\":null,\"attachments\":[]}"))
                .build();
    }
}