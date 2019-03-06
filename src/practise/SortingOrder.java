package practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
 * Create a Order class containing orderId, amount and customer
 * Sort the order by orderid(natural order)-->Comparable
 * Sort the order in descending order(reverseOrder)-->Collections.reverseOrder()
 * Sort the order by amount-->Comparator--Inner class
 * Sort the order by customer-->Comparator--Inner class
 * 
 */

public class SortingOrder {
	public static void main(String[] args){
		//create a list of orders
		List<Order> orders = new ArrayList<Order>();
		
		//add the order objects to the collection
		orders.add(new Order(102,1000,"amit"));
		orders.add(new Order(101,2008,"deepu"));
		orders.add(new Order(103,988,"deepti"));
		
		System.out.println("Unsorted Collection:");
		for(Order ord: orders){
			System.out.println(ord);
		}
		
		System.out.println();
		
		//Sort the order by orderid(natural order)-->Comparable
		System.out.println("Sorting by natural order(order id): ");
		Collections.sort(orders);
		for(Order ord: orders){
		System.out.println(ord);
		}
		
		System.out.println();
		
		//Sort the order in descending order(reverseOrder)-->Collections.reverseOrder()
		System.out.println("Sorting in reverse order (order id): ");
		Collections.sort(orders,Collections.reverseOrder());
		for(Order ord: orders){
			System.out.println(ord);
		}
		
		System.out.println();
		
		//Sort the order by amount-->Comparator--Inner class
		System.out.println("Sorting by amount: ");
		Collections.sort(orders,new Order.OrderByAmount());
		for(Order ord: orders){
			System.out.println(ord);
		}
		
		System.out.println();
		
		//Sort the order by customer-->Comparator--Inner class
		System.out.println("Sorting by customer: ");
		Collections.sort(orders,new Order.OrderByCustomer());
		for(Order ord: orders){
			System.out.println(ord);
		}

	}
	
	
}
