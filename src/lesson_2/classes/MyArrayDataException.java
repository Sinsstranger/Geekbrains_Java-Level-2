package lesson_2.classes;

public class MyArrayDataException extends Exception{
	public MyArrayDataException(String message) {
		super(message);
	}

	public MyArrayDataException(String message, Throwable cause) {
		super(message, cause);
	}
}
