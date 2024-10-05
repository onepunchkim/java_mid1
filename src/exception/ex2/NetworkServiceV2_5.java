package exception.ex2;

public class NetworkServiceV2_5 {
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data); //추가

        try {
            client.connect();
            client.send(data); //1. RuntimeException은 catch 대상이 아님. 예외가 밖으로 던져짐
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getEroorCode() + ", 메시지: " + e.getMessage());
        } finally {
            client.disconnect();

        }
    }
}
