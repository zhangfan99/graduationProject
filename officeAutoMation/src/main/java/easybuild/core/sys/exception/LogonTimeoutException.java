package easybuild.core.sys.exception;

public class LogonTimeoutException extends RuntimeException {
    public LogonTimeoutException() {
    }

    public LogonTimeoutException(String message) {
        super(message);
    }

    public LogonTimeoutException(Throwable cause) {
        super(cause);
    }

    public LogonTimeoutException(String message, Throwable cause) {
        super(message, cause);
    }
}
