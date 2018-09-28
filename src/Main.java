import java.util.Scanner;
import java.util.InputMismatchException;;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Scanner strScanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		
		ArrayModel array1;
		int arraySize;
		String arraySizeForChar;
		int movePosition;

		System.out.print("Enter array size: ");
		try {
			arraySize = scanner.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("You entered not a number! Array size = 5 automaticaly");
			arraySize = 5;
		}
		
		System.out.print("Enter your name and surname: ");
			arraySizeForChar = strScanner.nextLine();
			
		if(!Methods.checkName(arraySizeForChar)) {
			System.out.println("You entered not a real name! Array size for char is \"Vitaly Zenkou\"\n");
			arraySizeForChar ="Zenkou Vitaly";
		}

		array1 = new ArrayModel(arraySize, arraySizeForChar.length());
		
		Methods.setArray(array1.getArray());
		Methods.printArray(array1.getArray());
		Methods.inversePrint(array1.getArray());
		Methods.printItemsFoldThree(array1.getArray());
		Methods.calculateDifferenceNotEvenNumbers(array1.getArray());
		Methods.calculateAmountEneveAndNotEvenItems(array1.getArray());
		Methods.findMaxMinItems(array1.getArray());
		Methods.findMaxMinFormEvenOrNotEvenItems(array1.getArray());
		Methods.setCharArray(array1.getArrayChar(), arraySizeForChar);
		Methods.printCharArray(array1.getArrayChar());
		
		System.out.println("Array before elemnts were removed:");
		Methods.printArray(array1.getArray());
		array1.setArray(Methods.removeNumberFoldThree(array1.getArray()));
		System.out.println("Array after elemnts were removed:");
		Methods.printArray(array1.getArray());
		array1.setArrayChar(Methods.removeSpaceFromCharArray(array1.getArrayChar()));
		Methods.printCharArray(array1.getArrayChar());
		array1.setArray(Methods.insertSort(array1.getArray()));
		Methods.printArray(array1.getArray());
		
		ArrayModel array2 = new ArrayModel(arraySize);
		Methods.setArray(array2.getArray());
		System.out.println("Array before changes:");
		Methods.printArray(array2.getArray());
		array2.setArray(Methods.betweenSumm(array2.getArray()));
		System.out.println("Array after changes:");
		Methods.printArray(array2.getArray());
		
		System.out.print("Enter move position:");
		try {
			movePosition = scanner2.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("You entered not a number! Move position = 1 automaticaly");
			movePosition = 1;
		}
		
		System.out.println("Array after move:");
		array2.setArray(Methods.moveElementToRight(array2.getArray(), movePosition));
		Methods.printArray(array2.getArray());
		System.out.println("Array after sort:");
		Methods.printArray(Methods.selectSort(array2.getArray()));
	}
}
