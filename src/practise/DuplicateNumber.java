package practise;


import java.util.ArrayList;
import java.util.List;

/*
 * find the duplicate number between 1 to N numbers 
 * since 1 to N is of growing size, declare a list to hold numbers
 * n=highestInteger(list.size()-1)
 * formula: total-highestInteger*(highestInteger+1)/2
 */

public class DuplicateNumber {
	public int findDuplicateNumber(List<Integer> numbers){
		int highestInteger = numbers.size()-1;
		int total = getSum(numbers);
		
		int duplicate=total - (highestInteger*(highestInteger+1)/2);
	    return duplicate;
	}
	public static int getSum(List<Integer> numbers){
		int sum=0;
		for(int num:numbers){
			sum+=num;
		}
		return sum;
	}
	

	public static void main(String[] args){
		//get 1 to N numbers
		List<Integer> list = new ArrayList<Integer>();
		//adding numbers from 1 to 29
		for(int i = 1;i<30;i++){
			list.add(i);
			
		}
		//adding the duplicate number, so the size of list is 30
		list.add(42);
		DuplicateNumber dn = new DuplicateNumber();
		//find the duplicate number by passing the list
		System.out.println("The duplicate number is : "+dn.findDuplicateNumber(list));
		
		
	}
}
