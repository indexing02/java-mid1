package exception.ex2;

public class NetworkServiceV2_5 {

    public void sendMessage(String data){
        //finally 도입
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);

        client.initError(data);

        try {
            //정상흐름
            client.connect();
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            //예외흐름
            System.out.println("[오류]코드: " +  e.getErrorCode() + ", 메시지: " + e.getMessage());
        }finally {
            //반드시 호출해야 하는 마무리 흐름
            client.disconnect();
        }
    }
}
