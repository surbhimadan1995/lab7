package Sorting;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//Generates a random array
		int[] unsortedArray = new int[(int) (Math.random()*20.0)];
		for (int i = 0; i < unsortedArray.length; i++) {
			unsortedArray[i] = (int) (Math.random()*20.0);
		}

		System.out.println("Unsorted Array:");

		for (int i: unsortedArray) {
				System.out.print(i + " ");
		}
		System.out.println();

		System.out.println("Sorted Array:");

		int[] sortedArray = InsertionSort.insertionSort(unsortedArray);
		System.out.println();
    for (int i = 0; i < sortedArray.length; i++) {
      System.out.print(sortedArray[i] + " ");
    }



		//TODO: sort the array and print out its contents

		int[] sortedArrays = BubbleSort.bubbleSort(unsortedArray);
		for (int i: sortedArrays) {
      System.out.print(i + " ");
		}

	}

}
