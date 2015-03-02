package mx.sorting;

public class Quicksort {
  int[] array;

  Quicksort(int[] array) {
    this.array = array;
  }

  public void quicksort(int lowerIndex, int higherIndex) {
    int lo = lowerIndex;
    int hi = higherIndex;
    int pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];

    while(lo <= hi) {
      while(array[lo] < pivot) {
        lo++;
      }

      while(array[hi] > pivot) {
        hi--;
      }

      if(lo <= hi) {
        swap(lo, hi);
        lo++;
        hi--;
      }

    }

    if(lowerIndex < hi) {
      quicksort(lowerIndex, hi);
    }
    if(lo < higherIndex) {
      quicksort(lo, higherIndex);
    }
  }

  private void swap(int a, int b) {
    int temp = array[a];
    array[a] = array[b];
    array[b] = temp;
  }

  private void printArray() {
    System.out.print("This is the array: ");
    for(int a : array) {
      System.out.printf("%s ", a);
    }
    System.out.print("\n");
  }

  public static void main(String[] args) {
    int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

    Quicksort quicksort = new Quicksort(array);
    quicksort.printArray();
    quicksort.quicksort(0, array.length - 1);
    quicksort.printArray();
  }
}
