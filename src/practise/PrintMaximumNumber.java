package practise;

public class PrintMaximumNumber {
	public int findMaxNum(int[] a){
		int max=a[0];
		if(a.length==1){
			return max;
		}else{
			for(int i = 0;i<a.length;i++){
				if(max<a[i]){
					max=a[i];
				}
			}
			return max;
		}
	}
	public static void main(String[] args){
		int[] arr = {1,2,9,13,8,4,13,3,11};
		//int[] arr={3};
		PrintMaximumNumber max = new PrintMaximumNumber();
		System.out.println("The maximum number is : "+max.findMaxNum(arr));
		
		
	}

}
