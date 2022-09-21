package interfaces;

public class CustomerManager {
	
	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("müşteri eklendi : " + customer.getFirstName()+ " " + customer.getLastName());
		Utils.runLoggers(loggers, customer.getFirstName()+ " " + customer.getLastName());
				
	}
	
    public void delete(Customer customer) {
    	System.out.println("müşteri silindi: " + customer.getFirstName()+ " " + customer.getLastName());
    	Utils.runLoggers(loggers, customer.getFirstName()+ " " + customer.getLastName());
	}

}
