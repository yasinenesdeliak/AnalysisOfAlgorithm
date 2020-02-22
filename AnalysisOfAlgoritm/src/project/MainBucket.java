package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;


public class MainBucket {
	
	public static void main(String[] args) {
		
		
		int []list=new int[16];
		int []list1=new int[256];
		int []list2=new int[8192];
		int []list3=new int[131072];
		int []list4=new int[1048576];
			
		String path ="16.txt";
		String path1="256.txt";
		String path2="8192.txt";
		String path3="131072.txt";
		String path4="1048576.txt";
			
		readData(list,path);
		readData(list1,path1);
		readData(list2,path2);
		readData(list3,path3);
		readData(list4,path4);
		
		
		
		
		int sample[] = new int[16];
		String string = "16.txt";
		readData(sample, string);
		BucketSort X=new BucketSort(sample.length);
		System.out.println("Random Array with Size 16");
		System.out.println(Arrays.toString(sample));
		long start=System.nanoTime();
		X.sort(sample, 0);
		long end=System.nanoTime();
		System.out.println("Sorted Array with Bucket Sort");
		System.out.println(Arrays.toString(sample));
		System.out.println();

		System.out.println("Running time for size 16 without thread is: "+ (end-start));
		readData(list,path);

		
		int sample1[] = new int[16];
		String string1 = "16.txt";
		readData(sample1, string1);
		BucketSort X1=new BucketSort(sample1.length);		
		start=System.nanoTime();
		X.sort(sample1, 1);
		end=System.nanoTime();
	

		System.out.println("Running time for size 16 with 2 threads is: "+ (end-start));
		readData(list,path);

		
		int sample2[] = new int[16];
		String string2 = "16.txt";
		readData(sample2, string2);
		BucketSort X2=new BucketSort(sample2.length);		
		start=System.nanoTime();
		X.sort(sample2, 2);
		end=System.nanoTime();
	

		System.out.println("Running time for size 16 with 4 threads is: "+ (end-start));
		readData(list,path);

		
	
		
		
		int sample3[] = new int[256];
		String string3 = "256.txt";
		readData(sample3, string3);
		BucketSort X3=new BucketSort(sample3.length);
		start=System.nanoTime();
		X.sort(sample3, 0);
		end=System.nanoTime();
		System.out.println();

		System.out.println("Running time for size 256 without thread is: "+ (end-start));
		readData(list,path);

		
		int sample4[] = new int[256];
		String string4 = "256.txt";
		readData(sample4, string4);
		BucketSort X4=new BucketSort(sample4.length);		
		start=System.nanoTime();
		X.sort(sample4, 1);
		end=System.nanoTime();
		

		System.out.println("Running time for size 256 with 2 threads is: "+ (end-start));
		readData(list,path);

		
		int sample5[] = new int[256];
		String string5 = "256.txt";
		readData(sample5, string5);
		BucketSort X5=new BucketSort(sample5.length);		
		start=System.nanoTime();
		X.sort(sample5, 2);
		end=System.nanoTime();
		
		System.out.println("Running time for size 256 with 4 threads is: "+ (end-start));
		readData(list,path);

		
		
		int sample6[] = new int[8192];
		String string6= "8192.txt";
		readData(sample6, string6);
		BucketSort X6=new BucketSort(sample6.length);
		start=System.nanoTime();
		X.sort(sample6, 0);
		end=System.nanoTime();
		System.out.println();

		System.out.println("Running time for size 8192 without thread is: "+ (end-start));
		readData(list,path);

		
		int sample7[] = new int[8192];
		String string7 = "8192.txt";
		readData(sample7, string7);
		BucketSort X7=new BucketSort(sample7.length);		
		start=System.nanoTime();
		X.sort(sample7, 1);
		end=System.nanoTime();

		System.out.println("Running time for size 8192 with 2 threads is: "+ (end-start));
		readData(list,path);

		
		int sample8[] = new int[8192];
		String string8 = "8192.txt";
		readData(sample8, string8);
		BucketSort X8=new BucketSort(sample8.length);		
		start=System.nanoTime();
		X.sort(sample8, 2);
		end=System.nanoTime();
	

		System.out.println("Running time for size 8192 with 4 threads is: "+ (end-start));
		readData(list,path);

		
	
		
		
		int sample9[] = new int[131072];
		String string9 = "131072.txt";
		readData(sample9, string9);
		BucketSort X9=new BucketSort(sample9.length);
		start=System.nanoTime();
		X.sort(sample9, 0);
		end=System.nanoTime();
		System.out.println();

		System.out.println("Running time for size 131072 without thread is: "+ (end-start));
		readData(list,path);

		
		int sample10[] = new int[131072];
		String string10 = "131072.txt";
		readData(sample10, string10);
		BucketSort X10=new BucketSort(sample10.length);		
		start=System.nanoTime();
		X.sort(sample10, 1);
		end=System.nanoTime();
		

		System.out.println("Running time for size 131072 with 2 threads is: "+ (end-start));
		readData(list,path);

		
		int sample11[] = new int[131072];
		String string11 = "131072.txt";
		readData(sample11, string11);
		BucketSort X11=new BucketSort(sample11.length);		
		start=System.nanoTime();
		X.sort(sample11, 2);
		end=System.nanoTime();
		

		System.out.println("Running time for size 131072 with 4 threads is: "+ (end-start));
		readData(list,path);

		
		
		int sample12[] = new int[1048576];
		String string12= "1048576.txt";
		readData(sample12, string12);
		BucketSort X12=new BucketSort(sample12.length);
		start=System.nanoTime();
		X.sort(sample12, 0);
		end=System.nanoTime();
		System.out.println();

		System.out.println("Running time for size 1048576 without thread is: "+ (end-start));
		readData(list,path);

		
		int sample13[] = new int[1048576];
		String string13 = "1048576.txt";
		readData(sample13, string13);
		BucketSort X13=new BucketSort(sample13.length);		
		start=System.nanoTime();
		X.sort(sample13, 1);
		end=System.nanoTime();
		

		System.out.println("Running time for size 1048576 with 2 threads is: "+ (end-start));
		readData(list,path);

		
		int sample14[] = new int[1048576];
		String string14 = "1048576.txt";
		readData(sample14, string14);
		BucketSort X14=new BucketSort(sample14.length);		
		start=System.nanoTime();
		X.sort(sample14, 2);
		end=System.nanoTime();
		

		System.out.println("Running time for size 1048576 with 4 threads is: "+ (end-start));
		readData(list,path);

		
		
	

		
	}
	public static int[] readData(int[] data, String path){
		Scanner scanner;
		try {
			scanner = new Scanner(new File(path));
			int read = 0;
			while(scanner.hasNextInt()){
			   data[read++] = scanner.nextInt();
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}
}