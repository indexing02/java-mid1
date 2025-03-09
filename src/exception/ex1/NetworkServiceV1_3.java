package exception.ex1;

public class NetworkServiceV1_3 {

    public void sendMessage(String data) {
        //connect(), send() 호출에 오류가 있어도 disconnect() 무조건 호출
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);

        client.initError(data);

        String connectResult = client.connect();
        if(isError(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드 : " + connectResult);
        }else{
            String sendResult = client.send(data);
            if(isError(sendResult)) {
                System.out.println("[네트워크 오류 발생] 오류 코드: " + sendResult);
            }
        }

        client.disconnect();
    }

    private static boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }
}
