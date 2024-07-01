package finalexam.task5;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class CommunicationManager {

    private String endpoint;

    // Constructor to initialize endpoint
    public CommunicationManager(String endpoint) {
        this.endpoint = endpoint;
    }

    // Method to send a user message via HTTP POST
    public String sendUserMessage(String message) {
        try {
            URL url = new URL(endpoint);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);

            // Prepare message payload
            String payload = "{\"message\": \"" + message + "\"}";

            // Write payload to the connection's output stream
            conn.getOutputStream().write(payload.getBytes(StandardCharsets.UTF_8));

            // Read response from the server
            int responseCode = conn.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Read response body if needed
                // For now, just return a success message
                return "Message sent successfully";
            } else {
                return "Failed to send message. Response code: " + responseCode;
            }
        } catch (IOException e) {
            return "Error sending message: " + e.getMessage();
        }
    }

    // Example usage in main method, it wont work tho because its just an example endpoint
    public static void main(String[] args) {
        String endpoint = "https://example.com/chatbot";
        CommunicationManager manager = new CommunicationManager(endpoint);

        // Example message to send
        String message = "Hello, chatbot!";
        String response = manager.sendUserMessage(message);
        System.out.println(response);
    }
}
