package exception.ex4.exception;

public class NetworkServiceV5 {

    public void sendMessage(String data) {
        //try-with-resources
        String address = "http://example.com";

        try (NetworkClientV5 client = new NetworkClientV5(address)){
            client.initError(data);
            client.connect();
            client.send(data);
        } catch (Exception e) {
            System.out.println("[예외 확인]: " + e.getMessage());
            throw e;
        }
    }
}
