public class CustomerManager {
    public void add(Customer customer) {  //extend edeb sınıfların referanslarını tutabilir
        System.out.println(customer.customerNumber + " Kaydedildi");
    }

    //bulk insert
    public void addMultiple(Customer[] customers){
        for(Customer customer : customers){
            add(customer);
        }
    }
}