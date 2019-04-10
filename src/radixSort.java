
public class radixSort {
	int countR=0;
	int [] A;
	int [] B;
	public radixSort(int [] c){
		A=c;
		B= new int[c.length];
		
	}
	
	public int getCountRs(){
		return countR;
	}
	
	public  int []  radix_Sort(int []A){
		
		 
		int decimalP = 1;
		B = new int[A.length];
		int size = maxValue(A, A.length);
		int d = (int) Math.log10(size) + 1; // get the number of digits
			
		 for (int k =0; k<d;k++ ){

			int [] c= new int[size+1];
			
			 for (int i= 0;i<= size;i++) {
				 c[i]=0;
			 }
			 
			 for (int j =0;j<A.length;j++){
				 c[(A[j]/decimalP)%10]= c[(A[j]/decimalP)%10]+1;

			 }
			 
			 for(int i=1; i<=size;i++){
				 c[i]=c[i]+c[i-1];
			 }
			 
			 for(int j= A.length-1;j>=0;j--){
				 countR++;
				 B[c[(A[j]/decimalP)%10]-1]=A[j];
				 c[(A[j]/decimalP)%10]=c[(A[j]/decimalP)%10]-1;

			 }
			 
			 for (int i = 0; i <= A.length-1; i++){
		            A[i] = B[i];}
			 
			 decimalP= decimalP*10;
			 
		 }
		 
		 return A;
		  
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
