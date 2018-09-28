
public class ArrayModel {

	private int[] arrayInt;
	private char[] arrayChar;

	public ArrayModel(int arraySize,int arraySizeForChar) {
		this.arrayInt = new int[arraySize];
		this.arrayChar = new char[arraySizeForChar];
	}
	
	public ArrayModel(int arraySize) {
		this.arrayInt = new int[arraySize];
	}

	public int[] getArray() {
		return arrayInt;
	}

	public void setArray(int[] array) {
		this.arrayInt = array;
	}

	public char[] getArrayChar() {
		return arrayChar;
	}

	public void setArrayChar(char[] arrayChar) {
		this.arrayChar = arrayChar;
	}
}
