package project;

public class MergeSort {
	public static void sort(int[] array, int threadlevel) {
		if (array.length < 2) { return;
		}
		if (threadlevel == 0) {
			mergeSort(array);
		} else {

			int[] left  = leftPart(array);
			int[] right = rightPart(array);
			
			Thread lThread = new Thread(new MergeSorting(left,  threadlevel-1));
			Thread rThread = new Thread(new MergeSorting(right, threadlevel-1));
			lThread.start();
			rThread.start();
			
			try {
				lThread.join();
				rThread.join();
			} catch (InterruptedException ie) {}
			
			merge(left, right, array);
		}
	}
	
	public static int[] leftPart(int[] array) {
	    int size1 = array.length / 2;
	    int[] left = new int[size1];
	    for (int i = 0; i < size1; i++) {
	      left[i] = array[i];
	    }
	    return left;
	  }
	 
	public static int[] rightPart(int[] array) {
	    int size1 = array.length / 2;
	    int size2 = array.length - size1;
	    int[] right = new int[size2];
	    for (int i = 0; i < size2; i++) {
	      right[i] = array[i + size1];
	    }
	    return right;
	  }
	
	public static void mergeSort(int[] a) {
		if (a.length >= 2) {
			
			int[] left  = leftPart(a);
			int[] right = rightPart(a);
			
			
			mergeSort(left);
			mergeSort(right);
			
			
			merge(left, right, a);
		}
	}
	

	public static void merge(int[] left, int[] right, int[] a) {
		int i1 = 0;
		int i2 = 0;
		for (int i = 0; i < a.length; i++) {
			if (i2 >= right.length || (i1 < left.length && left[i1] < right[i2])) {
				a[i] = left[i1];
				i1++;
			} else {
				a[i] = right[i2];
				i2++;
			}
		}
	}


	public static final void swap(int[] a, int i, int j) {
		if (i != j) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
	}
	
	
	public static boolean isSorted(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i + 1]) {
				return false;
			}
		}
		return true;
	}
}