package practise;

public class PrintAlternateElementsOfArray {
	public static void main(String[] args){
		String[] a = {"I","the","love","the","java"};
		int i = 0;
		while(i<a.length){
			System.out.print(a[i]+" ");
			i=i+2;
		}
		
	}

}
