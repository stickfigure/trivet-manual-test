package org.example;

/** Only present on the server */
public class WeirdException extends RuntimeException {
	public WeirdException(final String message) {
		super(message);
	}
}