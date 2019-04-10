import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 for(int i=3; i <= 8; i++){// countingSort
			 
		     int arraySize1= (int)Math.pow(2, i);
			 int [] data = new int [arraySize1];
			 File file1 = new File("Num"+arraySize1+".txt");
			 
			 countingSort is= new countingSort(readData( file1, data ));
			 
		     int [] sorteddata1=is.countSort(data,maxValue(data,data.length));
			System.out.println("Counter Num"+arraySize1+".txt countingSort "+ is.getCountS());
			
			 File fil3= new File("P"+(i-3)+"Num_CountingSort"+arraySize1+".txt"); //entire array printer 
			 printer(fil3, sorteddata1, is.getCountS());
			
			
			 }
		 
		 for(int i=3; i <= 8; i++){// radixSort
			 
		     int arraySize1= (int)Math.pow(2, i);
			 int [] data = new int [arraySize1];
			 File file1 = new File("Num"+arraySize1+".txt");
			 
			 radixSort rs= new radixSort(readData( file1, data ));
			 
		     int [] sorteddata1=rs.radix_Sort(data);
			System.out.println("Counter Num"+arraySize1+".txt radix  "+ rs.getCountRs());
			
			 File fil3= new File("P"+(i-3)+"Num_RadixSort"+arraySize1+".txt"); //entire array printer 
			 printer(fil3, sorteddata1, rs.getCountRs());
			
			
		 }
        
		 for(int i=3; i <= 8; i++){// bucketSort
			 
		     int arraySize1= (int)Math.pow(2, i);
			 int [] data = new int [arraySize1];
			 File file1 = new File("Num"+arraySize1+".txt");
			 
			 bucketSort bs= new bucketSort(readData( file1, data ));
			 
		     int [] sorteddata1=bs.bucket_Sort(data, data.length);
			System.out.println("Counter Num"+arraySize1+".txt bucketSort  "+ bs.getCounterBs());
			
			 File fil3= new File("P"+(i-3)+"Num_BucketSort"+arraySize1+".txt"); //entire array printer 
			 printer(fil3, sorteddata1, bs.getCounterBs());
			
			
		 }

	}
	
	 public static int[] readData( File A, int [] Arr ){
		    int i=0;
		 
	        try {
			Scanner inputStream= new Scanner(A);

			while(inputStream.hasNext())
			{ 
				
			   Arr[i++]= (int)inputStream.nextInt();
			
		    }
			inputStream.close();
			
		    } catch (FileNotFoundException e) {
			e.printStackTrace();
	        }
		
		return Arr;
		
	     }	
	 
	 public static void printer(File f1, int [] Arr , int count){ // O(n)  print entire sorted array
			PrintWriter prints = null;
			int  [] m= Arr;
			
			try{
				prints = new PrintWriter(f1);
					
				
					for(int i=0;i<Arr.length;i++){
						
						if (i==0){
					    	prints.print("[ counter: "+count+" ] ");// counter for each algorithm
					    	System.out.print("[ counter: "+count+" ] ");
					   }
						
				    	prints.print(m[i]+" ");
				    	System.out.print(m[i]+" ");
			          }
					
					System.out.println("file.txt printed");
					
			 prints.close();
			}
			
			catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
			
		}
		
	public static int maxValue(int [] A, int n){
			    int max = A[0];
			    for (int i = 1; i < n; i++){
			        if (A[i] > max)
			            max = A[i];
			    }
			    return max;
	}
		
}
