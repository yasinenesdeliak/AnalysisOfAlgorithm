package project;

public class MergeSorting implements Runnable {
	private int[] a;
	private int threadlevel;
	
	public MergeSorting(int[] a, int level) {
		this.a = a;
		this.threadlevel = level;
	}
	
	public void run() {
		MergeSort.sort(a, threadlevel);
	}
}