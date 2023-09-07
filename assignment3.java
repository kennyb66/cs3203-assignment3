import java.util.Scanner;

public class assignment3exe {
	public static int sum(int[] sumArr) {
		int sum = 0;
		for (int i = 0; i < sumArr.length; i++) {
			sum += sumArr[i];
		}
		return sum;
	}

	public static int mul(int[] mulArr) {
		int mul = 1;
		for (int i = 0; i < mulArr.length; i++) {
			mul *= mulArr[i];
		}
		return mul;
	}
	public static void reverse(int[] arr, int size) {
		int[] b = new int[size];
		int j = size;
		for(int i = 0; i < size; i++) {
			b[j - 1] = arr[i];
			j = j - 1;
		}
		System.out.println("Reversed array is: \n");
        for (int k = 0; k < size; k++) {
            System.out.println(b[k]);
        }
	}

	public static void main(String[] args) {
		int[] sumArr = new int[100];
		int[] mulArr = new int[100];
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please input number of elements you need for addition calculation:");
		int sumSize = keyboard.nextInt();
		System.out.println("Please input your numbers to be computed for addition:");
		for (int i = 0; i < sumSize; i++) {
			sumArr[i] = keyboard.nextInt();
		}
		System.out.println("Result of addition: " + sum(sumArr));
		System.out.println("Please input number of elements you need for multiplication calculation:");
		int mulSize = keyboard.nextInt();
		System.out.println("Please input your numbers to be computed for multiplication:");
		for (int i = 0; i < mulSize; i++) {
			mulArr[i] = keyboard.nextInt();
		}
		for (int j = mulSize; j < mulArr.length; j++) {
			mulArr[j] = 1;
		}
		System.out.println("Result of multiplication: " + mul(mulArr));

		keyboard.close();
	}
}



