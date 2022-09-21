package inheritance;

import java.util.Iterator;

public class CustomerManager {
	public void add(Customer customer) {
		 System.out.println(customer.customerNumber + " eklendi");
	}
	
	public void addMultiple(Customer[] customers) {
		for (Customer customer : customers) {
			add(customer);
		}
	}
	
	
	//add() -> Customer türünden bir şey çağırırsam -> onun nosunu yazdırır
	//addMultiple() -> Customer türünde bir dizi çağırırsam -> dizinin içindeki her eleman için add()'i çağırır *bulk insert
}
