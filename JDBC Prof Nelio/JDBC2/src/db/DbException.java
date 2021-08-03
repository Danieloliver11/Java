package db;

public class DbException extends RuntimeException {
	// minha exception
	
	private static final long serialVersionUID = 1L;
	
	public DbException(String msg) {
		super(msg);
	}

	
}
