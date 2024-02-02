package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new DatabaseLogger(),new EmailLogger(), new SmsLogger()};
		
		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer cem = new Customer(1,"Cem","Serdar");
		
		customerManager.add(cem);

	}

}
