package macierze;

public class MatrixDimensionsException extends Exception{
	
	float [] [] throwedMatrix;
	
	public MatrixDimensionsException() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor
	 * @param message
	 */
	public MatrixDimensionsException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Constructor
	 * @param message
	 */
	public MatrixDimensionsException(String message, float [] [] throwed) {
		super(message);
		throwedMatrix = throwed;
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor
	 * @param cause
	 */
	public MatrixDimensionsException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor
	 * @param message
	 * @param cause
	 */
	public MatrixDimensionsException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public MatrixDimensionsException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Getter
	 * @return the throwedMatrix
	 */
	public float [] [] getThrowedMatrix() {
		return throwedMatrix;
	}
	
}
