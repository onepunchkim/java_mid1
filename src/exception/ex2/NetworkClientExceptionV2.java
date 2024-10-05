package exception.ex2;

public class NetworkClientExceptionV2 extends Exception {

    private String eroorCode;

    public NetworkClientExceptionV2(String eroorCode, String message) {
        super(message);
        this.eroorCode = eroorCode;
    }

    public String getEroorCode() {
        return eroorCode;
    }
}
