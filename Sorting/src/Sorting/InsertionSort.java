package Sorting;

public class InsertionSort {
  /**
   * insertionSort			sorts an array of integers using insertion sort
   *
   * @param unsortedArray		an unsorted array of integers
   * @return					the input array, sorted least to greatest
   */
  public static int[] insertionSort(int[] array) {

    for(int i = 0; i < array.length; i++){
      int j = i;
      while (j > 0 && array[j] < array[j - 1]){
        int temp = array[j];
        array[j] = array[j-1];
        array[j-1] = temp;
        j = j-1;
      }
    }
    return array;
  }

}
