package db;

public class DbIntegrityException extends RuntimeException{

    private static final long serialVersionID = 1L;

    public DbIntegrityException(String msg) {
        super(msg);
    }
}
