public class CustomerManager {
    private CustomerDAL customerDAL;

    public CustomerManager(CustomerDAL customerDAL) {
        this.customerDAL = customerDAL;
    }

    public void add(){
        // Business codes
        customerDAL.add();
    }

    public CustomerDAL getCustomerDAL() {
        return customerDAL;
    }

    public void setCustomerDAL(CustomerDAL customerDAL) {
        this.customerDAL = customerDAL;
    }
}
