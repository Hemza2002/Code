
/*Hemza Al-Shamari
    * 05/05/22
    * CS 211
    * Professor Craig Niiyama

*/
public class BogoSort {
	public static void main(String[] args) {
		int[] myArray = {10,9, 8, 7, 6, 5, 4, 3, 2, 1 };
		bogoSort(myArray);
		printArray(myArray);
	}

	// Places the elements of a into sorted order.
	public static void bogoSort(int[] a) {
		while (!isSorted(a)) {
			shuffle(a);
		}
	}

	// Returns true if a's elements are in sorted order.
	public static boolean isSorted(int[] a) {
		for (int i = 1; i < a.length; i++) {
			if (a[i] < a[i - 1]) {
				return false;
			}
		}
		return true;
	}

	// Shuffles an array of ints by randomly swapping each
	// element with an element ahead of it in the array.
	public static void shuffle(int[] a) {
		for (int i = 0; i < a.length; i++) {
			swap(a, i, (int) (Math.random() * i));
		}
	}

	// Swaps a[i] with a[j].
	public static void swap(int[] a, int i, int j) {
		int n = a[i];
		a[i] = a[j];
		a[j] = n;
	}

	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}// end of BogoSort class
