public class LockPickFailException extends Exception {
    public LockPickFailException(String message) {
        super(message);
    }
    public LockPickFailException() { super(); }
}