package exception.basic.unchecked;

// RuntimeException를 상속받은 예외는 언체크 예외가 된다.
public class MyUnCheckedException extends RuntimeException {
    public MyUnCheckedException(String message) {
        super(message);
    }
}
