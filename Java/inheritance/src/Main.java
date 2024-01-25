public class Main {
  public static void main(String[] args) {
    IndividualCustomer cem = new IndividualCustomer();
    cem.customerNumber = "123";
    CorporateCustomer shopApp = new CorporateCustomer();
    shopApp.customerNumber = "456";
    SendikaCustomer abc = new SendikaCustomer();
    abc.customerNumber = "789";

    CustomerManager customerManager = new CustomerManager();

    Customer[] customers = {cem,shopApp,abc};

    customerManager.addMultiple(customers);
  }
}