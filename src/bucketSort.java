
public class bucketSort {

	int[] A;
	int countBs=0;
	bucketSort(int [] c){
		A=c;
	}
	
	public int getCounterBs(){
		return countBs;
	}
	
	public int [] bucket_Sort(int A[], int n){
                               

		int min = A[0];
    	int max = min;
    	for( int i = 1; i < n; i++ )           // Find min and max
    		if( A[i] > max )
    			max = A[i];
    		else if( A[i] < min )
    			min = A[i];

    	int B[] = new int[max-min+1];          // Create buckets
    
    	for( int i = 0; i < n; i++ ){          // fill buckets
    		B[A[i]-min]++;                     // by counting each datum
    	}
    	
    	int i = 0;                                  
    	for( int b = 0; b < B.length; b++ ) {   //  buckets
    		for( int j = 0; j < B[b]; j++ ){     // back into array
    			A[i++] = b+min;    
    			countBs++;
    		}
    	}// by creating one per count
    
    return A;
    
    }

	
}
