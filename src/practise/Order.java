package practise;

import java.util.Comparator;

/*
 * Create a Order class containing orderId, amount and customer
 * Sort the order by orderid(natural order)-->Comparable
 * Sort the order in descending order(reverseOrder)-->Collections.reverseOrder()
 * Sort the order by amount-->Comparator--Inner class
 * Sort the order by customer-->Comparator--Inner class
 * Override the toString method to print the String representation of object
 * 
 */

public class Order implements Comparable<Order>{
	//Create a Order class containing orderId, amount and customer
	private int orderId;
	private int amount;
	private String customer;
	
	//constructor
	public Order(int orderId, int amount, String customer){
		this.orderId = orderId;
		this.amount = amount;
		this.customer = customer;
	}
	
	//getters method
	public int getOrderId(){
		return orderId;
	}
	public int getAmount(){
		return amount;
	}
	public String getCustomer(){
		return customer;
	}
	
	//setters method
	public void setOrderId(int orderId){
		this.orderId = orderId;
	}
	
	public void setAmount(int amount){
		this.amount = amount;
	}
	
	public void setCustomer(String customer){
		this.customer = customer;
	}
	
	// Sort the order by orderid(natural order)-->Comparable
	@Override
	public int compareTo(Order o){
		return this.orderId>o.orderId?1:(this.orderId<o.orderId?-1:0);
	}
	
	//Sort the order by amount-->Comparator--Inner class
	public static class OrderByAmount implements Comparator<Order>{
		@Override
		public int compare(Order o1,Order o2){
			return o1.amount>o2.amount?1:(o1.amount<o2.amount?-1:0);
		}
	}
	
	//Sort the order by customer-->Comparator--Inner class
	public static class OrderByCustomer implements Comparator<Order>{
		@Override
		public int compare(Order o1,Order o2){
			return o1.customer.compareTo(o2.customer);
		}
	}
	
	//Override the toString method to print the String representation of object
	public String toString(){
		return this.orderId+ "---" +this.amount+  "----"+this.customer;
	}

}
