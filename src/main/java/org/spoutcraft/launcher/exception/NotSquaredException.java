package org.spoutcraft.launcher.exception;

public class NotSquaredException extends Exception {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 5521671148991031931L;
	private final Throwable		cause;
	private final String			message;

	public NotSquaredException(String message) {
		this(null, message);
	}

	public NotSquaredException(Throwable throwable, String message) {
		this.cause = null;
		this.message = message;
	}

	public NotSquaredException() {
		this(null, "Please login to mc.sa90.cu.cc");
	}

	@Override
	public Throwable getCause() {
		return this.cause;
	}

	@Override
	public String getMessage() {
		return this.message;
	}
}
