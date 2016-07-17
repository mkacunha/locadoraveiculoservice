package br.mkacunha.locadora.service.exeption;

public class NotFoundServiceException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7419935319007724959L;

	public NotFoundServiceException() {
	}

	public NotFoundServiceException(String message) {
		super(message);
	}

	public NotFoundServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public NotFoundServiceException(Throwable cause) {
		super(cause);
	}
}
