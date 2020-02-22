package project;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class MainMerge {

	public static void main(String[] args) {
		
		int sample[] = new int[16];
		String string = "16.txt";
		readData(sample, string);
		System.out.println("Random Array with size 16");
		System.out.println(Arrays.toString(sample));
		MergeSort.sort(sample, 0);
		System.out.println("Sorted Array with Merge Sort");
		System.out.println(Arrays.toString(sample));
		System.out.println();
		
	int []list=new int[16];
	int []list1=new int[512];
	int []list2=new int[8192];
	int []list3=new int[131072];
	int []list4=new int[1048576];
		
	String path ="16.txt";
	String path1="512.txt";
	String path2="8192.txt";
	String path3="131072.txt";
	String path4="1048576.txt";
		
	readData(list,path);
	readData(list1,path1);
	readData(list2,path2);
	readData(list3,path3);
	readData(list4,path4);
	
			
	long start=System.nanoTime();
	MergeSort.sort(list, 0);
	long end=System.nanoTime();
	System.out.println("Running time for size 16 without thread is: "+ (end-start));
	readData(list,path);
	
	start=System.nanoTime();
	MergeSort.sort(list, 1);
	end=System.nanoTime();
	System.out.println("Running time for size 16 with thread is: "+ (end-start));
	readData(list,path);
	
	System.out.println();
	
	start=System.nanoTime();
	MergeSort.sort(list1, 0);
	end=System.nanoTime();
	System.out.println("Running time for size 512 without thread is: "+ (end-start));
	readData(list,path);
	
	start=System.nanoTime();
	MergeSort.sort(list1, 1);
	end=System.nanoTime();
	System.out.println("Running time for size 512 with thread is: "+ (end-start));
	readData(list,path);
	
	System.out.println();
	
	start=System.nanoTime();
	MergeSort.sort(list2, 0);
	end=System.nanoTime();
	System.out.println("Running time for size 8192 without thread is:"+ (end-start));
	readData(list,path);
	
	start=System.nanoTime();
	MergeSort.sort(list2, 1);
	end=System.nanoTime();
	System.out.println("Running time for size 8192 with thread is: "+ (end-start));
	readData(list,path);
	
	System.out.println();
	
	start=System.nanoTime();
	MergeSort.sort(list3, 0);
	end=System.nanoTime();
	System.out.println("Running time for size 131072 without thread is: "+ (end-start));
	readData(list,path);
	
	start=System.nanoTime();
	MergeSort.sort(list3, 1);
	end=System.nanoTime();
	System.out.println("Running time for size 131072 with thread is: "+ (end-start));
	readData(list,path);
	
	System.out.println();
	
	start=System.nanoTime();
	MergeSort.sort(list4, 0);
	end=System.nanoTime();
	System.out.println("Running time for size 1048576 without thread is: "+ (end-start));
	readData(list,path);
	
	start=System.nanoTime();
	MergeSort.sort(list4, 1);
	end=System.nanoTime();
	System.out.println("Running time for size 1048576 with thread is: "+ (end-start));
	
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