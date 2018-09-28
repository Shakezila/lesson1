import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Methods {

	static Random random = new Random();

	static boolean checkName(String name) {
		Pattern p = Pattern.compile("^[A-za-zà-ÿÀ-ÿ ]{1,100}$");
		Matcher m = p.matcher(name);
		return m.matches();
	}

	static int[] setArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(100);
		}
		return array;
	}

	static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.printf("Array[%d] = %d\n", i, array[i]);
		}
		System.out.println("");
	}

	static void inversePrint(int[] array) {
		int size = array.length - 1;

		for (int i = 0; i <= size; size--) {
			System.out.printf("Array[%d] = %d\n", size, array[size]);
		}
		System.out.println("");
	}

	static void printItemsFoldThree(int[] array) {
		int counter = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {

			} else if (array[i] % 3 == 0) {
				System.out.printf("Array[%d] = %d\n", i, array[i]);
				counter++;
			}
		}
		if (counter == 0) {
			System.out.println("The array doen't contain any numbers multiple of 3!");
		} else {
			System.out.println("");
		}
	}

	static void calculateDifferenceNotEvenNumbers(int[] array) {
		int difference = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				difference -= array[i];
			}
		}
		System.out.printf("The diference = %d\n\n", difference);
	}

	static void calculateAmountEneveAndNotEvenItems(int[] array) {
		int evenCount = 0;
		int notEvenCount = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				evenCount++;
			} else {
				notEvenCount++;
			}
		}
		System.out.printf("Even items count = %d \nNot even items count = %d\n\n", evenCount, notEvenCount);
	}

	static void findMaxMinItems(int[] array) {
		int max = array[0];
		int min = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.printf("Max = %d\nMin = %d\n\n", max, min);
	}

	static void findMaxMinFormEvenOrNotEvenItems(int[] array) {
		int maxEven = 0;
		int minEven = 0;
		int maxNotEven = 0;
		int minNotEven = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				maxEven = array[i];
				minEven = array[i];
			} else {
				maxNotEven = array[i];
				minNotEven = array[i];
			}

			if (maxEven != 0 && minEven != 0 && maxNotEven != 0 && minNotEven != 0) {
				break;
			}
		}

		for (int j = 0; j < array.length; j++) {
			if (array[j] % 2 == 0) {
				if (array[j] > maxEven) {
					maxEven = array[j];
				}
				if (array[j] < minEven) {
					minEven = array[j];
				}
			} else {
				if (array[j] > maxNotEven) {
					maxNotEven = array[j];
				}
				if (array[j] < minNotEven) {
					minNotEven = array[j];
				}
			}
		}
		System.out.printf("Max not even = %d\nMin not even = %d\n\nMax even = %d\nMin even = %d\n\n", maxNotEven,
				minNotEven, maxEven, minEven);
	}

	public static char[] setCharArray(char[] array, String name) {
		for (int i = 0; i < array.length; i++) {
			array[i] = name.charAt(i);
		}
		return array;
	}

	static void printCharArray(char[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%c", array[i]);
		}
		System.out.println("\n");
	}

	static int[] removeNumberFoldThree(int[] array) {
		int newSize = array.length;
		int counter = 0;
		int[] newArray;

		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0 && array[i] % 3 == 0) {
				newSize--;
			}
		}
		newArray = new int[newSize];
		for (int j = 0; j < array.length; j++) {
			if (array[j] == 0 || array[j] % 3 != 0) {
				newArray[counter] = array[j];
				counter++;
			}
		}
		return newArray;
	}

	static char[] removeSpaceFromCharArray(char[] array) {
		String newString = "";
		char[] newCharArray;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != ' ') {
				newString += array[i];
			}
		}
		newCharArray = new char[newString.length()];
		return setCharArray(newCharArray, newString);
	}

	static int[] bubleSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] < array[j + 1]) {
					int buffer = array[j];
					array[j] = array[j + 1];
					array[j + 1] = buffer;
				}
			}
		}
		return array;
	}

	static int[] insertSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int key = array[i];
			int j;
			for (j = i - 1; j >= 0 && array[j] > key; j--) {
				array[j + 1] = array[j];

			}
			array[j + 1] = key;
		}
		return array;
	}
	
	static int[] selectSort(int[] array) {
		for(int i = 0; i < array.length - 1; i++) {
			int min = i;
			for(int j = i + 1; j <array.length; j++) {
				if(array[j] < array[min]) {
					min = j;
				}
			}
			int buff = array[i];
			array[i] = array[min];
			array[min] = buff;
		}
		return array;
	}
	
	static int[] betweenSumm(int[] array) {
		int[] newArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				newArray[i] = array[i + 1] / 2;
			} else if (i == array.length - 1) {
				newArray[array.length - 1] = array[i - 1] / 2;
			} else {
				newArray[i] = (array[i - 1] + array[i + 1]) / 2;
			}
		}
		return newArray;
	}

	static int[] moveElementToRight(int[] array, int movePosition) {
		int[] newArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			if ((movePosition + i) >= array.length) {
				newArray[i - array.length + movePosition] = array[i];
			} else {
				newArray[i + movePosition] = array[i];
			}
		}
		return newArray;
	}
}
