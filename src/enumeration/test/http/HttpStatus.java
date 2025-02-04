package enumeration.test.http;

public enum HttpStatus {

    OK(200,"OK"),
    BAD_REQUEST(400, "Bad Request"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_SEVER_ERROR(500, "Internal Sever Error");

    private final int code;
    private final String message;

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static HttpStatus findByCode(int code) {

        HttpStatus[] values = HttpStatus.values();

        for (HttpStatus value : values) {
            if(value.getCode() == code) {
                return value;
            }
        }
        return null;
    }

    public boolean isSuccess() {
        return code >= 200 && code <= 299;
    }
}
