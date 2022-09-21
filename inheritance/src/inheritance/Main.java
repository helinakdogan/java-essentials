package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer individualCustomer1 = new IndividualCustomer();
        individualCustomer1.customerNumber = "123";
		CorporateCustomer corporateCustomer1 = new CorporateCustomer();
		corporateCustomer1.customerNumber = "456";
		
		Customer[] customers = {individualCustomer1, corporateCustomer1};
		
	
		CustomerManager customerManager = new CustomerManager();
		customerManager.addMultiple(customers);
		System.out.println(); 
		customerManager.add(individualCustomer1);
		System.out.println();
		customerManager.add(new IndividualCustomer());
		
	}
}
