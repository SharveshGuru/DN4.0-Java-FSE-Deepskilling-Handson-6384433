public class CustomerService {
    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void  getCustomerDetails(int id) {
        System.out.println("Customer Details: "+customerRepository.findCustomerById(id));
    }
}
