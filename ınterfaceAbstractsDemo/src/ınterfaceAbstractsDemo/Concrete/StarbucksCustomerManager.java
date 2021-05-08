package ýnterfaceAbstractsDemo.Concrete;

import ýnterfaceAbstractsDemo.Abstract.BaseCustomerManager;
import ýnterfaceAbstractsDemo.Abstract.CustomerCheckService;
import ýnterfaceAbstractsDemo.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService)
	{
		this.customerCheckService = customerCheckService;
	}
 
	 public void save(Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer)) {
		 super.save(customer);

	}
		else {
		System.out.println("Geçersiz kiþi");
	}
	 
	 }
}

