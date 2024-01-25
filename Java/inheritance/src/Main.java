public class Main {

  public static void main(String[] args) {
    IndividualCustomer cem = new IndividualCustomer();
    cem.customerNumber = "123";
    CorporateCustomer shopApp = new CorporateCustomer();
    shopApp.customerNumber = "456";

    CustomerManager customerManager = new CustomerManager();
    customerManager.add(cem);
    customerManager.add(shopApp);
  }
}
