package ýnterfaceAbstractsDemo.Abstract;

import ýnterfaceAbstractsDemo.Concrete.BaseCustomerService;
import ýnterfaceAbstractsDemo.Entities.Customer;

public abstract class BaseCustomerManager implements BaseCustomerService {
	@Override
	public void save(Customer customer) {
		System.out.println("Saved to db  : " + customer.firstName);
		
	}

	

	

}
