package HW2;

import java.util.Random;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int[] a = new int[n];
		Random rand = new Random();

		
	
	for (int j=0;j<a.length;j++) {
		a[j]=rand.nextInt(50);
	}
//		For i= 0 to N-1
	//		     min = i
		//	     for j=i to  N-1
			//           if (A[j] < A[min])
			  //         min=j;
			    // swap (A[i] and A[min])	
	for(int i=0;i<n;i++) {
		int min=i;
		for(int j=i+1;j<n;j++) 
			if(a[j]<a[min]) {
				min=j;
				}
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		
	}
	for (int k = 0; k < n; k++)
		System.out.println(a[k]);
	}
}