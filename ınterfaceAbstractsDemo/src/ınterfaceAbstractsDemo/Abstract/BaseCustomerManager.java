package �nterfaceAbstractsDemo.Abstract;

import �nterfaceAbstractsDemo.Concrete.BaseCustomerService;
import �nterfaceAbstractsDemo.Entities.Customer;

public abstract class BaseCustomerManager implements BaseCustomerService {
	@Override
	public void save(Customer customer) {
		System.out.println("Saved to db  : " + customer.firstName);
		
	}

	

	

}
