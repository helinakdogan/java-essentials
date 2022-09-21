package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new SmsLogger(), new FileLogger(), new DatabaseLogger()};
		
		Customer customer1 = new Customer(1, "engin", "demiroğ");
		
		CustomerManager customerManager = new CustomerManager(loggers);
		customerManager.add(customer1);

		
		
		
	}

}
