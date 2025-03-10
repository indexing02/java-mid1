package exception.ex2;

public class NetworkServiceV2_4 {

    public void sendMessage(String data){
        //리소스 반환 문제
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);

        client.initError(data);

        try {
            client.connect();
            client.send(data); // 1. 예를 들어 RuntimeException 발생시 런타임에러는 현제 catch 대상이 아니라 밖으로 던져짐
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류]코드: " +  e.getErrorCode() + ", 메시지: " + e.getMessage());
        }

        client.disconnect(); // 2. 그렇게 되면 이 코드는 호출 되지 않음
    }
}
