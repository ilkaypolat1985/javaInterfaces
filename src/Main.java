public class Main {

    public static void main(String[] args) {
        CustomerDAL customerDAL = new MySQLCustomerDAL();
        customerDAL.add();
    }
}
