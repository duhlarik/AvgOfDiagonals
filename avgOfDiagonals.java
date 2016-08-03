import java.text.DecimalFormat;
import java.util.Scanner;

public class avgOfDiagonals {

	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);
		int i = 0, j = 0;

		System.out.println("Enter the size of your array.");
		int size = scan1.nextInt();
		scan1.nextLine();

		int[][] nums = new int[size][size];

		System.out.println("Enter your numbers into the array, pressing enter after each one.");
		for (i = 0; i < size; i++) {
			for (j = 0; j < size; j++) {
				int number = scan1.nextInt();
				scan1.nextLine();
				nums[i][j] = number;
			}

		}
		for (i = 0; i < size; i++) {
			for (j = 0; j < size; j++) {
				System.out.printf("%5d ", nums[i][j]);
			}
			System.out.println();
			System.out.println();
		}
		System.out.print("The numbers on the diagonal are: ");

		double sum = 0;
		int[] newArray = new int[size];
		for (int k = 0; k < size; k++) {
			int newNumber = nums[k][k];
			newArray[k] = newNumber;
			sum += newArray[k];
			System.out.printf("%2d, ", newArray[k]);
		}
		double average = 0;
		DecimalFormat df = new DecimalFormat("#.000"); // this rounds the number and sets the number of decimal places
		average = (double)sum / size;
		System.out.print(" Diagonal average = " + df.format(average));

		scan1.close();
	}

}
