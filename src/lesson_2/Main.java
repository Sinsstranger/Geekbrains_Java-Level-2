package lesson_2;

import lesson_2.classes.MyArrayDataException;
import lesson_2.classes.MyArraySizeException;

public class Main {

	public static void arrCorrectLengthCheck(int requreOutSize, int requireInSize, String[][] strings) throws MyArraySizeException, MyArrayDataException {
		if (strings.length > requreOutSize) {
			throw new MyArraySizeException("Превышен размер массива!");
		} else {
			System.out.println("Размер внешнего массива корректен;");
		}
		for (String[] string : strings) {
			if (string.length > requireInSize) {
				throw new MyArraySizeException("Превышен размер вложенного массива!");
			}
		}
		System.out.println("Размер внутренних массивов корректен;");
		try {
			arrSummator(strings);
		} catch (MyArrayDataException e) {
			throw e;
		}
	}

	public static void arrSummator(String[][] strings) throws MyArrayDataException {
		int result = 0;
		for (int i = 0; i < strings.length; i++) {
			for (int j = 0; j < strings[i].length; j++) {
				try {
					result += Integer.parseInt(strings[i][j]);
				} catch (NumberFormatException e) {
					throw new MyArrayDataException("В массиве на позиции " + i + ":" + j + " не удалось преобразование к числу;", e);
				}
			}
		}
		System.out.println("Результат рекурсивного сложения массива: " + result + ";");
	}

	public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
		String[][] strings = {
				  {"1", "2", "3", "4"},
				  {"4", "3", "2", "1"},
				  {"5", "6", "7", "8"},
				  {"8", "7", "6", "5"},
		};
		try {
			arrCorrectLengthCheck(4, 4, strings);
		} catch (MyArraySizeException | MyArrayDataException e) {
			throw e;
		}
	}
}
