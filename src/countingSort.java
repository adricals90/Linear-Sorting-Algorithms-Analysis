
public class countingSort {
	
	int [] B ;
	int [] A ;
	int countS=0;
	public countingSort ( int [] c){
		A=c;
		B= new int[c.length];
	}	
	public int getCountS(){
		return  countS;
	}
	
	public int [] countSort(int [] A, int Size){
		int [] c= new int[Size+1];
		
		 for (int i= 0;i<= Size;i++) {
			 c[i]=0;
		 }
		 
		 for (int j =0;j<A.length;j++){
			 c[A[j]]= c[A[j]]+1;
		 }
		
		 for(int i=1; i<=Size;i++){
			 c[i]=c[i]+c[i-1];
		 }
		 
		 for(int j= A.length-1;j>=0;j--){
			 countS++;
			 B[c[A[j]]-1]=A[j];
			 c[A[j]]=c[A[j]]-1;
			 
		 }
	
			return B;
	}


}
