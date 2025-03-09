package exception.ex1;

public class NetworkServiceV1_1 {

    public void sendMessage(String data) {
        //서버연결 실패, 데이터 전송 실패등 오류 상황 도입
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);

        client.initError(data);
        client.connect();
        client.send(data);
        client.disconnect();
    }
}
