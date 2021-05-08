package �nterfaceAbstractsDemo.Concrete;

import �nterfaceAbstractsDemo.Abstract.BaseCustomerManager;
import �nterfaceAbstractsDemo.Abstract.CustomerCheckService;
import �nterfaceAbstractsDemo.Entities.Customer;

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
		System.out.println("Ge�ersiz ki�i");
	}
	 
	 }
}

