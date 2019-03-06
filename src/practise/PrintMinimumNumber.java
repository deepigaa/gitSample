package practise;

public class PrintMinimumNumber {
	public int findMinNum(int[] a){
		int min=a[0];
		for(int i = 0;i<a.length;i++){
			if(min>a[i]){
				min=a[i];
			}
		}
			return min;
	}
	
	public static void main(String[] args){
		int[] arr = {4,2,9,13,8,4,3,3,11};
		//int[] arr={3};
		PrintMinimumNumber min = new PrintMinimumNumber();
		System.out.println("The minimum number is : "+min.findMinNum(arr));
		
		
	}


}
